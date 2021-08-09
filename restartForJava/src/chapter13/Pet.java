package chapter13;

public class Pet {
    public void eat(){
        System.out.println("吃...");
    }
}

class Dog extends Pet{
    public void eat(){
        System.out.println("小狗狗正在啃骨头");
    }
}

class Fish extends Pet{
    public void eat(){
        System.out.println("鱼儿正在吃鱼虫");
    }
}

class Mouse extends Pet{
    public void eat(){
        System.out.println("老鼠正在磨牙吃木头");
    }
}