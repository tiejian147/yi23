package com.tiejian147.collection;

import java.util.HashSet;
import java.util.Set;

/*
1、向Map集合中存，以及向Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法！
equals方法有可能调用，也有可能不调用。
    拿put(k,v)举例，什么时候equals不会调用？
    k.hashCode()方法返回哈希值；
    哈希值经过哈希算法转换成数组下标；
    数组下标位置上如果是null，equals方法不需要调用。

    拿get(k)举例，什么时候equals方法不会调用？
        k.hashCode()方法返回哈希值；
        哈希值经过哈希算法转换成数组下标；
        数组下标位置上如果是null，equals方法不需要调用。

2、注意：如果一个类的equasl方法重写了，那么hashCode方法必须重写。
        并且，equals方法返回结果如果是true，那么hashCode()方法返回值必须一样。
            equals()方法返回true表示两个对象相同，在同一个单向链表上比较。
            那么对于同一个单向链表上的节点来说，他们的哈希值是相同的。
            所以hashCode()方法的返回值也应该相同。

3、hashCode()方法和equals()方法不用研究了，直接用IDEA工具生成，但是这两个方法需要同时生成。

4、终极结论：
    放在HashMap集合key部分的，以及放在hashSet集合中的元素，需要同时重写hashCode方法和equals方法。
 */

public class HashMapTest02 {
    public static void main(String[] args) {
        Students s1 = new Students("zhangsan");
        Students s2 = new Students("zhangsan");

//        因为没有重写equals方法，所以是false
        System.out.println(s1.equals(s2));//false,重写equals方法之后变为true

//        重写equals方法之后
        System.out.println(s1.equals(s2));//true（s1和s2表示相等）

        System.out.println("s1的哈希code：" + s1.hashCode());//460141958--重写hashCode之后：-1432604525
        System.out.println("s2的哈希code：" + s2.hashCode());//1163157884--重写hashCode之后：-1432604525

//        s1.equals(s2)结果已经是true了，表示s1和s2是相同的，一样的，
//        那么往HashSet集合中放的话，按说只能放进去1个；（HashSet集合特点：无序不可重复）
        Set<Students> ss = new HashSet<>();
        ss.add(s1);
        ss.add(s2);
//        System.out.println(ss.size());//这个结果按说是1 ； 但是 结果是2；显然不符合hashSet存储特点
        //怎么办？equals方法重写的话，hashCode()方法也需要重写；

//        重写之后再执行：（用IDEA工具自动生成equals方法和hashCode方法）
        System.out.println(ss.size());//这时候结果就是1了



    }
}


