package javase.chapter20.com.tiejian147.javase.random;

import java.util.Random;

/**
 * 编写程序，生成5个不重复的随机数，重复的话重新生成。
 * 最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
//        new一个random的对象
        Random random = new Random();
//        创建一个数组  动态的  长度为5
        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        int index = 0;

        while (index < arr.length) {
//            生成随机数
//            int num = random.nextInt(101);//产生0-100的随机数
            int num = random.nextInt(6);//产生0-5的随机数
//            int num = random.nextInt(4);//产生0-3的随机数，永远都有重复的，永远都凑不够5个


            System.out.println("生成的随机数：" + num);
            if (!contains(arr,num)) {
                arr[index++] = num;
//                index++;
            }
        }

//        遍历这个数组验证是否正确
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    /**
     * 单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
     * @param arr
     * @param key
     * @return true表示包含，false表示不包含
     */
    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
//                条件成立了表示包含，返回true
                return true;
            }

        }
        return false;
    }
}
