package chapter07;
/*
重温方法：
    调用方法时，如果方法在本类中，那么前缀的类名可以省略；
    如果方法不在本类中，就需要：类名.方法；

    break 和 return 的区别；
    break 控制的是循环，当循环中有break时，离他最近的循环语句终止；
    return 控制的是方法，当一个方法中有return时，方法体直接终止，return下面的语句都不会执行；
 */
public class MethodTest01 {
    public static void main(String[] args) {
//        调用加法方法
        MethodTest01.sumInt(100,100);
        MethodTest01.sumInt(10,10);

//        调用减法方法，声明一个变量接收数据

        int num1 = MethodTest01.subtraction(15,4);
        System.out.println("第一个减法结果为：" + num1);

//        或者不声明变量，直接接收：
        System.out.println("第二个减法结果为：" + MethodTest01.subtraction(5,4));

//        调用m1方法
        MethodTest01.m1();
        MethodTest01.m2();
    }


    //        写一个加法的程序方法
    public static void sumInt(int x , int y){
        int z = x + y ;
        System.out.println("两个数字之和为：" + x + "+" + y + "=" + z);

    }

//    写一个减法的方法
    public static int subtraction(int m, int n){
        return (m - n);
    }

    public static void m1(){
        System.out.println("苹果");
        System.out.println("为啥呢" + MethodTest01.m2());
    }

    public static String m2(){
        return "1";
    }
}
