package com.tiejian147.collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1、默认初始化容量10；（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10）
    2、集合底层是一个Object[] 数组；
    3、构造方法：
        ArrayList();
        ArrayList(20);
    4、ArrayList集合的扩容：
        扩容到原容量的1.5倍
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在
            使用ArrayList集合的时候预估计元素的个数，
            给定一个初始化容量。
    5、数组优点：
        检索效率比较高；（每个元素占用空间大小相同，内存地址是连续的，知道首
        元素的内存地址，然后知道下标，通过数学表达式计算出元素的内存地址，所以
        检索效率很高。）
    6、数组缺点：
        随机增删元素效率比较低；
        另外数组无法存储大数据量（很难找到一块非常巨大的连续的内存空间）
    7、向数组末尾添加元素，效率很高，不受影响。
    8、面试官经常问的问题：
        这么多的集合中，你用哪个集合最多？
            答：ArrayList集合。
            因为往数组末尾添加元素，效率不受影响。
            另外，我们检索/查找某个元素的操作比较多。
    9、ArrayList是非线程安全的（不是线程安全的）。
 */
public class ArrayList01 {
    public static void main(String[] args) {
//        默认初始化容量10，
//        数组的长度是10
        List list = new ArrayList();
//        集合的size() 方法是获取集合中元素的数量。不是获取集合的容量；
        System.out.println(list.size());//0
//        指定初始化容量为20
//        数组的长度是20
        List list1 = new ArrayList(20);
        //        集合的size() 方法是获取集合中元素的数量。不是获取集合的容量；
        System.out.println(list1.size());//0

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list.size());//10个元素

        list.add(11);

        System.out.println(list.size());//11个元素
    }
}
