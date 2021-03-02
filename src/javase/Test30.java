package javase;


import java.util.Arrays;

/**
 * 类的加载机制
 * 双亲委派机制，逐层往上走
 *
 * 1./jre/lib BootstrapClassLoader
 * 2./jre/lib/ext ExtClassLoad
 * 3.项目加载的第三方jar和自己编写的类 AppClassLoader
 * 加载原则：从下网上 3-2-1  若找到了，不会之间加载，而是会继续往上，直到最高层，最高层有
 * 就直接加载，没有就在最下一层找到的地方加载，若3层都没抛出classNotFoundException的异常信息
 * @author 路飞
 * @create 2021/3/2 10:56
 */
public class Test30 {
    public static void main(String[] args) throws ClassNotFoundException {
        //尝试失败，使用的还是JDK默认的
        String s = "1";
        System.out.println(s.getClass().getClassLoader()); //null 有但Java无法访问和修改，是用C语言写的

        FinalTestClass finalTestClass = new FinalTestClass();
        System.out.println(finalTestClass.getClass().getSimpleName()); //sun.misc.Launcher$AppClassLoader@18b4aac2

        Class<?> aClass = Class.forName("javase.Test29");
        System.out.println(aClass.getClass().getClassLoader()); //ClassNotFoundException

        //finalTestClass.getClass().getSimpleName(); 打印类加载信息
        System.out.println(finalTestClass.getClass().getClassLoader().getParent()); //Ext
        System.out.println(finalTestClass.getClass().getClassLoader().getParent().getParent()); //null


    }
}
