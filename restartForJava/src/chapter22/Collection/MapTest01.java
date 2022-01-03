package chapter22.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
    1、Map和Collection没有继承关系。
    2、Map集合以key和value的方式存储数据：键值对
        key和value都是引用数据类型；
        key和value都是存储对象的内存地址；
        key起到主导的地位，value是key的一个附属品；
    3、Map接口中常用方法：
        V put(K key, V value); 向Map集合中添加键值对
        V get(Object key); 通过key获取value
        void clear(); 清空Map集合
        boolean containsKey(Object key);判断Map中是否包含某个key
        boolean containsValue(Object Value);判断Map中是否包含某个value

        boolean isEmpty();判断Map集合中元素个数是否为空
        Set<K> keySet();获取集合中所有的key

        V remove(Object key);通过key删除键值对
        int size();获取Map集合中键值对的个数
        Collection<V> values();获取Map集合中所有的value，返回一个Collection
        Set<Map.Entry<K,V>> entrySet();
            将Map集合转成Set集合


 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建一个Map集合
        Map<Integer,String> m1 =  new HashMap<>();
        //向集合中添加元素 put()方法
        m1.put(1,"zhangsan");//1在这里进行了自动装箱
        m1.put(2,"lisi");
        m1.put(3,"wangwu");
        m1.put(4,"zhaoliu");

        //通过key获取value
        String s1 = m1.get(1);
        System.out.println(s1);

        //获取键值对的数量
        System.out.println("键值对的数量：" + m1.size());

        //通过key删除value
        m1.remove(3);
        System.out.println("删除之后的数量：" + m1.size());
        //判断是否包含某个key
        //contains方法底层都是调用equals方法进行比对的，所以自定义的类型需要重写equals方法
        boolean result1 =  m1.containsKey(3);
        System.out.println(result1);
        //判断是否包含某个value
        boolean result2 = m1.containsValue("lisi");
        System.out.println(result2);

        boolean result3 = m1.containsValue("wangwu");
        System.out.println(result3);

        //判断是否为空：
        boolean result4 = m1.isEmpty();
        System.out.println("判断是否为空：" + result4);

        System.out.println("----------");
        //转成Collection
        Collection<String> strings = m1.values();
        //这个时候才能遍历：
        for (String o:strings) {
            System.out.println(o);
        }
        System.out.println("-------------");

        //清空键值对
        m1.clear();
        System.out.println("清空之后的数量：" + m1.size());
        //再判断是否为空：
        System.out.println("清空之后是否为空:" + m1.isEmpty());





    }
}
