package chapter22.Collection;

import chapter08.Student;

import java.util.ArrayList;
import java.util.Collection;

/*
 关于java.util.Collection接口中常用的方法：
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object中的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”，目前先不用管。Collection中什么都能存，只要是Object
        的子类型，就行。（集合中不能直接存储基本数据类型，也不能存java对象，只是存储
        Java对象的内存地址。）
    2、Collection中常用的方法：
        boolean add(Object e)//向集合中添加元素
        int size()//获取集合中元素的个数
        void clear()//清空集合
        boolean contains(Object o)//判断当前集合是否包含元素o
        remove(Object o)//删除集合中的某个元素
        boolean isEmpty()//判断该集合中元素的个数是否为0
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
//        Collection c = new Collection();接口是抽象的，无法实例化
        //多态
        Collection c =  new ArrayList();
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。
        c.add(true);//自动装箱。
        c.add(new Object());
        c.add(2.34);//自动装箱
        c.add(new Students());
        //查看集合中元素的个数：
        System.out.println("集合的元素总数为：" + c.size() + "个。");
        //清空集合：
        c.clear();
        System.out.println("清空后，集合的元素总数为：" + c.size() + "个。");

        //再向集合中添加元素
        c.add(555);
        c.add("hello");
        c.add("中国人");
        c.add("浩克");
        //判断集合中是否包含对象**
        //c.contains("hello");
        System.out.println(c.contains("hell"));//false
        System.out.println(c.contains("hello"));//true

        //删除集合中某个元素
        System.out.println("删除前，集合的元素总数为：" + c.size() + "个。");
        c.remove("浩克");
        System.out.println("删除后，集合的元素总数为：" + c.size() + "个。");

        //判断集合中元素是否为空
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println("清空后，集合的元素总数为：" + c.size() + "个。");
        System.out.println("清空之后，为：" + c.isEmpty());//true

    }

}

class Students{

}
