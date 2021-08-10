package chapter14;
/*
super和super()
结论：
    当一个构造方法既没有this()又没有super()的时候，第一行默认会有一个super()
    表示通过当前子类的构造方法调用父类的无参构造方法；
    所以必须要保证父类的无参构造方法是存在的。
    this()和super()不能共存，他们都只能出现在构造方法的第一行。
 */
public class SuperTest01 {
    public static void main(String[] args) {
        new B();
    }
}

class A{
    public A(){
        System.out.println("A类中的方法执行了");
    }
}

class B extends A{
    public B(){
        super();//这里默认是有一个super()的，不写也有；
        System.out.println("B类中的方法执行了");
    }
}