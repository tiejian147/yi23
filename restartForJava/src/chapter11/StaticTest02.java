package chapter11;

public class StaticTest02 {
    public static void main(String[] args) {
//        引用实例方法
        StaticTest02 st1 = new StaticTest02();
        st1.m2();
//        引用静态方法
        StaticTest02.m1();
    }
    public static void m1(){
        System.out.println("静态方法执行");
    }
    public void m2(){
        System.out.println("实例方法执行");
    }
}
