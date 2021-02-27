package javase;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * IO流
 * 输入输出流是相对于程序来命名的：
 * 程序读取文件信息  ---输入流
 * 程序写出数据到文件  ---输出流
 * 分:字节流 字符流
 * 字节流读取写入二进制文件 InputStream OutputStream
 * 字符流读取写入文本文件 Reader Writer
 * 为提高效率，加入缓冲流 Buffer....
 * @author 路飞
 * @create 2021/2/27 10:15
 */
public class Test18 {
    public static void main(String[] args) {
        File file = new File("f:/复习解析数据1.txt");
        File src = new File("f:/班级资料.zip");
        File desc = new File("f:/班级资料2.zip");
        try {
//            testReaderAndWriterputStream(file);
//            testFile();
            testInputAndOutputStream(src,desc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试File常用操作
     */
    public static void testFile(){
        File file = new File("f:/");
        String[] list = file.list();
        List<String> linkedList = new LinkedList<>();
        for (String str : list){
            if (str.endsWith(".mp3") || str.endsWith(".txt")){
                linkedList.add(str);
            }
        }
        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }

    /**
     * 测试字符流
     */
    public static void testReaderAndWriterputStream(File file) throws Exception {
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String content = "";
        StringBuffer sb = new StringBuffer();
        int i = 0 ;
        Scanner scanner = null;
        int sum = 0;
        //写入文件
        File fileOutput = new File("f:/处理后的文件.txt");
        fileOutput.createNewFile();
        FileWriter writer = new FileWriter(fileOutput);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        while ((content = bufferedReader.readLine())!= null){
            sb.append(content);
            if (i != 0){
                bufferedWriter.write("第"+i+"门--"+content);
                bufferedWriter.newLine();
                i++;
            }else {
                bufferedWriter.write(content);
                bufferedWriter.newLine();
                i++;
            }

            //扫描数字作为分数
            scanner = new Scanner(content);
            scanner.useDelimiter("[^1234567890]+");
            while (scanner.hasNext()){
                int temp = scanner.nextInt();
                sum += temp; //求和
            }
        }
        bufferedWriter.write("总分："+sum+"分");
        bufferedReader.close();
        reader.close();
        bufferedWriter.close();
        writer.close();
    }

    /**
     * 测试字节流--> 文件复制
     * 字节流缓冲区流读写单个字节
     * 字节流缓冲区流读写字节数组
     */
    public static void testInputAndOutputStream(File src,File desc) throws Exception {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        //单个字节写入 消耗时间：19650ms
        long start = System.currentTimeMillis();
        while ((len = bufferedInputStream.read())!= -1){
            bufferedOutputStream.write(len);
        }

        //字节数组写入 消耗时间：17119ms

//        byte[] bytes = new byte[1024];
//        while ((len = bufferedInputStream.read(bytes)) != -1){
//            bufferedOutputStream.write(bytes,0,len);
//        }

        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();

        System.out.println("消耗时间："+(end - start)+"ms");
    }
}
