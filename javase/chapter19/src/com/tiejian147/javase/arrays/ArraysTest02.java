package com.tiejian147.javase.arrays;

import java.util.Arrays;

/**
 * java.util.Arrays
 */
public class ArraysTest02 {
    public static void main(String[] args) {
//        java.util.Arrays; 工具类中有哪些方法，我们开发的时候要参考API帮助文档
//        不要死记硬背
        int[] arr = {1,2,3,9,4,5,8,567};

//        调用sort排序的方法

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int index = Arrays.binarySearch(arr,666);

        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是：" + index);



    }
}
