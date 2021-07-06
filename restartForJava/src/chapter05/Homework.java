package chapter05;
/*
求1000以内，不能被7整除的所有整数之和
1、先遍历所有的整数；
2、找出所有不能被7整除的整数；
3、然后求和
 */
public class Homework {
    public static void main(String[] args) {

//        要声明一个变量
        int sum = 0;
        for (int i = 0; i <=1000 ; i++) {
//            找出所有整数；
//            System.out.println(i);
//            找出所有不能被7整除的整数
            if(i % 7 != 0){
//                这里找出来了就不用打印了
//                System.out.println(i);
                sum  += i;
            }
        }
//        跳出循环之后，打印求和
        System.out.println(sum);
    }
}
