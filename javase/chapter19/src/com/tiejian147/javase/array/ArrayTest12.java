package com.tiejian147.javase.array;

/*
*       动态初始化二维数组
*
* */

public class ArrayTest12 {
    public static void main(String[] args) {
//        动态二维数组 3行4列
//        3个一维数组，每一个一维数组当中4个元素
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
//            换行符
            System.out.println();
        }

        //    静态初始化一个二维数组
        int[][] a = {{1,234,5,5},{100,43,36,23},{234,35,454,565,46}};
        printArray(a);

//        没有这种语法
//        printArray({{1,234,5,5},{100,43,36,23},{234,35,454,565,46}});

        System.out.println("----------");

//        可以这样写：
        printArray(new int[][]{{1,234,5,5},{100,43,36,23},{234,35,454,565,46}});
    }




    //    再来一个静态的方法
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            //            换行符
            System.out.println();
        }
    }



}


