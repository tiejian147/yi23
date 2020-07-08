package com.tiejian147.javase.array;
/*
*       关于每个类型的默认值还是否还有印象：
*       数据类型            默认值
* -----------------------------------
*       byte                0
*       short               0
*       int                 0
*       long                0L
*       float               0.0F
*       double              0.0
*       boolean             false
*       char                \u0000
*       引用数据类型          null
*
*
*       什么时候采用静态初始化方式，什么时候采用动态初始化方式呢？
*           当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式；
*           当你创建数组的时候，不确定将来数组中存储哪些数据，你可以采用动态初始化的方式，预先分配内存空间。
*
* */


public class ArrayTest02 {
    public static void main(String[] args) {

//        声明/定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];

//        遍历数组
        for(int i = 0; i < a.length; i ++){
            System.out.println("数组中下标为" + i + "的元素是：" + a[i]);
        }

        System.out.println("-----------------------");

//        初始化一个Object类型的数组，采用动态初始化的方式
//        3个长度，动态初始化，所以每个元素默认值是null
        Object[] obj = new Object[3];
        for (int i = 0; i < obj.length ; i++) {
            System.out.println(obj[i]);
        }

        System.out.println("-----------------------");

        Object[] str1 = new Object[4];
        for (int i = 0; i < str1.length ; i++) {
            System.out.println(str1[i]);
        }

        System.out.println("-----------------------");
//        采用静态初始化的方式
        String[] str2 = {"1243","sdfdsf","测试"};
        for (int i = 0; i < str2.length ; i++) {
            System.out.println(str2[i]);
        }
        System.out.println("-----------------------");

//      存储Object，采用静态初始化？
        /*
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1, o2, o3};
        */

//        也可以这样写：
        Object[] objects = {new Object(), new Object(), new Object()};

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
