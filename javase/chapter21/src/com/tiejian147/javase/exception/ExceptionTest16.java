package com.tiejian147.javase.exception;
/*
测试改良之后的MyStack

注意：
    最后这个例子是异常最重要的案例，必须掌握。自定义异常在实际开发中的应用。
 */
public class ExceptionTest16 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        try {
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
//            这里就要压栈压满了
            System.out.println("要满了");
            ms.push(new Object());
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
//            这里弹空了
            System.out.println("要弹空了");
            ms.pop();

        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }

}
