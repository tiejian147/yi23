package chapter06;

public class ForTest01 {
    public static void main(String[] args) {
        //    for 练习
        int i = 0;
        for (; i <10 ; i++) {
            System.out.println("i=" + i);
        }
        System.out.println(i);
        System.out.println("------------");
//        1到100  所有奇数之和
//        首先找出所有的奇数
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
//            System.out.println("j=" + j);
            if (j % 2 > 0){
                System.out.println("j=" + j);
                sum += j;// sum = sum + j;
            }
        }
        System.out.println("所有奇数之和为：" + sum);
        System.out.println("-----------------------------");
//        九九乘法表
        for (int k = 1; k <= 9; k++) {
//            先把行号打印出来
//            System.out.println("这是第" + k + "行");
//            然后打印每行的数据
            for (int h = 1; h <= k; h++) {
                System.out.print(h + "*" + k + "=" + (h * k) + " ");
            }
            System.out.println(" ");
        }
    }
}
