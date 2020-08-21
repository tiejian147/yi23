package com.tiejian147.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map 集合的遍历 【非常重要】
 */
public class MapTest02 {
    public static void main(String[] args) {
//        第一种方法：获取所有的Key，通过遍历Key来遍历value
        Map<Integer, String> map = new HashMap<>();

//        添加键值对
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

//        遍历Map集合
//        获取所有的key，所有的key是一个Set集合
        Set<Integer> keySet =  map.keySet();

//        遍历key，通过key获取value
//        迭代器可以
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()){
//            取出其中一个key
            Integer key = it.next();

//            通过key获取value
            String value = map.get(key);
            System.out.println("键值对的值：" + key + "=" + value);

        }

//        foreach也可以
        for (Integer key : keySet){
            System.out.println("用forecah：" + key + "=" + map.get(key));
        }

        System.out.println("---------");

//    第二种方法：Set<Map.entry<K,V>> entrySet()
//        方式1：while
//        这个方法是把Map集合直接全部转换成Set集合
//        Set集合中元素的类型是：Map.Entry
//        首先先转换成Set集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();

//        然后获取迭代器
        Iterator<Map.Entry<Integer,String>> it2 =  set.iterator();

        while (it2.hasNext()){
//            获取map集合中的key值
            Map.Entry<Integer,String> num = it2.next();
            Integer key2 = num.getKey();
            String value2 = num.getValue();
//            获取map集合中的value
            System.out.println(key2 + "=" + value2);

        }

//        方式2：用foreach
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + "-->" + node.getValue());
        }
    }
}
