package javase;

/**
 * Interger的缓存、自动拆箱和装箱
 * @author 路飞
 * @create 2021/2/26 16:55
 */
public class Test05 {
    public static void main(String[] args) {

        //new Integer() 开辟了新的一块堆内存 ==对于基本数据类型比较的是数值
        //比较引用类型比较的是地址，很显然i1 i2在堆内存的地址不一样
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1 == i2); //false

        Integer i3 = 14;
        Integer i4 = 14;
        int i5 = 14;
        Integer.valueOf(13);
        System.out.println(i3 == i4); //true Integer缓存 源码如下
        /**
         * IntegerCache.low = -128;
         * IntegerCache.high = 127;
         *  if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *  return new Integer(i);
         *  若数值在-127 - 128之间则会从缓存中拿，不会new 也就不会开辟新的堆空间，只是把值的引用指向之前
         *  存在的值而已
         *  若不在，则会new 开辟新的堆空间
         */
        System.out.println(i3 == i5); //true 自动拆箱 Integer转int ==对于基本数据类型比较的是值

        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i6 == i7); // false 超出Integer缓存范围，
        System.out.println(i6 == i8); //true

        //对于Integer的缓存机制是个大坑，
        // 阿里开发手册规定整型包装类对象之间值的比较，全部使用 equals 方法比较

        Long l9 = 100L;
        Integer i9 = 100;
        System.out.println(l9.equals(i9));
    }
}
