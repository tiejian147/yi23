package chapter16;
/*
抽象类
抽象方法：
表示没有实例化的方法，没有方法体的方法
public abstract void doSome();
抽象类中不一定有抽象方法；但是抽象方法必须要写到抽象类当中。
重要：五颗星：
    一个非抽象类继承抽象类，必须要把抽象类中的抽象方法实现了，不然会报错；
 */
public class AbstractTest01 {
    public static void main(String[] args) {
//        A a = new A();抽象类是无法实例化的；
        Animal a1 = new Dog();//多态，向上转型
        a1.move();//编译的时候调的是Animal中的move方法，运行的时候调的是dog中的move方法；
    }
}

abstract class A{
    public abstract void doSome();
}

abstract class Animal{
    public abstract void move();
}

class Dog extends Animal{
    public  void move(){
        System.out.println("dog eats ...");
    }
}


