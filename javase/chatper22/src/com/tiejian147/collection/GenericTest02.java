package com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
JDK之后引入了：自动类型推断机制（又称为钻石表达式）；
 */
public class GenericTest02 {
    public static void main(String[] args) {
//        ArrayList<这里的类型会自动推断>()  前提是JDK8之后才允许
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
//      这里的迭代器  也要加钻石表达式，不然遍历的时候，还是类型不对
        Iterator<Animal> it = myList.iterator();

//        遍历
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> stringList = new ArrayList<>();
//        类型不匹配
//        stringList.add(new Cat());
        stringList.add("http://www.163.com");
        stringList.add("http://www.baidu.com");
        stringList.add("http://www.huaban.com");

//        这个类型也不匹配,一定得是String类型的才行
//        stringList.add(123);
        System.out.println(stringList.size());

//        获取迭代器
        Iterator<String> it2 = stringList.iterator();

//        遍历
        while (it2.hasNext()){
            /*
            如果没有使用泛型
            Object obj = it2.next();
            if(obj instanceof String){
                String ss = (String)obj;
                ss.subString(7);
            }
             */

//            直接通过迭代器获取了String类型的数据
            String s = it2.next();
//            直接调用String类的subString方法截取字符串
            String s1 = s.substring(7);
            System.out.println(s1);
        }
    }
}



class Animal {
    //    父类自带方法：
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("鸟儿在飞翔");
    }
}
