package chapter08;
/*
有什么就 "." 什么，示例：
 */
public class T {
    A a ;

    public static void main(String[] args) {
        T t = new T();
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        t.a = a;
        a.b = b;
        b.c = c;
        c.d = d;

        d.i = 5;
//        现在编写代码 通过t来访问d中的i
        System.out.println("i=" + t.a.b.c.d.i);
    }
}

class A{
    B b;
}

class B{
    C c;
}

class C{
    D d;
}

class D{
    int i;
}
