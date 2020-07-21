package com.tiejian147.javase.arrays;

/**
 * 冒泡算法的核心是？
 */

public class BubbleSort {
    public static void main(String[] args) {
//        先声明一个静态化的数组 长度是6
        int[] arr01 = {9,8,10,7,6,0,11};

//        7条数据，循环6次，一下的代码可以循环6次（冒泡排序的外层循环采用这种方式）
        int count = 0;
        for (int i = arr01.length - 1; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
//                不管是否需要交换位置，总之是要比较一次的
                count ++;
                if(arr01[j] > arr01[j+1]){
//                    交换位置
//                    先声明一个变量  空盒子
                    int temp ;
//                    把大的放进去
                    temp = arr01[j];
//                    小的数字换位置
                    arr01[j] = arr01[j+1];
//                    再把大的拿出来
                    arr01[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
        System.out.println("比较次数：" + count);


    }
}
