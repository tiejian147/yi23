/**
 * i变量能不能再main方法中访问？
 */

public class ThisTest02{
    //这个变量是静态变量，可以在静态方法中直接访问，不用new对象
    static int k = 111;
    //这个变量是实例变量
    int i = 10;
    //下面这个方法是静态方法
    public static void main(String[] args){
        //不能直接访问，需要先new对象才能通过”引用.“来访问
        ThisTest02 num1 = new ThisTest02();
        //没有new对象不能直接访问i
        System.out.println(num1.i);
        //静态方法在同一个类中   可以直接访问

        System.out.println(k);

        //正式的写法是：
        System.out.println(ThisTest02.k);


    }
}