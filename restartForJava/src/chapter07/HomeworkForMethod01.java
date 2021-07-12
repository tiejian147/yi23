package chapter07;
/*
    编写一个方法，输出大于某个正整数n的最小质数
    1、先拿到输入的数字；
    2、n++ 然后验证是不是质数；
    3、如果是质数，打印出来
 */
public class HomeworkForMethod01 {
    public static void main(String[] args) {
//      这里要引用这个方法，并打印出来
//        HomeworkForMethod01.getPrimeNumber(5);
//        调用是不是质数的方法,定义一个变量接收isZhishu方法的返回值
        boolean flag = HomeworkForMethod01.isZhishu(7);
        System.out.println(flag? "是质数":"不是质数");

//        调用 获取质数的方法
        HomeworkForMethod01.getPrimeNumber(15);
    }
//    再来一个方法：


    public static void getPrimeNumber(int a){
//        while (true){
//            a++;
//            boolean flag2 = HomeworkForMethod01.isZhishu(a);
//            if(flag2){
//                System.out.println("大于你输入数字最小的质数是：" + a);
//                break;
//            }
//        }
//        优化代码：
        while (!isZhishu(++a)){
        }
        System.out.println(a);
    }

//    两个方法：再写一个方法判断这个数字是不是质数
    public static boolean isZhishu(int num){
        boolean Zhishu = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                Zhishu = false;
                break;
            }
        }
//        System.out.println(num + (Zhishu? "是质数":"不是质数"));
        return Zhishu;
    }
}
