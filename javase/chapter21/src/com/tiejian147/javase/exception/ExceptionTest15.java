package com.tiejian147.javase.exception;

public class ExceptionTest15 {
    public static void main(String[] args) {
//        创建异常对象（只new了异常对象，并没有手动抛出）
        MyException me = new MyException("用户名不能为空");
//        打印异常堆栈信息
        me.printStackTrace();

//        获取异常简单描述信息
        String msg = me.getMessage();
        System.out.println(msg);
    }
}
