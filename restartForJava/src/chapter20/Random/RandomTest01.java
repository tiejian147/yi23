package chapter20.Random;

import java.util.Random;

/*
Random随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        //创建随机数
        Random random = new Random();
        int i1 = random.nextInt();
        System.out.println(i1);

        //产生0-100 的随机数，不包含101
        int num2 = random.nextInt(100);
        System.out.println(num2);
    }
}
