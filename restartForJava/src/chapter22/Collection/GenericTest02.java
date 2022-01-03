package chapter22.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
泛型机制，JDK5之后的新特性
    1、泛型的好处是：
        第一：集合中存储的元素类型统一了；
        第二：集合中取出的元素类型是泛型指定的类型，不需要大量的向下转型；
    2、泛型的缺点：
        导致集合中的元素缺乏多样性。
        大多数业务中，集合中元素的类型还是统一的，所以这种泛型机制被大家所认可。
 */
public class GenericTest02 {
    //这是使用泛型的写法
    public static void main(String[] args) {
        //创建一个集合
        List<Animal2> mylist2 = new ArrayList<>();
        //创建一些对象
        Animal2 animal2 = new Animal2();
        Cat2 cat2 = new Cat2();
        Bird2 bird2 = new Bird2();
        //添加对象
        //mylist2.add(cat2);
        mylist2.add(animal2);

        Iterator<Animal2> iterator = mylist2.iterator();

        while (iterator.hasNext()){
            Animal2 animal21 = iterator.next();
//            System.out.println(animal21.move());
        }







    }
}

class Animal2{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat2 extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird2 extends Animal{
    public void fly(){
        System.out.println("鸟儿飞翔");
    }
}
