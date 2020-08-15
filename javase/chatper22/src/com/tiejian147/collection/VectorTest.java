package javase.chatper22.src.com.tiejian147.collection;

import java.util.*;

/*
Vector:
    1、底层也是一个数组。
    2、初始化容量：10
    3、怎么扩容的？
        扩容之后是原容量的2倍。
        10--> 20 --> 40 --> 80
    4、ArrayList 集合扩容特点：
        ArrayList集合扩容是原容量的1.5倍
    5、Vector中所有的方法都是线程同步的，都带有synchronized关键字，
        是线程安全的。
    6、怎么讲一个线程不安全的ArrayList集合转换成线程安全的呢？
        使用集合工具类：
            java.util.Collectins;

            java.util.Collection; 是集合接口；
            java.util.Collection; 是集合工具类；
 */
public class VectorTest {
    public static void main(String[] args) {
//        创建一个Vector集合
        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        System.out.println(vector.size());

        vector.add(11);
        System.out.println(vector.size());

        /*
//        为啥不用这个方法取元素呢？
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

          */
//        获取迭代器
        Iterator it = vector.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        这个可能以后要使用
        List mylist = new ArrayList();//这是非线程安全的

//        变成线程安全的
        Collections.synchronizedList(mylist);//这里没有办法看效果，因为多线程没学，先记住；

//        这样mylist 就变成线程安全了
        mylist.add("111");
        mylist.add("222");
        mylist.add("333");




    }
}
