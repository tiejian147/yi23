/*
    分析程序的输出结果。
    java中规定：参数传递的时候，和类型无关，不管是基本数据类型还是引用数据类型，
    统一都是将盒子中保存的那个“值”复制一份，传递下去。

    内存地址也是值，也是盒子中保存的一个东西。

*/

public class Test01 {
    public static void main(String[] args){
        int x = 100;
        int y = x;//x赋值给y，是怎么传递的？将x变量中保存的100复制一份传给y

        //局部变量，作用域是main
        int i = 10;
        //将i变量中的10复制一份，传给add方法
        add(i);
        System.out.println("main方法-->" + i);// 输出10；
    } 
    
    public static void add(int i){//i是局部变量，作用域是add方法
        i ++;
        System.out.println("add方法-->" + i);//输出11；
    }
}