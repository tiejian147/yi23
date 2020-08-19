package com.tiejian147.collection;
/*
静态内部类
 */
public class MyClass {
//    声明一个静态内部类
    public static class InnerClass{
//        静态方法
        public static void doSome(){
            System.out.println("静态内部类doSome方法执行");
        }

//        实例方法
        public void m2(){
            System.out.println("静态内部类中的m2方法执行");
        }
    }

    public static void main(String[] args) {
//        调用静态内部类中的静态方法
//        类名：MyClass.InnerClass
        MyClass.InnerClass.doSome();
//        调用静态内部类中的实例方法
//        先创建对象
        MyClass.InnerClass mi = new MyClass.InnerClass();
//        再调用引用中的方法
        mi.m2();
    }
}
