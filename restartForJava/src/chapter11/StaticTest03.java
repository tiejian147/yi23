package restartForJava.src.chapter11;
/*
静态方法引用和实例方法的引用方式练习

 */
public class StaticTest03 {
    public static void main(String[] args) {
//        引用实例方法
        StaticTest03 st1 = new StaticTest03();
        st1.m1();
//        引用静态方法
        StaticTest03.m2();
    }
//    写一个实例方法
    public void m1(){
        System.out.println("实例方法引用成功");
    }
//    写一个静态方法
    public static void m2(){
        System.out.println("静态方法引用成功");
    }
}
