package javase.chatper22.src.com.tiejian147.collection;

import java.util.*;

/*
测试List接口中常用方法：
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标；
        从0开始，以1递增；
        可重复：存储一个1，还可以再存储1；
    2、List既然是Collection接口的子接口，那么肯定List接口有自己"特色"
        的方法：
            void add(int index, E element);
            E get(int index);
            int indexOf(Object o);
            int lastIndexOf(Object o);
            E remove(int index);
            E set(int index, E element);
            注意：E 的意思是泛型，还没学；可以先用Object 替代。
 */
public class ListTest01 {
    public static void main(String[] args) {
//        创建List类型的集合
//        List myList = new LinkedList();//这个可以创建
//        List myList = new Vector();// 这个可以创建
        List myList = new ArrayList();

//        添加元素
        myList.add("A");//默认都是向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("D");
        //在列表的置顶位置插入置顶元素（第一个参数是下标）
//        这个方法用的不多，因为对于ArrayList集合来说效率比较低
        myList.add(1,"king");
        myList.add(2,"abc");
        myList.add(4,"abc");
        myList.add(7,"abc");
        myList.add(5,"abc");

//        迭代
        Iterator it = myList.iterator();

//        遍历
        while (it.hasNext()){
            Object obj = it.next();

            System.out.println(obj);
        }

//        根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println("第一个元素" + firstObj);


        System.out.println("-----------");

//        因为有下标，所以List集合有自己比较特殊的遍历方式
//        通过下标遍历 [List集合特有的遍历方法，Set没有]
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);

            System.out.println(obj);
        }

//        获取指定对象第一次出现处的索引
        System.out.println("第一个king所在的下标：" + myList.indexOf("abc"));

//        获取指定对象最后一次出现处的索引：
        System.out.println("最后一个abc所在的下标：" + myList.lastIndexOf("abc"));

        System.out.println("元素数量应该是有9个：" + myList.size());

//        删除指定下标位置的元素：
        myList.remove(0) ;

        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);

            System.out.println(obj);
        }
        System.out.println("元素数量应该还剩8个："  + myList.size());

//        修改指定下标位置的元素：
        myList.set(1, "bbc");

        System.out.println("abc 改为bbc了：" + myList.get(1));




    }
}
