package javase;

import java.util.Vector;

/**
 * Arraylist Vector
 * ArrayList：线程不安全，效率高，常用
 * Vector：线程安全。效率低
 * @author 路飞
 * @create 2021/2/26 21:44
 */
public class Test14 {
    public static void main(String[] args) {

        /**
         * 加入了sync
         *     public synchronized void ensureCapacity(int minCapacity) {
         *         if (minCapacity > 0) {
         *             modCount++;
         *             ensureCapacityHelper(minCapacity);
         *         }
         *     }
         */
        Vector<String> vector = new Vector<>();


    }
}
