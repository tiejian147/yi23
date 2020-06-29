
/*
*   继承和实现都存在的话，代码应该怎么写？
*       extends 关键字在前；
*       implements 关键字在后。
* */


public class InterfaceTest04 {
    public static void main(String[] args) {
        Flyable f1 = new Cat();//多态

        f1.fly();

        Flyable f2 = new Pig();//多态

        f2.fly();

        Flyable f3 = new Fish();

        f3.fly();
    }
}

//动物类：父类
class AnimalTwo{

}

//可飞翔的接口
interface Flyable{
    void fly();
}

//动物类子类：猫类
class Cat extends AnimalTwo implements Flyable{
    public void fly(){
        System.out.println("飞猫起飞~~~");
    }
}

//蛇类，如果你不想让它飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能飞
class Snake extends AnimalTwo{

}

//想飞就上插翅膀的接口
class Pig extends AnimalTwo implements Flyable{
    public void fly(){
        System.out.println("这是一只会飞的猪~~");
    }
}

//鱼（默认实际上是存在继承的，默认继承Object）
//class Fish extends Object implements Flyable{
//
//}

//没写extends,也是有的，默认继承Object
class Fish implements Flyable{
    public void fly(){
        System.out.println("飞鱼！！！");
    }
}


