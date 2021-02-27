package javase;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方法
 * 1、采用实现Runnable、Callable接口的方式创建多线程时，
 *
 * 优势是：
 *
 * 线程类只是实现了Runnable接口或Callable接口，还可以继承其他类。
 *
 * 在这种方式下，多个线程可以共享同一个target对象，所以非常适合多个相同线程来处理同一份资源的情况，从而可以将CPU、代码和数据分开，形成清晰的模型，较好地体现了面向对象的思想。
 *
 * 劣势是：
 *
 * 编程稍微复杂，如果要访问当前线程，则必须使用Thread.currentThread()方法。
 *
 * 2、使用继承Thread类的方式创建多线程时，
 *
 * 优势是：
 *
 * 编写简单，如果需要访问当前线程，则无需使用Thread.currentThread()方法，直接使用this即可获得当前线程。
 *
 * 劣势是：
 *
 * 线程类已经继承了Thread类，所以不能再继承其他父类。
 *
 * 3、Runnable和Callable的区别
 *
 * (1) Callable规定（重写）的方法是call()，Runnable规定（重写）的方法是run()。
 *
 * (2) Callable的任务执行后可返回值，而Runnable的任务是不能返回值的。
 *
 * (3) call方法可以抛出异常，run方法不可以。
 *
 * (4) 运行Callable任务可以拿到一个Future对象，表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。通过Future对象可以了解任务执行情况，可取消任务的执行，还可获取执行结果。
 *
 * @author 路飞
 * @create 2021/2/27 16:14
 */
public class Test22 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Mythread mythread = new Mythread();
        //不是mythread.run();
//        mythread.start();
        FutureTask futureTask = new FutureTask(new Mytask2());
        new Thread(futureTask).start();
        Object o = futureTask.get();
        System.out.println(o);
    }
}

//1.继承Thread 重写run，调用start
class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"启动了");
    }
}

//2.实现Runable接口，重写run，开启线程需要把Runnable实现类丢入Thread中
class Mytask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"启动了");
    }
}

//3.实现Callable接口，new mytask2 把它丢入Fulture，在把Fulture丢入Thread中，调用start
class Mytask2 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"启动了");
        return 1024;
    }
}
