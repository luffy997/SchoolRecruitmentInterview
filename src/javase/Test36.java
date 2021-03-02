package javase;

import java.util.*;

/**
 * 遍历Map效率最高的方式
 * @author 路飞
 * @create 2021/3/2 15:30
 */
public class Test36 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i,i+1);
        }

        //遍历key-value
        //使用iterator遍历，可以遍历Set，list，单向遍历
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //map通过entrySet转set
        Set<Map.Entry<Integer, Integer>> entrySet = entries;
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            //System.out.println(next.getKey()+"\t"+next.getValue());
        }

        //遍历value
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator1 = keySet.iterator();
        while (iterator1.hasNext()){
            Integer next = iterator1.next();
           // System.out.println(next);
        }

        //使用iterator遍历set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        Iterator<Integer> iterator2 = set.iterator();
        while (iterator2.hasNext()){
            Integer next = iterator2.next();
            //System.out.println(next);
        }
        //Iterator只能单向遍历，不能修改
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list1.add(i);
        }
        Iterator<Integer> iterator3 = list1.iterator();
        while (iterator3.hasNext()){
            Integer next = iterator3.next();
            //System.out.println(next);
        }
        //ListIterator只能遍历list,可以双向遍历，并可以修改

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list2.add(i);
        }
        ListIterator<Integer> iterator4 = list2.listIterator();
        while (iterator4.hasNext()){
            Integer next = iterator4.next();
            System.out.println(next);
        }

        //：一定要先进行由前向后输出，之后才能进行由后向前的输出。
        //使用ListIterator还可以进行增加以及替换元素。 这里不演示了
        while (iterator4.hasPrevious()){
            System.out.println(iterator4.previous());
        }


    }
}
