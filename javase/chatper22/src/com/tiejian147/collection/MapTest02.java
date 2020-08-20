package com.tiejian147.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map 集合的遍历
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

    }
}
