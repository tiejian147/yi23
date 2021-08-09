package chapter13;
/*
方法的覆盖：
    当子类继承父类之后，继承过来的方法无法满足当前子类的业务需求的时候，需要方法覆盖。
    子类有权利对继承的方法进行重写。
    方法的覆盖就是将继承过来的方法给覆盖掉了，继承过来的方法没了。

这个和方法重载不一样：
   满足方法重载的条件：
       条件一：在同一个类当中
       条件二：方法名相同
       条件三：参数列表不同（个数，顺序，类型）
   满足方法覆盖的条件：
       条件一：两个类必须要有继承关系
       条件二：重写之后的方法和之前的方法有：
              相同的返回值类型；
              相同的方法名；
              相同的形式参数列表；
       条件三：访问权限不能更低，可以更高（这个后面再说）
       条件四：重写之后的方法不能比之前的方法抛出更多的异常，可以更少...

   覆盖方法的注意事项：
       注意一：方法覆盖只是针对方法，和属性无关；
       注意二：私有方法不能覆盖；
       注意三：构造方法不能被继承，所以构造方法也不能被覆盖；
       注意四：方法覆盖只是针对于实例方法，静态方法覆盖没有意义。
 */
public class OverrideTest01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();
        Bird b1 = new Bird();
        b1.move();
        Cat c1 = new Cat();
        c1.move();

    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Bird extends Animal{
    //其实这里想输出：鸟儿在飞翔
    public void move(){
        System.out.println("鸟儿在飞翔");
    }
}
class Cat extends Animal{
    //其实这里想输出：猫儿在走猫步
    public void move(){
        System.out.println("猫儿在走猫步");
    }
}

