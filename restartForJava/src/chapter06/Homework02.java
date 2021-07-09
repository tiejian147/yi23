package restartForJava.src.chapter06;
/*
求： 1+2-3+4-5+6...-99+100 = ？
1、先打印出所有的偶数，求和
2、打印出所有的奇数，然后做减法
3、两数相加
 */
public class Homework02 {
    public static void main(String[] args) {
//        声明一个偶数求和的变量
        int sum1 = 1;
        for (int i = 2; i <= 100; i++) {
//            找出偶数，求和
            if(i % 2 == 0){
                System.out.println("所有的偶数i= " + i);
                sum1 += i;
            }
//            找所有的奇数，减去
            if(i % 2 != 0){
                System.out.println("所有的奇数i= " + i);
                sum1 -= i;
            }
        }
        System.out.println("求和sum1 = " + sum1);//50
    }
}
