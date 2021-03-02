package javase;

/**
 * ThreadLocal解决了什么问题？内部源码是怎么样的？
 *
 * 作用：为每个线程创建一个副本
 *实现在线程的上下文传递同一个对象，比如connection
 *
 *ThreadLoacal源码分析
 *public T get() {
 *         Thread t = Thread.currentThread();
 *         ThreadLocalMap map = getMap(t);
 *         if (map != null) {
 *             ThreadLocalMap.Entry e = map.getEntry(this);
 *             if (e != null) {
 *                 T result = (T)e.value;
 *                 return result;
 *             }
 *         }
 *         return setInitialValue();
 *     }
 *
 * public T get() {
 *         Thread t = Thread.currentThread();
 *         ThreadLocalMap map = getMap(t);
 *         if (map != null) {
 *             ThreadLocalMap.Entry e = map.getEntry(this);
 *             if (e != null) {
 *                 T result = (T)e.value;
 *                 return result;
 *             }
 *         }
 *         return setInitialValue();
 *     }
 *
 * 调用set，把map中存入以线程对象为key，传入的值为value的对象
 * 调用get，从map中取出线程对象为key的value
 * 不同的线程，不同的map
 *
 * @author 路飞
 * @create 2021/3/2 10:13
 */
public class Test29 {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        //开启多个线程来执行任务
        Task task = new Task();
        new Thread(task).start();
        Thread.sleep(10);
        new Thread(task).start();


    }

    static class Task implements Runnable{

        @Override
        public void run() {
            Long result = threadLocal.get();
            if(result == null){
                threadLocal.set(System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName() + "-->"+threadLocal.get());
            }
        }
    }
}
