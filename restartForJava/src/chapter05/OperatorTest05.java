package restartForJava.src.chapter05;
/*
三目运算符：
    语法：
    布尔表达式? 表达式1 : 表达式2

    执行原理：
        布尔表达式结果为true时，表达式1的执行结果为整个表达式的结果；
        布尔表达式结果为false时，表达式2的执行结果为整个表达式的结果；

 */
public class OperatorTest05 {
    public static void main(String[] args) {
        boolean sex = false;
//        不能这么写
//        sex ? '男' : '女';//报错：不是语句
//        要这么写：
        char c = sex ? '男' : '女';
        System.out.println(c);

        int x = 10;
        int a = x + x++;
        System.out.println(x);//11
        System.out.println(a);//20

        int b = x + ++x;
        System.out.println(b);//23
        System.out.println(x);//12

        int d = x + x--;
        System.out.println(d);//12 + 12  24
        System.out.println(x);// 11
        System.out.println("test");
    }
}
