package chapter03;
/*
    什么是变量？
        变量其实就是内存当中存储数据最基本的单元；

    在java语言中任何数据都是有数据类型的，其中整数型是：int

    当然在java中除了数据类型int之外还有其他的数据类型，例如：带小数的 double等

    数据类型有什么用？
        不同的数据类型在内存当中分配的空间大小不同；

    int这种整数型的数据类型，JVM会自动分配4个字节大小的空间；

    1个字节= 8比特位；
    1个比特位就是一个1或0。注意：比特位就是二进制位。
    int是占用多少个比特位：1个int占有32个二进制位（bit位）

    对于一个变量来说，包括三要素：
        变量的数据类型；
        变量的名称；
        变量中保存的值；

    变量的执行顺序不能乱：变量要先声明，然后才能打印出来；
    同一个域当中的变量名称不能重复；即使是不同的数据类型，变量名称一样也不行；

 */
public class VarTest02 {
    public static void main(String[] args) {
//        定义一个变量
//        等号右边先执行，然后把值赋给等号左边的变量
        int age ;
        age = 10;
        System.out.println("年龄：" + age);

//        可以重新赋值
        age = 20;
        System.out.println("年龄：" + age);

//        再次赋值
        age = 30;
        System.out.println("年龄：" + age);

//        可以直接赋值：
        int weight = 80;
        System.out.println(weight + "kg");

//
    }
}
