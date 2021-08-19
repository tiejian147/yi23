package chapter16;
/*
接口：接口可以看做是特殊的抽象类。
   接口中只允许出现两个类型：
      抽象方法和常量；

   接口支持多继承，
   interface C extends A,B{}

   实现接口中的方法，要用：implement

   一个类可以同时实现多个接口。

接口开发的作用：
    面向接口编程，可以降低程序的耦合度，提高程序的扩展力，符合OCP开发原则。
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        System.out.println(ATest.K);
//        ATest.K = 200;常量不能更改，所以会报错
        System.out.println(ATest.K);
        ATest at = new BTestImpl();
        System.out.println(at.sub(20,10));
        System.out.println(at.sub(100,200));
        at.doSome();
    }
}

interface ATest{
    public static final int K = 100;
    public abstract void doSome();
    int sum(int a, int b);
    int sub(int m,int n);
}

class BTestImpl implements ATest{
    @Override
    public void doSome() {
        System.out.println("接口中的doSome方法重写...");
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int m, int n) {
        return m + n;
    }
}
