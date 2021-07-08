package chapter05;
/*
从键盘接收信息
 */
public class KeyInPut {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

//        定义一个变量
        System.out.print("请输入整数：");
        int i = s.nextInt();
        System.out.println("您输入的数字是：" + i);

        System.out.println("请输入小数：");
        double d1 = s.nextDouble();
        System.out.println("您输入的小数是：" + d1);

//        定义字符串变量，并打印出来
        System.out.println("请输入任意字符串：");
        String s1 = s.next();
        System.out.println("您输入的字符串是：" + s1);

//        编写一个小型计算器
        System.out.println("欢迎回来！");
        System.out.print("这里可以做加法运算，请输入第一个整数：");
        int num1 = s.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = s.nextInt();
        System.out.println("计算结果为：" + num1 + "+" + num2 + "=" + (num1 + num2));

    }
}
