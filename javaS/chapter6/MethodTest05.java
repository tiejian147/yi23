/*
    java代码一定是遵循自上而下的顺序依次执行
*/

public class MethodTest05 {
    public static void main(String[] args){
        //调用m1方法
        System.out.println("main begin");
        m1();
        System.out.println("main begin");

    }
    public static void m1(){
        //调用程序不一定写到main方法中，不要把main方法特殊化。
        //main方法也是一个普通方法。
        System.out.println("m1 begin");
        m2();

        System.out.println("m1 begin");
    }
    public static void m2(){
        System.out.println("m2 begin");
        T.m3();

        System.out.println("m2 begin");

    }
}
class T{
    public static void m3(){
        System.out.println("m3 begin");
        System.out.println("这里瞎写");
        System.out.println("m3 over");

    }
}