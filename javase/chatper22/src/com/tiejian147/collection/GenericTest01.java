package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用！）
3、泛型的优点是：
    第一：集合中存储的元素类型统一了；
    第二：从集合中取出的元素类型是泛型指定的类型，不需要大量的进行“向下转型”；

4、泛型的缺点是什么:
    导致集合中存储的元素缺乏多样性！
    大多数业务中，集合中元素类型还是统一的，所以这种泛型语法机制被大家所认可。
 */
public class GenericTest01 {
    public static void main(String[] args) {
        /*
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
        */

//        使用JDK5之后的泛型机制
//        使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据；
//        用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<Animal>();

//        使用泛型之后，下面的代码就会报错了，因为已经指定了存储的数据类型
//        这样用了泛型之后，集合中元素的数据类型就更加统一了
//        myList.add("add");

        //        准备对象
        Cat cat = new Cat();
        Bird bird = new Bird();

//        添加对象
        myList.add(cat);
        myList.add(bird);

//        获取迭代器
//        这个表示迭代器迭代的是Animal类型
        Iterator<Animal> it = myList.iterator();

        while (it.hasNext()) {
//            使用泛型之后，每一次迭代返回的数据都是Animal类型
//            Animal a = it.next();
//            这里不需要进行类型转换了，直接调用
//            a.move();

//            调用子类型特有的方法还是需要向下转型的；
            Animal a = it.next();

            if (a instanceof Cat){
                Cat cat1 = (Cat)a;
                cat1.catchMouse();
            }
            if (a instanceof Bird){
                Bird bird1 = (Bird)a;
                bird1.fly();
            }
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