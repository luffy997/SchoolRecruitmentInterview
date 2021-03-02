package javase;

/**
 * Servlet的生命周期
 * Servlet是单例的
 * 生命周期的流程：
 * 创建对象->初始化->service()->doXXX()->销毁
 *
 * 创建对象的时机：
 * 1.默认是第一次访问该Servlet的时候创建
 * 2.也可以通过配置web.xml，来改变创建的时机，比如在容器启动的时候去创建，
 * DispatcherServlet(SpringMVC前端控制器)就是一个例子
 * <load-on-startup>1</load-on-startup>
 *
 * 3.执行的次数
 * 对象的创建只有一次，单例
 * 初始一次
 * 销毁一次
 *
 * 4.构成线程不安全的三个因素：
 * （1).多线程环境下（有多个客户端，同时访问Servlet）
 * （2).多分线程共享资源，比如一个单例对象（Servlet是单例的）
 * （3).这个单例对象是有状态的（比如在Servlet方法中采用全局变量，并且以改变了的运算结果作为下一步操作的判断依据）
 * @author 路飞
 * @create 2021/3/2 13:45
 */
public class Test31 {
}
