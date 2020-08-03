package com.tiejian147.javase.exception;
/*
异常对象有两个非常重要的方法：

    获取异常简单的描述信息：
        String msg = exception.getMessage();

    打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
//        这里只是为了测试getMessage()方法和printStackTrace()方法
//        这里只是new了异常对象，但是没有将异常对象抛出，JVM会认为这是一个普通的java对象
        NullPointerException nullPointerException = new NullPointerException("空指针异常");

//        获取异常简单描述信息：这个信息实际上就是构造方法上面String参数。
        String msg = nullPointerException.getMessage();//空指针异常

        System.out.println(msg);

//        打印异常堆栈信息
//        java后台打印异常堆栈追踪信息的时候门采用了异步现成的方式打印的
        nullPointerException.printStackTrace();

        System.out.println("hello world");
    }
}
