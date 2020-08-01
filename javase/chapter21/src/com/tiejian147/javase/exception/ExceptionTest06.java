package com.tiejian147.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    public static void main(String[] args) {
        System.out.println("main begin");

    }

    public static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 finish");
    }

//    抛别的不行，抛ClassNotFoundException说明你还是没有对FileNotFoundException进行处理
//    public static void m2() throws ClassNotFoundException {
//    抛FileNotFoundException 的父对象IOException,这样是可以的，因为IOException 包括FileNotFoundException
      public static void m2() throws IOException {
        System.out.println("m2 begin");
        /*
        编译器报错的原因是：m3()方法声明位置上有：throws FileNotFoundException
        我们再这里调用m3()方法没有对异常进行预处理，所以编译报错；

         */
        m3();
        System.out.println("m2 finish");
    }

    public static void m3() throws FileNotFoundException {//这里在声明的位置上添加 throws FileNotFoundException 就没报错了
        /*
        调用SUN JDK中某个类的构造方法
        这个类还没有接触过，后期IO流的时候就知道了
        我们只是借助这个类学习一下异常处理机制
        创建一个输入流对象，该流指向一个文件
         */
        /*
        编译报错的原因是什么：
            第一：这里调用了一个构造方法：FileInputStream(String name)
            第二：这个构造方法的声明位置上有：throws FileNotFoundException
            第三：通过类的继承结构看到：FileNotFoundException 的父类是 IOException, IOException 的父类
                是Exception;
            最终得知：FileNotFoundException 是编译时异常。

        错误原因：编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器就报错；
         */
        new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
    }

}
