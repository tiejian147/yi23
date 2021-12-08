package chapter19;

import java.util.Arrays;

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] array = {3,4,2,67,454,234,100};
        // 排序算法
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
