/*
    在前一个程序的基础上，计算1-100所有奇数的和
    运算符 += 就是专门完成追加的
*/

public class ForTest03{
    public static void main(String[] args){

        //定义一个变量，初始值为0；
        int sum = 0 ;

        for(int i = 1; i < 100; i +=2){
            //i一定是奇数
            //累加求和
            //System.out.println("i -- > " + i);

            //sum存储的是最终求和的结果
            //不能每一次执行到这里，都把求和结果归零
            //定义sum变量不能放大机这里，因为这里是循环体；
            //int sum = 0 ;

            sum += i;
        }
        //以上的for循环结束之后，最终输出求和的结果：
        System.out.println("sum的求和结果为：" + sum);



        


    }
}