package javase.chatper22.src.com.tiejian147.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，
    如果还是用老的迭代器，会报异常：java.util.ConcurrentModificationException

    重点：在迭代集合的元素过程中，不能调用集合对象的remove方法，删除元素：
        c.remove(o); 迭代过程中不能这样。
        会出现异常：java.util.ConcurrentModificationException

    重点：在迭代集合的元素过程中，一定要使用迭代器Iterator 中的 remove() 方法
         不要使用集合自带的remove方法删除元素。
 */
public class CollectionTest06 {
    public static void main(String[] args) {
//        创建集合
        Collection c1 = new ArrayList();

//        注意：此时获取迭代器，指向的是那时集合中没有元素状态下的迭代器
//        一定要注意，集合结构只要发生改变，迭代器必须重新获取；
//        否则会报错：java.util.ConcurrentModificationException
//        Iterator it = c1.iterator();

//        添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);

//        获取迭代器

       Iterator it2 =  c1.iterator();

       while (it2.hasNext()){
//           编写代码时next() 方法返回值类型必须是Object
//           Iterator i = it2.next();  //这里类型不对，编译会报错
           Object obj = it2.next();
           System.out.println(obj);
       }

//       再新建一个集合对象
        Collection c2 = new ArrayList();

//       添加元素到集合
        c2.add("abd");
        c2.add("bbc");
        c2.add("yyy");

//        获取迭代器
         Iterator it3 = c2.iterator();
//        遍历迭代器
        while (it3.hasNext()){
//            如果这里调用删除元素的方法
            Object o = it3.next();

//          这里调用集合的删除元素的方法  不好使，报错java.util.ConcurrentModificationException
//            直接通过集合去删除元素，没有通知迭代器，（导致迭代器的快照和原集合状态不同）
//            c2.remove(o);

//            可以使用迭代器当中的删除方法来删除:每循环一次   就删一次
//            删除的一定是迭代器指向的当前元素
//            迭代器删除元素时，会自动更新迭代器，并且更新元素（删除集合中的元素）
            it3.remove();
            System.out.println(o);
        }

        System.out.println(c2.size());

//        我要是硬要用集合的删除方法来删除元素呢？
        Collection c3 = new ArrayList();

        c3.add("aaa");
        c3.add("bbb");
        Object o3 =  c3.add("ccc");

        c3.remove("aaa");

        c3.remove(o3);



//        获取迭代器
        Iterator it4 = c3.iterator();

        while (it4.hasNext()){
            System.out.println(it4.next());
        }


    }
}
