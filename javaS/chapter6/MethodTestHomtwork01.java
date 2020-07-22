import javax.naming.spi.DirStateFactory.Result;

/*
    1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5；
    思考：这个方法应该起什么名字，这个方法的形参是什么？方法的返回值类型是什么？
*/


public class MethodTestHomtwork01 {
    public static void main(String[] args){
        /*
        //定义第二个乘数
        int n =5;
        int result = 1;


        for(int i = n; i > 1; i --){
            // System.out.println(i);
            result *= i;
        }
        System.out.println(result);
        */
        int jieguo;
        sumFactorial(4);
        jieguo = sumFactorial(6);
        System.out.println("阶乘的结果为" + jieguo);


    }
    //这是自己写的，没有写出来
    // public static int sumFactorial(int num){//定义一个方法名称：求阶乘的结果
    //     int sum ;//声明一个求结果的变量
    //     for(num = 2; num <= 2; num ++ ){
    //         // int sum;
    //         sum = num * (num -1)
    //     }
    // }
    public static int sumFactorial(int n){
        // int n =5;//这一行就不需要了
        int result = 1;


        for(int i = n; i > 1; i --){
            // System.out.println(i);
            result *= i;
        }
        // System.out.println(result);
        // return n;
        return result;
    }

}