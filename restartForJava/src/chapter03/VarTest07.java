package chapter03;
/*
    1、关于变量的一个分类：
        变量根据出现的位置进行划分：
            在方法体当中声明的变量：局部变量；
            在类体当中声明的变量:成员变量
    2、注意：局部变量只在方法体当中有效，方法体执行结束后，变量的内存就释放了；
    3、变量的作用域：
        3.1、什么是作用域：变量的有效范围；
        3.2、关于变量的作用域，记住一句话：出了大括号就不认识了。
        3.3、java中有一个很重要的原则：
            就近原则。（不仅java是这样，其他编程语言都有这个原则）
            哪个离我近就访问哪个。
 */
public class VarTest07 {
//    成员变量
    int i = 10;
    public static void main(String[] args) {
//        局部变量
        int k = 100;
        System.out.println(k);
//        System.out.println(i);
    }
}
