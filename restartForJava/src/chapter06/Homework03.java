package restartForJava.src.chapter06;
/*
打印一个整数的阶乘
5 : 5*4*3*2*1 = ?

 */
public class Homework03 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num1 = s.nextInt();
//        首先是几就打印出几个数字，不换行
        int result = 1;
        for (int i = num1; i > 0 ; i--) {
            result *= i;
        }
        System.out.println("阶乘结果为：" + result);
    }
}
