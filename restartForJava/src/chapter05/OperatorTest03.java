package restartForJava.src.chapter05;
/*
逻辑运算符：
    & 逻辑与（且）
    | 逻辑或（或者）
    ! 逻辑非（取反）
    && 短路与
    || 短路或
    重点：
        逻辑运算符两边都要求是布尔类型，并且最终的运算结果也必须是布尔类型；
        这是逻辑运算符的特点；
        & :只要有一边是false，结果一定是false
           只有两边都是true，结果才是true；
        | :  只要有一遍是true，结果就是true

        && 和 & 的区别
        & ： 符号左边和右边 代码一定都执行；
        && ： 若没有必要，符号右边的 就不执行了；
 */
public class OperatorTest03 {
    public static void main(String[] args) {
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & false);//false

        System.out.println("-------------");
        System.out.println(true | true);//true
        System.out.println(true | false);//false
        System.out.println(false | false);//false
    }
}
