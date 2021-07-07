package restartForJava.src.chapter05;

public class OperatorTest01 {
    public static void main(String[] args) {
//        加减乘除不多说了，这里重点说 ++ 和 —-
//        ++ 就是自加1
        int i = 10;
//        i 变量自加1；
        i ++;
        System.out.println(i);

//        还有其他的写法
        int k = 15;
//        k 变量自加1；
        ++ k;
        System.out.println(k);

//        研究 ++ 在变量前后有什么区别
//        语法: 当++ 出现在变量后面，会先做赋值运算，再自加1；
        int m = 10;
        int n = m++;
        System.out.println(m);// 11
        System.out.println(n);// 所以这里是10

//        语法：当++ 出现在变量前面，会先自加1，然后再做赋值运算
        n = ++m;
        System.out.println(m);//12
        System.out.println(n);//12

//        题目
        int c = 90;
        System.out.println(c++);//90
        System.out.println(c);//91   因为已经做了自加1

        int d = 80;
        System.out.println(++d);//81
        System.out.println(d);//81
    }
}
