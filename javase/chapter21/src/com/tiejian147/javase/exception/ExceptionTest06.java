package com.tiejian147.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
处理异常的第一种方式：
    在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁，抛给调用者来处理
    这种处理异常的态度：上报；

处理异常的第二种方式：
    使用try...catch语句对异常进行捕捉
    这个异常不会上报，自己就把这个事儿处理了；
    异常抛到此处为止，不再上抛了。

注意：只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。
        另外需要注意：try语句块中的某一行出现异常，该行后面的代码不会执行。
        try...catch捕捉异常之后，后续代码可以执行。
 */

public class ExceptionTest06 {
    /*
    一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给JVM，JVM只有终止程序。
    异常处理机制作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。
    所以，一般main方法中的异常建议使用try...catch进行捕捉，main就不要继续上抛了。

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main begin");

        m1();

        System.out.println("main over");
    }

     */

    public static void main(String[] args){
        System.out.println("main begin");

        try {
            m1();
//            以上代码出现异常，直接进入catch语句块中执行,下面这行代码就不执行了
            System.out.println("hello world");
        } catch (FileNotFoundException e) {//catch后面的好像一个方法的形参
//            这个分支中可以使用e引用，e引用保存的内存地址是那个异常对象
//            catch是捕捉异常之后走的分支
//            在catch分支中干什么？处理异常
            System.out.println("文件没找到");
            System.out.println(e);//java.io.FileNotFoundException: /Users/liushengchao/yi23/java学习笔记.docx (No such file or directory)
        }
//        在异常捕捉之后，下面代码还是会执行
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();

        //        如果以上代码出异常，下面代码就不执行了
        System.out.println("m1 finish");
    }

//    抛别的不行，抛ClassNotFoundException说明你还是没有对FileNotFoundException进行处理
//    public static void m2() throws ClassNotFoundException {//报错

//    抛FileNotFoundException 的父对象IOException,这样是可以的，因为IOException 包括FileNotFoundException

//    抛Exception也是可以的，因为Exception包括所有的异常
//    public static void m2() throws Exception {//不报错

//    throws后面也可以写多个异常，可以使用逗号隔开
//    public static void m2() throws FileNotFoundException, ClassNotFoundException{


      public static void m2() throws FileNotFoundException {//不报错
        System.out.println("m2 begin");
        /*
        编译器报错的原因是：m3()方法声明位置上有：throws FileNotFoundException
        我们再这里调用m3()方法没有对异常进行预处理，所以编译报错；

         */
        m3();
//      m3方法报异常了之后，下面这行代码不会执行
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
//        new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");//路径正确，不抛异常
        new FileInputStream("/Users/liushengchao/yi23/java学习笔记.docx");//路径不正确，抛异常

//        如果以上代码出异常，下面代码就不执行了
        System.out.println("抛异常会执行吗？");
    }

}
