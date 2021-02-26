package javase;

/**
 * 手动实现双端链表
 * @author 路飞
 * @create 2021/2/26 22:25
 */
public class Test17 {

}
//双向链表节点类
class Node<T>{
    Node pre;
    Node next;
    T data;
    public Node(Node pre, Node next, T data) {
        this.pre = pre;
        this.next = next;
        this.data = data;
    }
}

