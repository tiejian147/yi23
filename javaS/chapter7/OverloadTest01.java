/*
    方法重载机制？
    1、以下代码不使用方法重载机制，有哪些缺点？
    以下的代码程序没有语法错误，运行也是正常的，只是分析一下代码有什么缺点？
        sumInt(); sumLong(); sumDouble();不是功能相同，二是功能相似。
        三个功能相似的方法，起了三个不同的方法名称，有什么缺点？
            * 程序员需要记忆更多的方法名称，记忆会吃力。
            * 代码不美观（不够好看，不整齐）【这是次要的】
*/



public class OverloadTest01 {
    public static void main(String[] args){
        //调用下面的sumInt方法
        System.out.println(sumInt(7, 9));
        //调用sumLong方法
        System.out.println(sumLong(100, 200));
        //调用sumDouble方法
        System.out.println(sumDouble(500, 100));

    }
    //定义一个求和的方法 Int类型
    public static int sumInt(int a,int b){
        return a + b;
    }
    //定义一个求和的方法 Long类型
    public static long sumLong(long c ,long d){
        return c + d;
    }
    //定义一个求和的方法 Double类型
    public static double sumDouble(double m ,double n){
        return m + n ;

    }
}