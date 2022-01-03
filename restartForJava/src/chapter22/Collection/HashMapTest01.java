package chapter22.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap集合：
    1、HashMap集合底层是哈希表/散列表的数据结构；
    2、哈希表是一个怎样的数据结构？
        哈希表是一个数组和单向链表的结合体；
        数组：在查询方面效率很高，随机增删方面效率很低；
        单向链表：在随机增删方面效率很高，在查询方面效率很低；
        哈希表将以上两种数据结构融合在一起，充分发挥它们各自的优点。
    3、最主要掌握的是：
        map.put(k,v);
        v = map.get(k);
        以上这两个方法的实现原理，是必须掌握的。
    4、HashMap集合的key部分 特点：
        无序，不可重复；
        为什么无序，因为不一定挂到哪个单向链表上。
        不可重复是怎么保证的？equals方法来保证HashMap集合的key不可重复
        如果key重复了，value会覆盖。

        放在HashMap集合key部分的元素其实就是放到hashSet()集合中了，
        所以hashset集合中的元素也需要同时重写hashcode() + equals()方法
    5、重点：放在hashMap集合中key部分的元素，以及放在HashSet集合中的元素，
            需要同时重写hashCode和equals方法。
    6、HashMap集合的默认初始化容量是16，默认加载因子是0.75；
        这个默认加载因子是当HashMap集合底层的容量达到75%的时候，数组开始扩容。
    7、
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //创建HashMap集合
        Map<Integer,String> map = new HashMap<>();
        //添加元素进去
        map.put(7777,"zhangsan");
        map.put(8888,"lisi");
        map.put(3333,"wangwu");
        map.put(7777,"zhaoliu");
        map.put(1111,"haha");

        //遍历取出来
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry:set) {
            //验证结果：HashMap集合key部分，无序不可重复
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
