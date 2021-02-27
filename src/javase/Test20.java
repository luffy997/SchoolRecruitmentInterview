package javase;

/**
 * 异常处理体系
 * AVA内存泄漏和内存溢出的区别和联系这篇博客讲的不错
 * https://blog.csdn.net/mashuai720/article/details/79557670
 * @author 路飞
 * @create 2021/2/27 12:17
 */
public class Test20 {

    /**
     *Java异常体系:
     * 顶层是：Throwable
     * 第二层：Error Exception
     * error是JVM的错误，常见的有栈内存溢出（递归，大量循环或死循环，全局变量过多，数组、List、map数据是否过大），
     * 堆内存溢出（大量对象占据了堆空间，这些对象都持有强引用导致无法回收，当对象大小之和大于Xmx参数指定的堆空间时就会发生堆溢出）
     * Exception 分RuntimeException和非运行时异常
     * 这里一定要分清楚，当问到非运行时异常时一定不要把运行时异常也说出来
     * RuntimeExcepion LogincException 说白了就是程序员代码写的有问题
     * 比如：数组越界 空指针异常 算术异常 类型转换异常 数字格式转换异常
     * 调用可能出现的问题
     * 非运行时异常：IOException SQLException FileNotFoundException NoSuchFileException NoSunMethodException
     */
    public static void main(String[] args) {
        throw new RuntimeException();
    }
}
