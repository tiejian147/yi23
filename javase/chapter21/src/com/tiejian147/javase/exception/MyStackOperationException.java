package com.tiejian147.javase.exception;
/*
创建MyStack的异常类
 */
public class MyStackOperationException  extends Exception{
//    不要问，记住这样写就对了
//    编写两个构造方法，一个是无参的
    MyStackOperationException(){

    }

//    一个是有参的
    MyStackOperationException(String e){
        super(e);
    }
}
