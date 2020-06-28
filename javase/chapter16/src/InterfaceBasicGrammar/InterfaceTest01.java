/**
 * 接口：
 *      1、接口也是一种引用数据类型。编译之后也是class文件。
 *      2、接口是完全抽象的。（抽象类是半抽象）或者也可以说接口是特殊的抽象类。
 *      3、接口怎么定义？语法是什么？
 *      [修饰符列表] interface 接口名{}
 *
 *      4、接口
 */

public class InterfaceTest01 {
    public static void main(String[] args) {

    }
}
//测试一下，定义一个接口
interface A{

}

//定义接口B
interface B{

}

//一个接口可以继承多个接口(支持多继承)
interface C extends A,B{

}


