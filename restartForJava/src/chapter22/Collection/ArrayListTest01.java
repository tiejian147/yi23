package chapter22.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
ArrayList集合：
    1、默认初始化容量是10；
    2、集合底层是一个Object[]数组；
    3、构造方法：
        ArrayList();
        ArrayList(20);
    4、ArrayList集合的扩容：
        增长到原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容，因为数组扩容效率比较低，建议在使用
            ArrayList集合的时候预估元素的个数，给定一个初始化容量。
    5、数组优点：
        检索效率很高。
    6、数组缺点：
        随机增删元素效率比较低。
    7、向数组末尾添加元素，效率较高，不受影响。
    8、面试官经常问的一个问题：
        这么多的集合中，你用哪个集合最多？
        答:ArrayList集合。
        因为往数组末尾添加元素效率不受影响。
        另外我们检索/查找某个元素的操作比较多。
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //初始化容量是10；
        List list = new ArrayList();
        //指定初始化容量是20；
        List list1 = new ArrayList(20);
    }
}
