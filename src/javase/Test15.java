package javase;

import java.util.Hashtable;

/**
 * HashMap Hahtabe ConcurrentHashMap
 * 这个是多线程的知识，之前博客写过，这里就不再论述，知识做个复习的标记而已
 * HashMap 是 Hashtable 的轻量级实现（非线程安全的实现），他们都完成了 Map 接口，主要
 * 区别在于 HashMap 允许空（null）键值（key）,由于非线程安全，在只有一个线程访问的情
 * 况下，效率要高于 Hashtable。
 * HashMap 允许将 null 作为一个 entry 的 key 或者 value，而 Hashtable 不允许。
 * HashMap把Hashtable的contains方法去掉了，改成containsvalue和 containsKey。因为contains
 * 方法容易让人引起误解。
 * Hashtable 继承自 Dictionary 类，而 HashMap 是 Java1.2 引进的 Map interface 的一个实现。
 * 最大的不同是，Hashtable 的方法是 Synchronize 的，而 HashMap 不是，在多个线程访问
 * Hashtable 时，不需要自己为它的方法实现同步，而 HashMap 就必须为之提供外同步。
 * Hashtable 和 HashMap 采用的 hash/rehash 算法都大概一样，所以性能不会有很大的差异。
 * 就 HashMap 与 HashTable 主要从三方面来说。
 * 一.历史原因:Hashtable 是基于陈旧的 Dictionary 类的，HashMap 是 Java 1.2 引进的 Map 接口
 * 的一个实现
 * 二.同步性:Hashtable 是线程安全的，也就是说是同步的，而 HashMap 是线程序不安全的，
 * 不是同步的
 * 三.值：只有 HashMap 可以让你将空值作为一个表的条目的 key
 * @author 路飞
 * @create 2021/2/26 21:48
 */
public class Test15 {
    public static void main(String[] args) {

    }
}
