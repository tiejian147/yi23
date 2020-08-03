package com.tiejian147.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象的两个方法：
    String msg = e.getMessage();
    e.printStackTrace();//一般都是使用这个

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
    异常信息追踪信息，从上往下一行一行看。
    但是需要注意的是：SUN写的代码就不用看了，主要的问题是出现在自己编写的代码上。
 */
public class ExceptionTest09 {
    public static void main(String[] args) {

        try {
            m1();
        } catch (FileNotFoundException e) {

            String msg = e.getMessage();
            System.out.println(msg);///Users/liushengchao/yi/java学习笔记.docx (No such file or directory)
//            打印异常堆栈追踪信息
//            在实际的开发中，建议使用这个，养成好习惯
            e.printStackTrace();
/*      捕捉的异常信息为：
            java.io.FileNotFoundException: /Users/liushengchao/yi/java学习笔记.docx (No such file or directory)
                at java.io.FileInputStream.open0(Native Method)
                at java.io.FileInputStream.open(FileInputStream.java:195)
                at java.io.FileInputStream.<init>(FileInputStream.java:138)
                at java.io.FileInputStream.<init>(FileInputStream.java:93)
                at com.tiejian147.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:30)
                at com.tiejian147.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:26)
                at com.tiejian147.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:22)
                at com.tiejian147.javase.exception.ExceptionTest09.main(ExceptionTest09.java:15)

                因为30行代码出问题导致了26行
                26行代码出问题导致了22行
                22行代码出问题导致了15行

 */
        }
//        这里程序不耽误执行，很健壮，（服务器不会因为遇到异常而宕机）
        System.out.println("异常捕捉之后，程序不会停，这句话会打印出来");
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        new FileInputStream("/Users/liushengchao/yi/java学习笔记.docx");
    }
}
