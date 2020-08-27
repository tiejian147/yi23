package com.tiejian147.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合：
    1、HashMap集合底层是哈希表/散列表的数据结构；
    2、哈希表是一个怎样的数据结构呢？
        哈希表是一个数组和单向链表的结合体；
        数组：在查询方面效率很高，随机增删方面效率很低；
        单向链表：在随机增删方面效率很高，在查询方面效率很低；
        哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
    3、HashMap集合底层的源代码：
        public class HashMap{

            // HashMap 底层实际上就是一个数组。（一维数组）
            Node<K,V>[] table;

            // 静态的内部类HashMap.Node
            static class Node<K,V> {
                final int hash;//哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法，可以转换存储成数组的下标。）
                final K key;
                V value;
                Node<K,V> next;
            }
        }
        哈希表/散列表：一维数组，这个数组中每一个元素是一个单向链表（数组和链表的结合体）。
    4、最主要掌握的是：
        map.put(k,v);
        v = map.get(k);
        以上这两个方法的实现原理，是必须掌握的；

        map.put(k,v)方法的实现原理：
        第一步：先将k,v封装到Node对象中；
        第二步：底层会调动k的hashCode()方法得出hash值，然后通过哈希函数/哈希算法，将hash值转换成数组的下标，
               下标位置上如果没有任何元素，就把Node添加到这个位置上了，如果说下标对应的位置上有链表，此时会
               拿着k和链表上每一个节点中的k进行equals，如所有的equals方法返回都是false，那么这个新节点将
               被添加到链表的末尾，如果其中又一个equals返回了true，那么这个节点的value将会覆盖。

       v = map.get(k) 方法的实现原理：
        先调用k的hashCode()方法得出哈希值，通过哈希算法转换成数组下标，通过数组下标快速定位到某个位置上，
        如果这个位置上什么也没有，返回null，如果这个位置上有单向链表，那么会拿着参数k和单向链表上的每个
        节点中的k进行equals，如果所有的equals方法返回false，那么get方法返回null，只要其中有一个节点
        的k和参数k equals的时候返回true，那么此时这个节点的value就是我们要找的value，get方法最终返回
        这个要找的value。

        注意：同一个单向链表上所有节点的hash相同，因为他们的数组下标是一样的，但同一个链表上k和k的equals方法
            肯定是返回false，都不相同。

        为什么哈希表的随机增删，以及查询效率都很高？
            增删是在链表上完成；
            查询也不需要都扫描，只需要部分扫描；

      重点：通过讲解可以得出HashMap集合的key，会先后调用两个方法，一个方法是HashCode()，一个方法是equals();
           那么这两个方法都需要重写。

      5、HashMap集合的key部分特点：
        无序，不可重复。
        为什么无序？ 因为不一定挂到哪个单向链表上。
        不可重复是怎么保证的？ equals方法来保证HashMap集合的key不可重复。
        如果key重复了，value会覆盖。

        放在HashMap集合key部分的元素其实就是放到HashSet集合中了。
        所以HashSet集合中的元素也需要同事重写hashCode()+ equals()方法

      6、哈希表HashMap使用不当时无法发挥性能
            假设将所有的hashCode() 方法返回值固定位某个值，那么会导致底层哈希表变成了纯单向链表。
            这种情况我们成为：散列分布不均匀。

         什么是散列分布均匀？
            假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的，
            是散列分布均匀的。
         假设将所有的hashCode() 方法返回值都设定为不一样的值，可以吗？有什么问题？
            不行，因为这样的话导致底层哈希表就成为一维数组了，没有链表的概念了。
            也是散列分布不均匀。
         散列分布均匀需要你重写hashCode() 方法时有一定的技巧
      7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法；
      8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
        这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容；

        重点，记住：HashMap集合初始化容量必须是2的倍数，这也是官方推荐的，
                这是因为达到散列均匀，为了提高HashMap集合的存取效率，所必须的。
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1111, "zhangsan");
        map.put(9999, "test");
        map.put(4444, "wangwu");
        map.put(3333, "king");
        map.put(3333, "push");

        System.out.println("元素个数为： " + map.size());

//        遍历
        Set<Map.Entry<Integer,String>> set = map.entrySet();

        for (Map.Entry<Integer,String> entry : set){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
