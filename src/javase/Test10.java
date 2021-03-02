package javase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList和LinkedList的区别
 * @author 路飞
 * @create 2021/2/26 17:42
 */
public class Test10 {
    /**
     * 1.底层数据结构的差异
     * ArrayList，数组，连续的内存空间
     * LinkedList，双向链表，不是连续的内存空间
     *
     * 2.一个常规的结论
     * Arraylist，查找快，因为是连续的内存空间，方便寻址，但删除插入慢，因为
     * 发生数据迁移
     * LinkedList,查找慢，因为需要通过指针一个个寻找，但删除，插入快，只需要改变前后节点的指针
     * 指向即可
     */

    /**
     * ArrayList -> a,b,c,d
     * LinkedList -> a,b,c,d
     * 查找这块，我们可以进一步细分
     * (1)查找第n个元素
     * Arraylist更快，连续的内存空间，可计算偏移量
     * Linkedlist不连续，只能一个一个的往下找
     * (2)查找list中的n元素
     * 都只能遍历查找，所以两者差别小
     */

    /**
     * 插入这块
     * (1)在头部插入和中间插入，Linkedlist效率更高，Linkedlist是连续的内存空间，只需要改变节点的前驱节点和后继节点即可
     * Arraylist由于是连续的内存地址，当面临插入时，就成为它的劣势，需要进行数组扩容和整体数据的移动，耗时
     * (2)在尾部插入时，两者区别不大，Arraylist只需把添加元素放到数组的末尾即可，LinkedList维护首部和尾部两个指针
     * 当插入尾部时，只需要改变尾部元素的信息即可
     */
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


         //Arraylist的初始容量是10，当容量不够时进行扩容，1.5倍扩容（位运算）


        /**
         * Default initial capacity.
         */
       // private static final int DEFAULT_CAPACITY = 10;

        /**
         *   private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + (oldCapacity >> 1);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         // minCapacity is usually close to size, so this is a win:
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         */


        /**
         * LinkedList
         * 修改最后一个节点或者第一个节点，那么就很快（first，last）
         *
         * 修改其他位置，如果是按坐标来定位节点，则会按照二分查找法，源码如下：
         *
         *  if (index < (size >> 1)) {
         *             Node<E> x = first;
         *             for (int i = 0; i < index; i++)
         *                 x = x.next;
         *             return x;
         *         } else {
         *             Node<E> x = last;
         *             for (int i = size - 1; i > index; i--)
         *                 x = x.prev;
         *             return x;
         *         }
         *     }
         */
    }
}
