package com.tiejian147.javase.array;

/*
*   1、main方法上面的"String[]"有什么用？
*       分析一下：谁负责调用main方法：JVM
*
*
* */

public class ArrayTest05 {
    public static void main(String[] args) {
//       JVM默认传递过来的这个数组对象的长度：默认0
//        通过测试得出：args不是null
        System.out.println("JVM给传递过来的String数组参数，它这个数组的长度是：" + args.length);

//        以下这一行代码表示的含义：数组对象创建了，但是数组中没有任何数据：
        String[] strs = new String[0];
        printLength(strs);

//      这个数组什么时候里面会有值呢?
//        其实这个数组是留给用户的，用户可以在控制台时行输入参数，这个参数自动会被转换为"String[] args"
//        例如这样运行程序：java ArrayTest05 aba sdfsd ass
//        那么这个时候JVM会自动将"aba sdfsd ass" 通过空格发的方式进行分离，分离完成之后，自动放到"String[] args"数组当中；
//        所以main方法上面的String[] args数组主要是用来接收用户输入参数的。


    }
    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
