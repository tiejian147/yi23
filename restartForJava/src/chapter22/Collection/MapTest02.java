package chapter22.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历：
 */
public class MapTest02 {
    public static void main(String[] args) {
        //创建一个hashMap
        Map<Integer,String> m2 = new HashMap<>();
        //添加键值对
        m2.put(1,"zhangsan");
        m2.put(2,"lisi");
        m2.put(3,"wangwu");
        m2.put(4,"zhaoliu");
        m2.put(5,"haha");
        //遍历：
        //获取所有的key，
        Set<Integer> keySet = m2.keySet();
        //迭代器
        Iterator<Integer> iterator = keySet.iterator();
        //遍历迭代器
        while (iterator.hasNext()){
            //这里就拿到了所有的key
            Integer i = iterator.next();
            System.out.println(i);
            //此时再通过key拿到value
            String s = m2.get(i);
            System.out.println(s);
        }

        //foreach也可以
        for (Integer i: keySet) {
            System.out.println(i + "=" + m2.get(i));
        }

        //第二种方法：
        Set<Map.Entry<Integer,String>> set = m2.entrySet();
        //迭代器
        Iterator<Map.Entry<Integer,String>> iterator1 = set.iterator();
        //遍历
        while (iterator1.hasNext()){
            Map.Entry<Integer,String> me = iterator1.next();
            //从Map.Entry<Integer,String> 中拿key和value
            Integer i = me.getKey();
            String s = me.getValue();
            System.out.println(i + "=" + s);
        }

        //foreach
        //这种方法效率比较高：因为key和value都是从me中获取的属性值
        //这种方式比较适合大数据量
        for (Map.Entry<Integer,String> me : set) {
            System.out.println(me.getKey() + "-->" + me.getValue());
        }




    }
}
