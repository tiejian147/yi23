package javase.chapter20.com.tiejian147.javase.random;
/**
 * 随机数
 */

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random r1 = new Random();
//        随机产生一个int类型取值范围内的数字
        int num1 = r1.nextInt();
        System.out.println(num1);

//        产生[0~100]之间的随机数，不能产生101
//        nextInt翻译为：下一个int类型的数据是101，表示只能取到100；
        int num2 = r1.nextInt(101);
        System.out.println(num2);
    }
}
