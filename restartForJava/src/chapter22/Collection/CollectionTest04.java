package chapter22.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入学习contains方法
    boolean contains(Object o)  判断集合中是否包含某个对象o
    如果包含返回true，如果不包含返回false

    contains方法用来判断集合中是否包含某个元素的方法
    那么它在底层是怎么判断的呢？
    调用了equals方法进行比对的。
    equals方法返回true，那么就表示包含这个元素

    结论：
        存放在一个集合中的类型，一定要重写equals方法。
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection cc3 = new ArrayList();
        String s1 = new String("abc");
        cc3.add(s1);
        String s2 = new String("edf");
        cc3.add(s2);

        String s3 = new String("abc");
        System.out.println(cc3.contains(s3)); //true


        //看删除的方法
        Collection cc4 = new ArrayList();
        String s5 = new String("ccc");
        cc4.add(s5);

        String s4 = new String("ccc");
        cc4.remove(s4);
        System.out.println("此时cc4集合中的元素个数为：" + cc4.size());//0个
        //也就是说   删除s4 ，把s5就删掉了

    }
}
