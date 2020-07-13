package com.tiejian147.javase.array;

//  一维数组的深入，数组中存储的类型为：引用数据类型
//  对于数组来说， 实际上只能存储java对象的"内存地址"，数组中存储的每个元素是"引用"。
public class ArrayTest07 {
    public static void main(String[] args) {
//        创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //对Animal数组进行遍历：
        for (int i = 0; i < animals.length; i++) {
            /*
            Animal a = animals[i];
            a.move();

             */
//            上面的代码还能代码合并：
            animals[i].move();
        }

//        初始化一个长度为2的Animal类型数组
        Animal[] animal2 = new Animal[2];

//        创建一个Animal对象，放到数组的第一个盒子中
        animal2[0] = new Animal();

//        Animal数组中只能存放Animal类型，不能存放Product类型
//        animal2[1] = new Product();//这行会报错

//        Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal
//        cat是Animal的子类
        animal2[1] = new Cat();

        animal2[1].move();
        System.out.println("11111");
        System.out.println("2222");
        System.out.println("3333");





    }
}
//动物类
class Animal{
    public void move(){
        System.out.println("animal is moving...");
    }
}

//商品类

class Product{

}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat is moving...");
    }
}