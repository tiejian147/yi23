/*
    用递归的方法来写：求n的阶乘；
    例如5的阶乘：
    5*4*3*2*1

*/
public class RecursionTest04Homework{
    public static void main(String[] args){
        //如果不用递归的方法
        // int n =5;
        // int sum =1;
        // for(int i = 1; i<= n; i++){
        //     sum *= i;
        // }
        // System.out.println("求5的阶乘：" + sum);
        //调用下面的方法
        System.out.println("求5的阶乘：" + sumInt(8));
    }
    //如果是写在方法中，改一下上面的代码
    // public static int sumInt(int n){
    //     //声明一个结果的变量
    //     int sum =1;
    //     for(int i = 1; i<= n; i++){

    //         sum *= i;
    //     }
    //     // System.out.println("求5的阶乘：" + sum);
    //     return sum;
    // }

    //如果是用递归的方法
    public static int sumInt(int n){
        int sum = 1;
        if(n == 1){
            return 1;
        }
        return sum = n * sumInt(n - 1);
    }
}