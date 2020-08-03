package com.tiejian147.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try...catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型；
    2、catch可以写多个，建议catch的时候，精确的一个一个处理，这样有利于程序的调试。
    3、catch写多个的时候，从上到下，必须遵守从小到大。

在以后的开发中，处理编译时异常，应该上报还是捕捉呢？
    如果希望调用者来处理，选择throws上报。
    其他情况使用捕捉的方式。
 */
public class ExceptionTest07 {
    /*   这里拼接多个异常都可以
        public static void main(String[] args) throws Exception, FileNotFoundException,NullPointerException {

        }

     */

    public static void main(String[] args) {

        /*
        try{
            FileInputStream fip = new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
        }catch(NullPointerException e){

        }*/

        /*try{
            FileInputStream fip = new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
            System.out.println("以上代码如果出异常，那么这行代码就不会执行");
        }catch(FileNotFoundException e){
            System.out.println("文件没找到");
        }
//        不管上面走的那个代码块，都走下面的代码
        System.out.println("hello world");*/

        /*try{
            FileInputStream fip = new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
            System.out.println("以上代码如果出异常，那么这行代码就不会执行");
        }catch(IOException e){//多态：IOException e = new FileNotFoundException();
            System.out.println("文件没找到");
        }*/

        /*下面编译报错：因为第二个catch永远运行不到
        try{
//            创建输入流
            FileInputStream fis = new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
            System.out.println("以上代码如果出异常，那么这行代码就不会执行");
//            读文件
            fis.read();
        }catch(FileNotFoundException e){//多态：Exception e = new FileNotFoundException();
            System.out.println("文件没找到");
        }catch(IOException e){
            System.out.println("读文件失败");
        }*/

        try{
//            创建输入流
            FileInputStream fis = new FileInputStream("/Users/liushengchao/yi23/javase/java学习笔记.docx");
//            进行数学运算
            System.out.println(100 / 0);//这个异常是运行时异常，编写程序时可以处理，也可以不处理
//            读文件
//            fis.read();
//            下面这种写法是JDK8之后支持的写法
        }catch(FileNotFoundException | ArithmeticException | NullPointerException e){
            System.out.println("文件没找到");
        }



    }

}
