/*
    这里是用for语法，来做练习题；
    1、本金10000元存入银行，年利率是千分之三，将本金和利息想加作为新的本金，计算5年后，获得的总金额是多少；
*/

public class ForTest05ForPractice{
    public static void main(String[] args){

        //先声明一个总金额的变量，因为有小数计算，所以用double
        double sum =0;
        //声明本金的变量：
        double principal =0;

        //声明年份的变量
        int year =0;
        
        

        //搜索键盘输入
        // java.util.Scanner s = new java.util.Scanner(System.in);

        // System.out.println("请输入要查询的年数：");
        // year = s.nextInt();

        for(principal =10000,year = 1; year<6;year++){
            principal = principal + principal * 0.003;
            System.out.println("年份为：" + year + "年");
            System.out.println("计算的总金额为：" + principal + "元");

        }
        sum = principal;
        year--;
        System.out.println("----------------");
        System.out.println("年份为：" + year + "年");
        System.out.println("计算的总金额为：" + sum + "元");
        
        /*
            练习总结：
            练习题给的答案是(double principal =10000,year = 0; year<5;year++)
            声明的变量要是两个，前面可以只写一个类型，就可以了，中间用逗号分隔；
            year第一年是0年，到year<5，已经走了5遍循环了，所以计算的结果是5年，没有错；


        */


    }
}