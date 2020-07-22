package com.tiejian147.javase.arrays;

/**
 * 选择排序算法：
 * 每一次从这堆“参与比较的数据”当中找出最小值；
 * 拿着这个最小值和“参与比较的这堆最前面的元素”交换位置
 * <p>
 * 选择排序比冒泡排序好在：每一次的交换都是有意义的。
 * <p>
 * 关键点：选择排序中的关键点在于：你怎么找出一堆数据中最小的
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 2, 5};

//        选择排序：
//        5条数据循环4次
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
//            i值是0 1 2 3
//            i正好是“参加比较的这堆数据中”最左边那个元素的下标
//            System.out.println(i);
//            i是一个参与比较的这堆数据中的起点下标
//            假设起点下标位置上的元素是最小的
            int min = i;


            for (int j = i + 1; j < arr.length; j++) {
                count++;
//                System.out.println("--->" + j);
                if (arr[j] < arr[min]) {
                    min = j;//最小值元素的下标是j
                }
            }
//                当i和min相等时，表示最初的猜测是对的
//                当i和min不相等时，表示最初的猜测是错的，有比这个元素更小的元素
//                需要拿这个更小的元素和最左边的元素交换位置
            if (min != i) {
//                    表示存在更小的元素
//                    arr[min] 最小的数据
//                    arr[i]最前面的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("比较次数：" +count);

    }
}
