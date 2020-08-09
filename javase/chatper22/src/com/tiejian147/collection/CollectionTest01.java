package com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法：
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”语法，目前先不用管。Collection中什么都能存，
        只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存java对象
        ，只是存储java对象的内存地址）

    2、Collection中的常用方法：
        boolean add(Object e)  向集合中添加元素
        int size();获取集合中元素的个数；
        void clear(); 清空集合
        boolean contains(Object o);  判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o);  删除集合中的某个元素。
        boolean isEmpty();  判断该集合中元素的个数是否为0
        Object[] toArray();   调用这个方法可以把集合转换为数组（作为了解，使用不多）


 */
public class CollectionTest01 {
    public static void main(String[] args) {
//        创建一个集合对象
//        Collection c = new Collection();//接口是抽象的，无法实例化。
//        多态
        Collection c = new ArrayList();

//        测试Collection中的常用方法：
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址：Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);

//        获取集合中元素的个数
        System.out.println("集合中元素的个数为：" + c.size());

//        清空集合
        c.clear();
        System.out.println("清空后，集合中元素的个数为：" + c.size());

//        再次往集合中添加元素
        c.add("hello");//实际上是添加的“hello"对象的内存地址放到了集合当中
        c.add("world");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1299);


//        判断集合中是否包含：”绿巨人“

        boolean flag = c.contains("绿巨人");
        System.out.println("绿巨人是否在集合中：" + flag);//true

        boolean flag2 = c.contains("绿巨人");
        System.out.println("绿巨人是否在集合中2：" + flag2);//true 因为存储的是对象的内存地址，所以flag2 和 flag 结果是一样的

        System.out.println(c.contains(1299));//true

        System.out.println("再次添加之后，集合中元素的个数为：" + c.size());

//        删除集合中的某个元素
        c.remove(1299);
        System.out.println("删除1299后，集合中元素的个数为：" + c.size());

        c.remove("绿巨人");
        System.out.println("删除绿巨人后，集合中元素的个数为：" + c.size());

//        判断集合中元素是否为0
        System.out.println("判断集合是否为空："+ c.isEmpty());//false
//        清空集合
        c.clear();

        System.out.println("再再清空后，判断集合是否为空：" + c.isEmpty());//true  true表示集合中没有元素了

        c.add("abc");
        c.add("hello world");
        c.add(100);
        c.add(new Object());
        c.add(new Student());

//        转换为数组（作为了解，使用不多）
//        Object[] objects = c.toArray();
        for (int i = 0; i < c.toArray().length; i++) {//这里可以不声明数组变量，直接在方法后面加.length
            System.out.println(c.toArray()[i]);
        }

    }

}

class Student{
    @Override
    public String toString() {
        return "zheshi为啥";
    }
}