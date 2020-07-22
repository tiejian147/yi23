/*
    while 循环语句
        1、while循环的语法结构：
            while(布尔表达式){
                循环体；
            }
        2、while循环的执行原理：
            先判断布尔表达式的结果是：
            * true
                -执行循环体
                判断布尔表达式的结果是：
                *true
                    -执行循环体
                    -判断布尔表达式的结果是：
                    *true
                        -执行循环体
                        -判断布尔表达式的结果是：
                        *true
                        ....
                        *false
                            -结束循环
                    *false
                        -结束循环
                *false
                    -结束循环
            * false
                -结束循环
        3、while循环体的循环次数：
        0 ~ N 次
        注意：while循环的循环体可能执行次数为0次；
*/


public class WhileTest01 {
    public static void main(String[] args){

        //死循环
        // while(true){
        //     System.out.println("死循环");
        // }
        // 编译器检测到该语句永远无法执行，所以报错；
        // System.out.println("dayin");

        int i = 10;
        int j = 3;
        while(i > j){//这里编译就没有问题
            System.out.println("hehe");
        }
        //编译通过了
        System.out.println("ceshi");
        
        
        // while(10 > 3){
        //     System.out.println("hehe");
        // }
        //编译错误: 无法访问的语句
        //System.out.println("ceshi");
    }
}