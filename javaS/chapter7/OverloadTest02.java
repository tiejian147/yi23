/*
    使用方法重载机制，解决之前的两个缺点：
        优点1：代码整齐美观。
        优点2：“功能相似”的，可以让方法名相同，更易于以后的代码编写。

    在java语言中，是怎么进行区分的呢？
        首先java编译器会通过方法名进行区分。
        但是在java语言中会出现方法名称相同的情况。
        如果方法名称相同的情况下，编译器会通过方法的参数类型进行方法的区分。
*/


public class OverloadTest02 {
    public static void main(String[] args){
        //调用下面的sumInt方法
        System.out.println(sum(7, 9));
        //调用sumLong方法
        System.out.println(sum(100L, 200L));
        //调用sumDouble方法
        System.out.println(sum(50.0, 100.0));

    }
    //定义一个求和的方法 Int类型
    public static int sum(int a,int b){
        System.out.println("Int求和");
        return a + b;
    }
    //定义一个求和的方法 Long类型
    public static long sum(long c ,long d){
        System.out.println("Long求和");
        return c + d;
    }
    //定义一个求和的方法 Double类型
    public static double sum(double m ,double n){
        System.out.println("Double求和");
        return m + n ;

    }
}