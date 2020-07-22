/*
    作业2：编写一个方法：输出大于某个正整数n的最小的质数；
    思考：这个方法应该起什么名字，这个方法的形参是什么类型？
            方法的返回值类型是什么？
    思路：比如：这个正整数n是2：
        也就是要输出：大于2的最小的质数，也就是3；
        比如：这个正整数n是9；
        大于9的最小的质数，结果是11；

        首先，系统一定会给你一个正整数n，然后基于这个正整数++，
        每加1得到的新数字m判断一下是否为质数。
*/



public class MethodTestHomtwork02 {
    public static void main(String[] args){
        //假设求大于9的最小的质数
        // int n = 9;
        // int m = n++
        // while(m ){}
        // isSuShu(7);
        // int n =10;
        // n++;
        // boolean flag = isSuShu(n);
        // System.out.println(flag ? "是质数" :"不是质数");

        /*对isSuShu();方法进行测试
        boolean flag = isSuShu(11);
        System.out.println(flag ? "是质数" :"不是质数");
        */
        printZuiXiaoZhiShu(102);
        // printZuiXiaoZhiShu(15);
        // printZuiXiaoZhiShu(34);


        
    }
    //再编写一个方法，输出最小质数；
    public static void printZuiXiaoZhiShu(int n){
        //这是新手写法：
        // while(true){
        //     n++;
        //     boolean flag = isSuShu(n);
        //     if(flag){
        //         System.out.println("大于当前数字最小的质数为：" +n);
        //         break;
        //     }
        // }
        //精简后的写法：
        while(!isSuShu(++n)){
            
        }
        System.out.println("大于当前数字最小的质数为：" +n);
        
    }

    //先不看上面，直接先定义一个方法，判断一个数据是不是质数
    //这个方法的形参是：被判断数字的num
    //方法的返回值类型是boolean，true：是质数；false：不是质数；
    public static boolean isSuShu(int num){
        //质数只能被1和自身整除
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                // System.out.println("不是素数" + num);
                return false;
            }
            // System.out.println("是素数" + num);
        }
        // System.out.println("是素数" + num);
       return true; 
    }

}