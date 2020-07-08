package com.tiejian147.javase.array;

//当一个方法的参数是一个数组的时候，我们还可以采用这种方式传：

public class ArrayTest04 {
    public static void main(String[] args) {
//        静态初始化一维数组：
        int[] a = {1,2,4};
        printArray(a);

        System.out.println("-----------------------");
//        没有下面这个语法，编译会报错：
//        printArray({1,2,3});
//        但是如果想直接传一组静态数组的话，语法是这样的：
        printArray(new int[]{11,22,33});

        System.out.println("-----------------------");

//        动态初始化一位数组：
        int[] a1 = new int[4];
        printArray(a1);
        System.out.println("-----------------------");

        printArray(new int[3]);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
