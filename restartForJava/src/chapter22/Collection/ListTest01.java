package chapter22.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
测试List接口中的方法：
    1、List集合存储元素的特点：有序可重复；
    有序：集合中元素有下标，从0开始，以1递增。
    可重复：存储1个，还可以再存储1；
    2、List既然是Collection接口的子接口，那么List接口有自己特色的方法：
    以下只列出List接口自己特有的常用方法：
        void add(int index, Object element);
        Object get(int index);
        int indexOf(Object o);
        int lastIndexOf(Object o);
        Object remove(int index);
        Object set(int index , Object element);
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        List list = new ArrayList();
        //添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("C");
        list.add("D");

        //用特有的添加元素的方法
        list.add(2,"king");

        //迭代器
        Iterator iterator = list.iterator();
        //遍历元素
        while (iterator.hasNext()){
            Object elt = iterator.next();
            System.out.println(elt);
        }

        Object firstObj = list.get(1);
        System.out.println("第二个元素：" + firstObj);
        //因为有下标，所以可以用for循环遍历
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(list.indexOf("C"));
        //获取指定对象最后一次出现处的索引
        System.out.println(list.lastIndexOf("C"));




    }
}
