package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法：
    boolean contains(Object o);
        判断集合中是否包含某个对象o
        如果包含返回true，如果不包含返回false；

     contains方法是用来判断集合中是否包含某个元素的方法，
     那么它在底层是怎么判断集合中是否包含某个元素的呢？
        调用了equals方法进行比对。
        equals方法返回true，就表示包含这个元素。

 */
public class CollectionTest04 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c1 = new ArrayList();

        String s1 = new String("test");

//        添加元素到集合
        c1.add(s1);

        String s2 = new String("des");
        c1.add(s2);

        System.out.println("集合中的元素数量为：" + c1.size());

//        新建的对象String
        String x = new String("test");

//        String类中的equals() 方法，比较的是内容
        System.out.println(x.equals(s1));//所以这里返回的是true

//        c集合中是否包含x？结果猜测一下是true还是false？
//        这里判断的是，是否存在"test" ,底层调用的是equals方法，比较的是内容
        System.out.println(c1.contains(x));//true


    }
}
