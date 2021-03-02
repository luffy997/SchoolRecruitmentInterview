package javase;

/**
 * String
 *  == equals final
 *  1.== 比较的是值
 *  比较基本数据类型时，比较的是数值 byte，short，char，int，float，double，long，boolean
 *  他们作为常量在方法区中的常量池以HashSet的策略存储,栈中的数据可以共享,所以基本数据类型和String常量是可以之间通过==来比较的
 *  比较引用类型：比较引用指向的地址
 *  2.equals
 *  默认比较地址，该方法最初定义在Object上，默认的实现就是比较地址
 *  自定义的类，如果需要比较的是内容，就需要重写String的equals方法
 *  分析：
 *  JVM在存储基本数据类型的时候是放在栈里的栈帧的，放引用类型就是通过栈指向堆，也就是说引用类型至少有两个地方存储
 * @author 路飞
 * @create 2021/2/26 10:16
 */
public class Test01 {
    public static void main(String[] args) {

        /**
         * 1.String str = "abc" 的创建过程
         * 1 首先在常量池中查找是否存在内容为"abc"字符串对象
         * 2 如果不存在则在常量池中创建"abc"，并让str引用该对象
         * 3 如果存在则直接让str引用该对象
         */
        String str = "abc"; //引用常量池的对象

        /**
         * 2.String str = new String("abc")创建实例的过程 引用堆中的对象
         * 1.首先在堆中（不是常量池）创建一个指定的对象"abc"，并让str引用指向该对象
         * 在字符串常量池中查看，是否存在内容为"abc"字符串对象
         * 若存在，则将new出来的字符串对象与字符串常量池中的对象联系起来
         * 若不存在，则在字符串常量池中创建一个内容为"abc"的字符串对象，并将堆中的对象与之联系起来
         * intern 方法可以返回该字符串在常量池中的对象的引用，可以通过下面代码简单的测试
         * 当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（用 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String 对象的引用。
         * 它遵循以下规则：对于任意两个字符串 s 和 t ，当且仅当  s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true 。
         */
        String str1 = "abc";
        String str2 = new String("abc").intern();
        System.out.println(str1 == str2);


        /**
         *3.String str1 = "abc"; String str3 = "ab" + "c"; str1==str2是ture
         * str2会找常量池中是否存在"abc"，如果存在就把str2指向str1，显然str1已经在常量区创建了"abc",== 是对于引用类型是比较地址，所以str1 和
         * str2 都指向"abc",结果为true
         */
        String str3 = "ab" + "c";
        System.out.println(str1 ==  str3);

        /**
         * 4.String str1 = "abc"; String str2 = "ab"; String str3 = str2 + "c"; str1==str3是false
         * 是因为String str3 = str2 + "c"涉及到变量（不全是常量）的相加，所以会生成新的对象，其内部实现是先new一个StringBuilder，
         * 然后 append(str2),append("c");然后让str3引用toString()返回的对象
         */
        String str4 = "ab";
        String str5 = str4 + "c";
        System.out.println(str5 == str1);

        /**
         * 5.String str1 = "abc"; String str2 = "abc"; System.out.println(str1==str2);  //true
         * 我们知道用equals比较str1和str2是毫无疑问返回true的，因为equal默认比较的是引用地址
         * ==对于引用类型也是比较地址，str1 str2 常量存放在常量区，上文也已经提到str1和str2的创建过程，先看常量区是否
         * 存在"abc",若有就不创建了，之间让str2应用该地址，若无则创建，可以看到str1和str2都是指向的该地址，故==返回
         * true
         */
        System.out.println(str1 == str2);

        /**
         * 6.String str1 = "abc";String str2 = "abc";str1 = "bcd";System.out.println(str1 + "," + str2);  //bcd, abc
         * System.out.println(str1==str2);  //false
         * 这就是说，赋值的变化导致了类对象引用的变化，str1指向了另外一个新对象！而str2仍旧指向原来的对象。上例中，当我们将str1的值改为"bcd"时，
         * JVM发现在 常量池中没有存放该值的地址，便开辟了这个地址，并创建了一个新的对象，其字符串的值指向这个地址。
         */
        str1 = "bcd";
        System.out.println(str1 + "," + str2);
        System.out.println(str1 == str2);

        /**
         * 7.常量池中不仅仅是对于基本数据类型是以HashSer策略存储的，对于String也是一样，一个常量只会对于一个地址
         */
        //这里我们已经把str1 指向"bcd"
        String str6 = str1;
        System.out.println(str6);
        String str7 = "bcd";
        System.out.println(str1 == str7);

        /**
         * 8.new会之间在堆中创建对象，所以str8的引用也是指向的堆中的对象
         * str8是常量区的，即使数据相同，也不会返回true
         */
        String str8 = new String("abc");
        String str9 = "abc";
        System.out.println(str8 == str9);

    }
}
