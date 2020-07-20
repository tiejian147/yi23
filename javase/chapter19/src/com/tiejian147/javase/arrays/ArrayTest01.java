package com.tiejian147.javase.arrays;

import java.util.Arrays;

/**
 * 使用以下SUN公司提供的数组工具类：java.util.Arrays;
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {1,34,54,3,2,45,23};

//        工具类当中的方法大部分都是静态的
//        这里是调用java.util.Arrays 中的sort方法 （排序方法）
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

