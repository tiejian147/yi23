package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5.0之后推出的新特性：泛型
 */
public class GenericTest01 {
    public static void main(String[] args) {
//        不实用泛型机制，分析程序存在缺点：
        List myList = new ArrayList();

//        准备对象
        Cat cat = new Cat();
        Bird bird = new Bird();

//        将对象加入集合当中
        myList.add(cat);
        myList.add(bird);

//        遍历集合，取出Cat让它抓老鼠，取出bird让它飞
//        获取迭代器
        Iterator it = myList.iterator();

        while (it.hasNext()){
//            没有这个语法，通过迭代器取出的就是Object
//            Animal a = it.next();

            Object obj = it.next();
//            obj中没有move方法，无法调用，需要向下转型：
            if (obj instanceof Animal){
                Animal a = (Cat) obj;
                a.move();
            }

        }
    }
}

class Animal{
//    父类自带方法：
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}