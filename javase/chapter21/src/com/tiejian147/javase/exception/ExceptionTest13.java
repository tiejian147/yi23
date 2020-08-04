package com.tiejian147.javase.exception;

public class ExceptionTest13 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }

    /*
    java语法中规则（有一些规则是不能破坏的，一旦这么说了，就必须这么做！）：
        java中有一条这样的规则：
            方法体中的代码必须遵循自上而下的顺序依次逐行执行（亘古不变的语法规则！）

        java中还有一条语法规则：
            return语句一旦执行，整个方法必须结束（亘古不变的语法规则！！）
     */

    public static int m(){
        int i = 100;
        try {
//            这样代码出现在int i = 100;的下面，所以最终结果必须是返回100；
//            return语句还必须保证是最后执行的，一旦执行，整个方法结束。
            return i;
        }finally {
            i ++;
            System.out.println("这里的i:" + i);
        }
    }
}

/*
反编译之后的代码：
public static int m(){
    int i = 100;
    int j = i ;
    i ++;
    return j;
}
 */
