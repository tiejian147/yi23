package chapter22.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 关于集合遍历/迭代器专题（重点：五颗星*****）
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的迭代方式，是所有Collection通用的一种方式。
        //在Map集合中不适用。在所有Collection以及子类中使用。
        //创建集合对象：
        Collection c = new ArrayList();
        c.add("abc");
        c.add("edf");
        c.add(100);
        c.add(new Object());
        //获取迭代器
        Iterator it = c.iterator();
        System.out.println(c.iterator().hasNext());

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
