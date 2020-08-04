package com.tiejian147.javase.exception;
/*
1、SUN公司提供的JDK内置的异常肯定是不够用的，在实际的开发中，有很多业务。
    这些业务出现异常后，JDK中都是没有的，异常需要和业务挂钩的。
    那么异常类我们程序员可以自己定义吗？
        可以的。

2、java中怎么自定义异常呢？
    两步：
        第一步：编写一个类继承Exception或者 RuntimeException；
        第二步：提供两个构造方法，一个无参的，一个带有String参数的；

    死记硬背。先别问为什么，先这么写上。
 */
public class MyException extends Exception{//编译时异常
    public MyException(){

    }

    public MyException(String s){
        super(s);
    }
}

/*public class MyException extends RuntimeException{//运行时异常

}*/
