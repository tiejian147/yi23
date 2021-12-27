package chapter22.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
迭代器
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //ArrayList 集合：有序可重复的：怎么存进去的，怎么取出来，可以重复
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);
        //迭代器创建对象
        Iterator iterator = c1.iterator();
        System.out.println(c1.size());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //HashSet 无序不可重复
        Collection cc2 = new HashSet();
        cc2.add(100);
        cc2.add(200);
        cc2.add(100);
        cc2.add(300);
        cc2.add(400);
        System.out.println("HashSet的元素数是：" + cc2.size());
        //创建迭代器对象
        Iterator it2 = cc2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());//打印结果是没有顺序的，且不重复
        }

    }
}
