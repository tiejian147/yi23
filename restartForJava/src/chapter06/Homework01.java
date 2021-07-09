package restartForJava.src.chapter06;
/*
1000以内不能被7整除的整数之和
1、先做个循环，把1000个数字都打印出来
2、找出不能被7整除的所有数字
3、加和
 */
public class Homework01 {
    public static void main(String[] args) {
//        声明一个求和的变量
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
//            System.out.println("i = " + i);
//            找出不能被7整除的所有数字
            if (i % 7 > 0) {//视频里这里用的是 !=  我认为更严谨
                System.out.println("不能被7整除的i =" + i);
                sum += i;
            }
        }
        System.out.println("求和sum= " + sum);
    }
}
