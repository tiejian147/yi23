package chapter10;
/*
实例方法的调用
 */
public class MethodTest01 {
    public static void main(String[] args) {
//        调用静态方法
        MethodTest01.doSome();
//        调用非静态方法,先new 对象，然后调用方法---实例方法
        MethodTest01 mt = new MethodTest01();
        mt.doOther();
    }
//    带static 方法的调用
    public static void doSome(){
        System.out.println("静态方法调用");
    }
//    不带static方法
    public void doOther(){
        System.out.println("非静态方法调用");
    }
}
