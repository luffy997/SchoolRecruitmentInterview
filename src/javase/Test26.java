package javase;

/**
 * LinkedHashMap和HashMap的区别（重点）
 * 1.初始大小是16，如果事先知道数据量的大小，建议修改默认初始化大小。减小扩容次数，提高性能；
 * 2.最大的装载因子默认是0.75，当HashMap中元素个数达到容量的0.75时，就会扩容。容量是原先的两倍。
 * 3.HashMap底层采用链表来解决冲突。但存在一个问题，就是链表也可能过程，影响性能。
 * 于是JDK1.8对HashMap做了进一步优化，引入红黑树
 * 当链表超过8，且数组容量大于64时，链表就会转换为红黑树
 * 当红黑树节点数量小于6时，会将红黑树转换为链表
 * 因为在数据量较小的情况下，红黑树要维护自身平衡，比链表性能没有优势
 *
 * 其次，LinkedHashMap就是链表+散列表的结构，其底层采用Linked双向链表来
 * 保护节点的访问顺序，所以保证了有序性
 * @author 路飞
 * @create 2021/3/2 9:38
 */
public class Test26 {
}
