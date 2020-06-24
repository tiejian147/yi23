/*
    抽象类：

 */

public class AbstractTest02 {
    public static void main(String[] args) {

    }
}

//动物类（抽象类）
abstract class Animal{

    //抽象方法
    public abstract void move();
}

//动物子类  继承动物类(非抽象的）
//class Bird extends Animal{
////    public abstract void move(){
////        System.out.println("test");
////    }
//
//}

/*
分析一下：
    Animal是父类，并且是抽象的；
    Animal这个抽象类中有一个抽象方法move();

    Bird是子类，并且是  非抽象的。
    Bird继承Animal之后，会将抽象方法也继承过来；

    但是抽象方法一定要出现在抽象类当中，所以就矛盾了

 */
