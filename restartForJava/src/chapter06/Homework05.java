package chapter06;
/*
判断一个数字是不是回文数
这是一个9位数
123454321
1、第一位和第九位是相同的，
   第二位和第八位是相同的，
   第三位和第七位是相同的；
   第四位和第六位是相同的；
   如果是偶数位的，不是回文数；
   如果是奇数位的，就往下判断；

 */

public class Homework05 {
    public static void main(String[] args) {
//        接收数字
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个数字：");
//        先确定这个数字是几位数
        int num1 = s.nextInt();
//        为数字长度定义一个变量
        int length1 = (num1 + "").length();
        System.out.println(length1 + "位数");

        for (int i = 1; i <= length1; i++) {
            System.out.println();
        }
    }
}
