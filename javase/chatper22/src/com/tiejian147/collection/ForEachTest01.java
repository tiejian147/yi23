package com.tiejian147.collection;
/*
JDK5.0之后推出了一个新特性，叫做增强for循环，或者叫做foreach
 */
public class ForEachTest01 {
    public static void main(String[] args) {
//        int数组
        int[] arr = {23,43,12,43,31,54,33};

//        遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        增强for 或者叫foreach
//        以下是语法
        /*
        for(元素类型 变量名：数组或集合){
            System.out.println(变量名);
        }
         */

        System.out.println("=======================");

//        上面的遍历就可以写成下面：
//        但是foreach有个缺点：没有下标。在需要使用下标的循环中，不建议使用foreach
        for(int data: arr){
//            data就是数组中的元素（数组中的每一个元素）
            System.out.println(data);
        }

    }
}
