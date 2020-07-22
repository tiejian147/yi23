/*
    计算1~n 的和,用常规的方法写
*/


public class RecursionTest02 {
    public static void main(String[] args){
        //如果n=5，那么命题就是计算1-5的和
        // int n = 1;
        // int sum =0;
        // for(n = 1; n < 6; n++){
        //     sum  +=n;
        // }
        // System.out.println("1-5的求和为：" + sum);
        // sum(5);
        System.out.println("结果为" + sum(10));
    }
    public static int sum(int n){
        int result =0;
        for(int i = 1; i <= n; i++){
            result  +=i ;
        }
        // System.out.println("1-5的求和为：" + sum);
        return result;

    }

}