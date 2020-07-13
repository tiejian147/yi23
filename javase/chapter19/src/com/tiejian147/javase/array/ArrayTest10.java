package com.tiejian147.javase.array;

/*
*   关于二维数组中元素的：读和改
*       a[二维数组中的一维数组的下标][一维数组的下标]
*       a[0][0]：表示第一个一维数组中的第一个元素
*       a[3][100]： 表示第四个一维数组中的第101个元素
*
*       注意：对于a[3][100] 来说，a[3]是一个整体。[100]是前面a[3]执行结束的结果然后再下标100
*
* */

public class ArrayTest10 {
    public static void main(String[] args) {
//        二维数组
        int[][] a = {
                {11,342,434},
                {100,123,500,300},
                {0}
        };

//        请取出以上二维数组中的第一个一维数组
//        第一个中括号：第一个一维数组
//        第二个中括号：第一个一维数组中的第一个元素
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);
//        取出：第二个一维数组中的第三个元素：
        System.out.println("第二个一维数组中的第三个元素:" + a[1][2]);

        a[2][0] = 11111;
        System.out.println(a[2][0]);
    }
}
