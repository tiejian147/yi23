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
public class GenericTest01 {
    //这是不用泛型的写法
    public static void main(String[] args) {
        //创建一个集合
        List mylist = new ArrayList();
        //创建一些对象
        Cat cat = new Cat();
        Bird bird = new Bird();
        //添加对象
        mylist.add(cat);
        mylist.add(bird);

        //迭代器
        Iterator it = mylist.iterator();
        //遍历迭代器
        while (it.hasNext()){
            //遍历猫抓老鼠的方法
            Object o = it.next();
            if (o instanceof Cat){
                Cat c = (Cat) o;
                c.catchMouse();
            }
            //遍历鸟儿飞翔的方法
            if (o instanceof Bird){
                Bird b = (Bird) o;
                b.fly();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿飞翔");
    }
}
