package restartForJava.src.chapter05;
/*
关系运算符：
    >
    <
    ==
    !=
    >=
    <=
    重点：
        所有关系运算符的预算结果一定是布尔类型；
        不是true就是false，不可能是其他值；
    在java语言中：
    = 是赋值运算符
    == 是关系运算符；判断是否相等；
 */
public class OperatorTest02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a > b);//fasle
        System.out.println(a < b);//false
        System.out.println(a >= b);//true
        System.out.println(a <= b);//true
        System.out.println(a == b);//true
        System.out.println(a != b);//false

    }
}
