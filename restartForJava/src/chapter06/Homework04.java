package chapter06;
/*
判断一个数字是否是质数
1、首先要打印出 这个数字到1的所有数字
2、然后把这个数字和所有打印的数字相除看余数，除了1和它本身都有余数，那么这个数字就是质数
 */
public class Homework04 {
    public static void main(String[] args) {
//        首先先从控制台输入数字
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num1 = s.nextInt();

//        声明一个布尔类型，是质数
        boolean zhiShu = true;
        for (int i = 2; i < num1; i++) {
//            System.out.println("打印：" + i);
            if (num1 % i == 0){
//                System.out.println("这个数字一定不是质数");
                zhiShu = false;
                break;
            }
        }
        System.out.println(num1 +(zhiShu ? "是" : "不是") + "质数");

    }
}
