/*
    使用for循环输出九九乘法表
*/



public class ForTest06 {
    public static void main(String[] args){
        
        /* 这是自己写的，错了
        int a ;
        for(a = 1 ;a < 10 ; a++){
            System.out.println("开始：");

            for(int b =1 ; b < 10 ; b++){
                System.out.println(a + "*" + b + "=" + (a*b));
            }

            System.out.println("结束。");
        }
        */

        for(int i = 1; i <= 9; i++){//外层循环9次
            //i是行号
            // System.out.println(i);
            //循环体当中的程序主要的任务是什么？
            //处理当前行，将当前行所有的项目全部输出？
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + (i*j) + " ");
            }
            //换行
            System.out.println();
        }
    }
}