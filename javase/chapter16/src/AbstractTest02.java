/*
    抽象类：
        1、抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中；
        2、重要结论：重要结论五颗星*****
            一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
            这是java语法上强行规定的，必须的，否则编译器会报错；

            这里的覆盖或者说重写，也可以叫做实现。（对抽象的实现）

 */

public class AbstractTest02 {
    public static void main(String[] args) {
        //这里能不能使用多态？
        //父类型引用指向子类型对象。
        //这就是面向抽象编程，向上转型

        //多态（当对多态不是很理解的时候，以后写代码的时候能用多态就多用多态，
        // 慢慢就理解了）
        Animal a = new Bird();

        //以后编写代码都是调用的a.xxx
        //a的类型是Animal，Animal是抽象的
        //面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力
        //这种变成思想符合OCP原则。


        a.move();
    }
}

//动物类（抽象类）
abstract class Animal{

    //抽象方法
    public abstract void move();
}

//动物子类  继承动物类(非抽象的）
class Bird extends Animal{

    //这里继承过来的抽象方法要进行覆盖/重写，也可以叫做"实现"：
    //去掉abstract 就可以了，这样就不会编译报错了
    public void move(){
        System.out.println("鸟儿在飞翔~");
    }

}

/*
分析一下：
    Animal是父类，并且是抽象的；
    Animal这个抽象类中有一个抽象方法move();

    Bird是子类，并且是  非抽象的。
    Bird继承Animal之后，会将抽象方法也继承过来；

    但是抽象方法一定要出现在抽象类当中，所以就矛盾了

 */

//如果继承的子类也是抽象的，那么Animal中的抽象方法就不用重写/覆盖了
//下面的代码就没有报错了

abstract class Dog extends Animal{

}
