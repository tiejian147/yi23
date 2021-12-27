package chapter22.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素中的remove方法
    重点：当集合的结构发生改变时，迭代必须重新获取，如果还是用以前的迭代器，会报错。

    在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
        c.remove()时，迭代过程中不能这样写，会报错
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection cc5 = new ArrayList();
//        Iterator it1 = cc5.iterator();//这里可以写，但是下面添加元素了
        //那么迭代器要重新获取一次
        //添加元素
        cc5.add(1);
        cc5.add(2);
        cc5.add(3);
        cc5.add(4);
        cc5.add(5);
        Iterator it2 = cc5.iterator();
        while (it2.hasNext()){
            Object o = it2.next();
//            cc5.remove(1);//这里调用集合的remove方法会报错，因为迭代器没有重新获取
            //如果要remove，那么就要用迭代器里的方法
            //迭代器删除，会自动更新迭代器，并且更新集合（删除集合中的元素）
            it2.remove();//remove的一定是当前的元素
            System.out.println(o);
        }
        System.out.println("删除之后：" + cc5.size());


    }
}
