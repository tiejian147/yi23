/*
    用递归的方法来写：1-n求和

*/



public class RecursionTest03 {
    public static void main(String[] args){
        System.out.println("结果为：" + sum(5));
    }

    public static int sum(int n){
        int result = 0;
        if(n == 1){
            return 1;//这里必须得是1，不然计算就不对了
        }
        //代码执行到这里，说明n ！= 1；
        return result = n + sum(n - 1);
    }
}