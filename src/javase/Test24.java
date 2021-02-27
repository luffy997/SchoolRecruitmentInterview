package javase;

/**
 * 线程的生命周期
 * @author 路飞
 * @create 2021/2/27 16:52
 */
public class Test24 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task());
        System.out.println(thread.getState()); //new
        thread.start();
        System.out.println(thread.getState()); //RUNNABLE
        //保险起见，休眠主线程10ms
        Thread.sleep(10);
        System.out.println(thread.getState()); //TERMINATED
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}