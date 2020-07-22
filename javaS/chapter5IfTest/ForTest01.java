/*
    2、基本上所有的编程语言支持的循环包括三种：
        * for循环
        * while 循环
        * do..while 循环
    3、当前示例主要讲解for循环，for循环的语法结构是什么？
        语法结构：
            for(初始化表达式;布尔表达式;更新表达式){
                //是需要重复执行的代码片段【循环体：由java语句构成】
            }
    4、for循环的执行过程/执行原理？重要程度：*****
            4.1初始化表达式，布尔表达式，更新表达式都不是必须的！【但是两个分号是必须的】
            4.2初始化表达式最先执行，并且在整个for循环当中只执行一次；
            4.3布尔表达式必须是true/false，不能是其他值。
            4.4for的执行过程：
                * 先执行初始化表达式，并且带表达式只执行一次
                * 判断布尔表达式的结果是true还是false
                    - 布尔表达式true
                        * 执行循环体
                        * 执行更新表达式
                        * 判断布尔表达式的结果是true还是false
                            - 布尔表达式true
                                * 执行循环体
                                * 执行更新表达式
                                * 判断布尔表达式的结果是true还是false
                                    - 布尔表达式 true
                                        * 执行循环体
                                        * 执行更新表达式
                                        * 判断布尔表达式的结果是true还是false
                                            ....
                                    - 布尔表达式 false
                                        * 退出循环

                            - 布尔表达式false
                                * 退出循环
                    - 布尔表达式false
                        * 退出循环；
            
*/

public class ForTest01{
    public static void main(String[] args){

        /*
        //需求：输出1-10 10个数字
        方法很笨
        System.our.println(1);
        System.our.println(2);
        System.our.println(3);
        System.our.println(4);
        System.our.println(5);
        System.our.println(6);
        System.our.println(7);
        System.our.println(8);
        System.our.println(9);
        System.our.println(10);
        */
        
        int i; //i 的作用域在方法体中
        for(i = 1; i <= 10; i = i + 1){
            System.out.println(i);
        }
        System.out.println("i====>" + i);

        System.out.println("------------------");
        //输出1-10中所有的奇数
        int num1;
        for(num1 = 1; num1 <= 10; num1 += 2){
            System.out.println(num1);//打印：1，3，5，7，9
        }

        System.out.println("分割线-------------");
        //输出1-10中所有的偶数
        int num2;
        for(num2 =2; num2 <= 10; num2 +=2){
            System.out.println(num2);//打印：2，4，6，8，10
        }
        System.out.println("-----------------------");
        System.out.println(num2);
    }
}

