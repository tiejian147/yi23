package chapter03;
/*
    变量的第一个测试程序：Var是变量；

    1、关于程序当中的数据？
        开发软件是为了解决现实世界当中的问题。
        而现实世界中，有很多问题都是使用数据进行描述的，
        所以软件执行过程中最主要就是对数据的处理。

        软件在处理数据之前需要能够表示数据，在java代码中，怎么去
        表示数据呢？在java中有这样一个概念：“字面量”

        注意：在java语言中，数据被称为“字面量”。
        10
        1.23
        true
        false
        'a'
        "abc"
        以上这些都是数据，在程序中都被叫做"字面量"

        字面量可以分为很多种类：
        整数型字面量：10   100  123  -1
        浮点型字面量：1.2   1.3   3.14
        布尔型字面量：true false  除此之外没有了，就这两个单词
        字符型字面量：'a'   'b'   'c'
        字符串型字面量："abc"  "name"  "中国"

        其中字符型和字符串型都是描述了现实世界中的文字；
           注意：
              所有的字符型都是单引号；
              所有的字符串型都是双引号；
              字符型一定是单个字符，才能叫做字符型；
           所以单引号括起来的一定是字符型；
           双引号括起来的一定是字符串型；

     2、什么是变量？

 */
public class VarTest01 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(true);
        System.out.println(false);
        System.out.println('a');
        System.out.println("abc");
        System.out.println("中国");

//        以下这三个10在内存空间中是三块空间；虽然都是10，但是占用的却是三个不同的空间；
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
//        定义一个变量，起名i
        int i = 100;
//        以下这三次访问，都是访问的是同一个内存空间（这样使用变量，内存空间就得到了复用）
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);


    }
}
