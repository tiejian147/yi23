/*
*   接口的基础语法：
*       1、类和类之间叫做继承，类和接口之间叫做实现。
*            你仍然可以将实现看做"继承"
*            继承使用extends关键字完成。
*            实现使用implements关键字完成。
*
*       2、五颗星（*****）：当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法
*          全部实现（覆盖，重写）。
*
* */

public class InterfaceTest02 {
    public static void main(String[] args) {
        //接口能实例化吗？不可以
        //编译报错：MyMath()是抽象的，无法实例化
//        new MyMath();

        //能使用多态吗？可以
        //举例：Animal a = new bird();

        //父类型的引用指向子类型的对象
        MyMath m1 = new MyMathImpl();

        //调用接口里面的方法（面向接口编程）
//        m1.sub(5,6);
        System.out.println(m1.sub(5,6));

        System.out.println(m1.sum(10,20));

    }
}

//特殊的抽象类，完全抽象的，叫做接口
interface MyMath{

    //常量

    double PI = 3.1415926;

    //抽象方法

    int sum(int a, int b);

    int sub(int m, int n);

}

//这样写是没问题的（有abstract,抽象类继承了抽象类）
//abstract class MyMathImpl implements MyMath {
//
//}

//编写一个类，（这个类是一个"非抽象"的类）
//这个类的名字是随意的
//以下代码报错：Error:(38, 1) java: MyMathImpl不是抽象的, 并且未覆盖MyMath中的抽象方法sub(int,int)
//class MyMathImpl implements MyMath {
//
//}

//修正：
class MyMathImpl implements MyMath {
    //以下代码编译会报错：
    //Error:(49, 10) java: MyMathImpl中的sum(int,int)无法实现MyMath中的sum(int,int)
    //  正在尝试分配更低的访问权限; 以前为public
//    int sum(int a, int b){
//        return a + b;
//    }

    //重写/覆盖/实现 接口中的方法（通常叫实现）
    public int sum(int a, int b){
        return a + b;
    }

    //必须要实现接口中的所有的方法
    public int sub(int m, int n){
        return m - n;
    }
}

