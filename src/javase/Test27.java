package javase;

/**
 * Sleep和wait的区别
 * 1.所属的类不同
 * Sleep定义在Thread上
 * wait定义在Object上
 *
 * 2.对锁的处理方式不一样
 * Sleep不释放锁
 * wait释放锁
 *
 * 3.使用范围
 * Sleep可以使用在任何代码块中
 * wait必须在同步方法或者同步代码块中
 *
 * 4.与wait配套使用的方法
 * void notify()
 * 唤醒在此对象监视器上等待的单个线程（随机）
 * void notifyAll()
 * 唤醒在此对象监视器上等待的所有线程
 * void wait()
 * 导致当前的线程等待，直到其他线程调用此对象的notify( ) 方法或 notifyAll( ) 方法
 *
 * 生命周期
 *
 * 1，当线程调用wait()或者join时，线程都会进入到waiting状态，当调用notify或notifyAll时，或者join的线程执行结束后，会进入runnable状态
 *
 * 2，当线程调用sleep(time)，或者wait(time)时，进入timed waiting状态，
 *
 * 为什么wait要定义在Object中，而不定义在Thread中？
 * 回想下，在同步代码块中，我们说需要一个对象锁来实现多线程的互斥效果，也就是说，Java的锁是对象级别的，而不是线程级别的。
 *
 * 为什么wait必须写在同步代码块中？
 *原因是避免CPU切换到其他线程，而其他线程又提前执行了notify方法，那这样就达不到我们的预期（先wait再由其他线程来唤醒），所以需要一个同步锁来保护
 *
 * @author 路飞
 * @create 2021/3/2 9:44
 */
public class Test27 {
}
