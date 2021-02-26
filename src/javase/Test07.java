package javase;


import java.util.*;

/**
 * list和set
 * list有序，可重复
 * set无序，不可重复
 * @author 路飞
 * @create 2021/2/26 17:24
 */
public class Test07 {
    public static void main(String[] args) {

        //常用list
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedListl = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        //[1, 1, 2, 1, 1, 2]
        System.out.println(arrayList);

        //set底层new的HashSet
        /**
         *     public HashSet() {
         *         map = new HashMap<>();
         *     }
         */
        //[1, 2]
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);
    }
}
