package com.tiejian147.javase.array;

public class ArrayTest11 {
    public static void main(String[] args) {
//        二位数组：
        String[][] array = {
                {"10,20,30","java","mysql","C#"},
                {"张三","李四","wangwu"},
                {"lucy","jack","rose"}
        };

//        遍历二维数组
        for (int i = 0; i < array.length; i++) {

//          遍历一维数组
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
//            输出换行符
            System.out.println();
        }
    }
}
