package javase;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程生命周期的测试
 * blocked，waiting，timed waiting 我们都称为阻塞状态
 *
 * 上述的就绪状态和运行状态，都表现为runnable状态
 *
 * 上述的图有些简略，下面详细说明下，线程共有6种状态：
 *
 * new，runnable，blocked，waiting，timed waiting，terminated
 *
 * 1，当进入synchronized同步代码块或同步方法时，且没有获取到锁，线程就进入了blocked状态，直到锁被释放，重新进入runnable状态
 *
 * 2，当线程调用wait()或者join时，线程都会进入到waiting状态，当调用notify或notifyAll时，或者join的线程执行结束后，会进入runnable状态
 *
 * 3，当线程调用sleep(time)，或者wait(time)时，进入timed waiting状态，
 *
 * 当休眠时间结束后，或者调用notify或notifyAll时会重新runnable状态。
 *
 * 4，程序执行结束，线程进入terminated状态
 * @author 路飞
 * @create 2021/2/27 17:09
 */
public class Test25 {
    public static void main(String[] args) throws InterruptedException {
        BlockTask task = new BlockTask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        System.out.println("t1的状态："+t1.getState());//RUNNABLE
        System.out.println("t2的状态："+t2.getState());//BLOCKED
        Thread.sleep(10);
        System.out.println(t1.getState()); //TIMED_WAITING
        Thread.sleep(1000);
        System.out.println(t1.getState()); //WAITING
    }
}

class BlockTask implements Runnable{

    @Override
    public void run() {
        //另一个线程会进入block状态
       synchronized (this){
           try {
               //目的是让线程进入watiting time状态
               Thread.sleep(100);
               //进入watiting
               wait();
               notify();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}
