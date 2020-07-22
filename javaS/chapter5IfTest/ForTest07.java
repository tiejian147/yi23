/*
    编写for循环：找出1-100中所有的素数（质数）；\

    该题目主要掌握的知识点：
        *for循环的使用；
        *for循环嵌套
        *标记
        *break；
        *统计
*/

public class ForTest07 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 100; i++) {// 先打印出0-100的所有数字
        // // System.out.println("-->" + i);
        // for (int j = 0; j <= i; j++) {
        // if(i%j == 0){
        // System.out.println("素数：" + i);
        // }
        // }

        // }
        /*
         * 实现思路： 7/1 【不需要】 7/2 【7 % 2 != 0】 7/3 【7 % 3 != 0 】 7/4 【7 % 4 != 0 】 7/5 【7 %
         * 5 != 0 】 7/6 【7 % 6 != 0 】 7/7 【不需要】 结论：7 是素数
         */

        // int i =8;
        // //默认将i看做一个素数【标记在开发中比较常用】
        // boolean isSuShu = true ;
        // for(int j = 2;j < i; j ++){//j<i 就是最多到6了
        // if(i % j == 0){
        // //如果能整除，没有余数，那么就是非素数了
        // isSuShu = false;
        // //只要有一个有余数，就没必要循环了
        // break;
        // }
        // }
        // System.out.println(isSuShu ? i + "是素数" : i + "非素数");

        for (int i = 2; i <= 100; i++) {
            // int i =8;
            // 默认将i看做一个素数【标记在开发中比较常用】
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {// j<i 就是最多到6了
                if (i % j == 0) {
                    // 如果能整除，没有余数，那么就是非素数了
                    isSuShu = false;
                    // 只要有一个有余数，就没必要循环了
                    break;
                }
            }
            if (isSuShu == true) {
                System.out.println(isSuShu ? i + "是素数" : i + "非素数");
            }
        }

        System.out.println("------------------------------------------");

        /*
         * 升级版： 编写for循环：找出1—10000中所有的素数； 要求每8个换一行输出；
         */
        //声明一个统计数量的变量；
        int count =0;
        for (int i = 2; i <= 10000; i++) {
            // int i =8;
            // 默认将i看做一个素数【标记在开发中比较常用】
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {// j<i 就是最多到6了
                if (i % j == 0) {
                    // 如果能整除，没有余数，那么就是非素数了
                    isSuShu = false;
                    // 只要有一个有余数，就没必要循环了
                    break;
                }
            }
            if (isSuShu == true) {
                //count ++;
                System.out.print(i + " ");
                count ++;
                // if(count %8 == 0){
                //     System.out.println();
                // }
                //还可以写成：
                if(count == 8){
                    System.out.println();
                    //归零
                    count = 0;
                }
            }
        }

    }
}
