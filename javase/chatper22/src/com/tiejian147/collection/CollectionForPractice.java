package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Collection集合相关的针对性练习
 */
public class CollectionForPractice {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
//        往集合中添加元素
        c.add("abc");
        c.add("bbc");
        c.add(1000);
        c.add(new Object());
        c.add(1000);

//        获取迭代器
        Iterator it = c.iterator();

//        遍历迭代器
        while (it.hasNext()){
//            这里的一定都是Object类型的
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("===========");
        c.remove("bbc");
//        因为上面进行了元素删除的操作，所以迭代器一定要重新获取才能遍历，否则就会报错
        Iterator it2 = c.iterator();
        //        遍历迭代器
        while (it2.hasNext()){
//            这里的一定都是Object类型的
            Object obj = it2.next();
            System.out.println(obj);
        }
//        获取集合中的元素数量：
        System.out.println("集合中的数量为：" + c.size());
        System.out.println("这会元素是否为空:" + c.isEmpty());

//        清空集合
        c.clear();
        System.out.println("集合中的数量为：" + c.size());

        System.out.println("元素是否为空？" + c.isEmpty());

//        再次添加元素
        c.add("abc");
        c.add("bbc");
        c.add(1000);
        c.add(new Object());
        c.add(1000);

//        获取迭代器
        Iterator it3 = c.iterator();

//        遍历迭代器
        while (it3.hasNext()){
            Object obj = it3.next();
//            删除元素,这个方法不传参数
            it3.remove();
//            这里打印的是？
            System.out.println(obj);
        }

//        现在看看集合中的元素是否为空？
        System.out.println(c.isEmpty());
//        集合中的元素数量？
        System.out.println(c.size());
    }

}
