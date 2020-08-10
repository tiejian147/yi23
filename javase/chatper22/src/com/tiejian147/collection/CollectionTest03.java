package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c1 = new ArrayList();//ArrayList集合：有序可重复
//        添加元素到集合
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add("test");
        c1.add(1);

//        迭代器遍历/迭代
        Iterator it = c1.iterator();
        while (it.hasNext()){
//            存进去什么类型，取出来还是什么类型
            Object obj = it.next();
            if (obj instanceof Integer){
                System.out.println("Integer类型：");
            }
//            只不过在输出的时候会转换成字符串，因为这里println会调用toString() 方法。
            System.out.println(obj);
        }

//        再创建一个哈希集合对象  HashSet();  无序不可重复
        Collection c2 = new HashSet();

//        无序：存进去和取出的顺序不一定相同
//        不可重复：且要把重复的对象过滤掉，存储100， 不能再存储100

        c2.add(500);
        c2.add(90);
        c2.add(100);
        c2.add(600);
        c2.add(300);
        c2.add(400);
        c2.add(90);

        System.out.println("-------------------");
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
