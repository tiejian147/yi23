package com.tiejian147.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
    1、Map和Collection没有继承关系；
    2、Map集合以key和value的方式存储数据：键值对
        key和value都是引用数据类型；
        key和value都是存储对象的内存地址；
        key起到主导的地位，value是key的一个附属品。
    3、Map接口中常用的方法：
        V put(K key, V value);  向Map中添加键值对；
        V get(Object key);  通过key获取value；
        void clear();   清空Map集合；
        boolean containsKey(Object key);    判断Map中是否包含某个key；
        boolean containsValue(Object value);    判断Map中是否包含某个value；
        boolean isEmpty();  判断Map集合中元素个数是否为0；
        Set<K> keySet();    获取Map集合所有的key（所有的key是一个set集合）；
        V remove(Object key);   通过key删除键值对
        int size();     获取Map集合中键值对的个数；
        Collection<v> values();     获取Map集合中所有的value，返回一个Collection；

        Set<Map.Entry<K,V>> entrySet();     将Map集合转换成Set集合；
        这个方法比较独特，因为返回的数据类型比较独特：
            假设现在有一个Map集合，如下所示：
            map1集合对象：
            key             value
            --------------------------
            1               zhangsan
            2               lisi
            3               wangwu
            4               zhaoliu

            然后调用上面的转换方法
            Set set = map1.entrySet();
            set集合对象：
            1=zhangsan 【注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中的元素类型是：Map.Entry<K,V>】
            2=zhaosi   【Map.Entry和String一样，都是一种类型的名字，只不过：Map.Entry是静态内部类，是Map中的静态内部类】
            3=wangwu
            4=zhaoliu

 */
public class MapTest01 {
    public static void main(String[] args) {
//        创建Map集合
        Map<Integer,String> map = new HashMap<>();

//        向Map中添加键值对
        map.put(1,"test");
        map.put(2,"中国人");
        map.put(3,"world");
        map.put(4,"wangwu");

//        通过Key获取value
        String s1 = map.get(3);
        System.out.println(s1);

        System.out.println(map.get(4));

//        获取键值对的数量
        int num = map.size();
        System.out.println(num);

        System.out.println("map集合的键值对数量是：" + map.size());

//        通过key删除key-value
        map.remove(1);
        System.out.println("map集合的键值对数量是：" + map.size());
//        获取map中所有键值对的value---这还不会写

//        判断Map集合中是否有key值：2
        System.out.println(map.containsKey(2));//true
//        contains方法底层调用的都是equals方法进行对比的，所以自定义的类型需要重写equals方法
        System.out.println("即使是new对象：" + map.containsKey(new Integer(2)));//true
        System.out.println(map.containsKey(1));//false  刚才把key：1干掉了，所以没有了

//        判断Map集合中是否有value值：test
        System.out.println(map.containsValue("中国人"));//true
        System.out.println(map.containsValue("sdf"));//false

//        判断map集合中键值对个数是否为0
        System.out.println("键值对个数是否为0：" + map.isEmpty());//false

//        清空集合
        map.clear();

        //        判断map集合中键值对个数是否为0
        System.out.println("清空之后键值对个数是否为0：" + map.isEmpty());//true

        map.put(1, "abvc");
        map.put(2, "hhh");
        map.put(3, "111");
        map.put(4, "666");
        map.put(5, "zhangsan");

//        获取所有的value

        Collection<String> values = map.values();

        for (String data : values) {
            System.out.println(data);
        }





    }
}
