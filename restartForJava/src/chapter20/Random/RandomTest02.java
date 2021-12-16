package chapter20.Random;

import java.util.Random;

/*
生成5个不重复的随机数
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random(101);
        int num1 = random.nextInt(6);
        int num2 = random.nextInt(6);
        int num3 = random.nextInt(6);
        int num4 = random.nextInt(6);
        int num5 = random.nextInt(6);
        if (num1 != num2 && num2 != num3 && num3 != num4 && num4 != num5){
            /*System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);*/
            System.out.println("以下5个数字不重复：");
        }
        int[] ints = {num1,num2,num3,num4,num5};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }
}
