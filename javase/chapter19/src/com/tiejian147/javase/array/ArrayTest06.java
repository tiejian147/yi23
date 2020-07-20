package com.tiejian147.javase.array;

public class ArrayTest06 {
    public static void main(String[] args) {

//        这个main方法的参数是在工具栏中的run > edit configuartions > program arguments
//        进行填写参数
        if(args.length != 2){
            System.out.println("使用该系统时请输入程序参数，例如：liucs 111");
            return;
        }
//        程序执行到这里说明提供了用户名和密码
//        接下来你应该判断用户名和密码是否正确。
//        取出用户名：
        String username = args[0];
        String password = args[1];

//      判断两个字符串是否相等，需要使用equals方法
//        但是这样编写有可能会空指针异常
//        if (username.equals("admin") && password.equals("123")) {
//        采用以下编码风格，即使username和password都是null，也不会出现空指针异常，（这是老程序员的经验）
        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println("登录成功，欢迎[" + username + "]回来");
            System.out.println("您可以继续使用该系统...");
        }else{
            System.out.println("验证失败，用户名不存在或者密码错误");
        }
    }
}
