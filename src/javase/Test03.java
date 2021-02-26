package javase;

/**
 * String StingBuilder StringBuffer
 * String 是final修设的不可变对象，所以每次操作都会new一个String对象，很消耗性能
 * 为此遇到字符串拼接的时候，我们可以使用StringBuilder或者StringBuffer
 * 两种有什么区别码？、
 * StringBuilder线程不安全你，性能高于StringBuffer
 * StringBuffer线程安全（加入sync锁），性能低于StringBuilder
 * @author 路飞
 * @create 2021/2/26 12:47
 */
public class Test03 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        stringBuilder.append("1");
    }

    //这里不得不提到什么时候用到StringBuilder StringBuffer
    //多线程环境下，若变量是作为局部变量，每个线程进来都会new 一个，这时就不会出现
    //线程不安全的情况，考虑效率我们优先选择这里不得不提到什么时候用到StringBuilder
    //若变量作为全局变量，所有的线程都操作一个，就需要加入sync来保证线程安全，我们选择StringBuffer

}
