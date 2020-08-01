package com.tiejian147.javase.exception;

public class ExceptionTest05 {
    /*
//    第一种处理方式：在方法声明的位置上继续使用：throws ，来完成异常的继续上抛，抛给调用者
    上抛类似于推卸责任（继续吧异常传递给调用者）
    public static void main(String[] args) throws ClassNotFoundException {

        doSome();

    }

     */

//    第二种方式：使用try...catch进行捕捉
    public static void main(String[] args){
//    捕捉等于吧异常拦下了，异常真正的解决了（调用者是不知道的）
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!!");
    }
}
