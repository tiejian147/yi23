package com.tiejian147.collection;

import java.util.*;

/*
Map集合的练习
 */
public class MapTestForPractice {
    public static void main(String[] args) {
//        创建一个Map集合
        Map<Integer, String> myList = new HashMap<>();

//        添加键值对
        myList.put(1,"test");
        myList.put(2,"hello world");
        myList.put(3,"222");
        myList.put(4,"zhangsan");
        myList.put(5,"测试");

//        通过key获取value
        String s = myList.get(2);
        System.out.println(s);

//        判断key 中是否有value
        System.out.println(myList.containsKey(6));
        System.out.println(myList.containsKey(1));

//        查询集合中键值对的数量
        System.out.println(myList.size());

//        从集合中通过key移除键值对
        System.out.println(myList.remove(2));
        System.out.println(myList.size());
        System.out.println("============");

//        遍历
//        用foreach
//        首先获取所有的key
        Set<Integer> myKeys = myList.keySet();
//        然后根据获取到的
        for (Integer key : myKeys){
            System.out.println(myList.get(key));
        }

        System.out.println("-------------");

//        用另外一种方式
//        也是需要先获取key
        Set<Integer> myKeys2 = myList.keySet();

//        然后获取迭代器
        Iterator<Integer> its = myKeys2.iterator();

        while (its.hasNext()) {
            Integer num = its.next();
            String value = myList.get(num);
            System.out.println(num + "=" + value);
        }
    }
}
