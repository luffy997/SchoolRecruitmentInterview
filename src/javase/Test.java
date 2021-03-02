package javase;

/**
 * @author 路飞
 * @create 2021/2/27 19:31
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        String s3 = new String("123");

        int i =  1;
        int j = 1;


        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
