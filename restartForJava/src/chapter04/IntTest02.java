package chapter04;
/*
    这里学习的是类型转换

    重点：
    多种数据类型做混合运算的时候，最终的结果类型是“最大容量”对应的类型。

    char+short+byte这个组合除外；
    因为char+short+byte混合运算的时候，会各自先转换成int类型再做运算；
 */
public class IntTest02 {
    public static void main(String[] args) {
//        这里不存在类型转换,因为整数都默认是int类型
        int i = 100;
        System.out.println(i);
//        这里存在类型转换，因为等号右边默认是int类型
        long l1 = 200;
        System.out.println(l1);

//        这里不存在类型转换
        long l2 = 300L;
        System.out.println(l2);

//       2147483648这个数字已经超过了int的最大值，所以后面必须要转换为long
        long l3 = 2147483648L;
        System.out.println(l3);

//        大容量转换成小容量，需要加强制类型转换符
        long l4 = 400L;
        int i2 = (int)l4;
        System.out.println(i2);

//        这样就损失了精度，数字打印出来的就是错的了
        long l5 = 2147483648L;
        int i3 = (int)l5;
        System.out.println(i3);

//        short、byte、char做混合运算的时候，各自先转换成int再进行计算
        char c1 = 'a';
        byte b1 = 1;
//        这里求和是int类型
        System.out.println(b1 + c1);
//        Error:(36, 23) java: 不兼容的类型: 从int转换到short可能会有损失
//        short s1 = b1 + c1;
//        这样写就对了
        short s1 = (short)(b1 + c1);
        System.out.println("第二个98：" + s1);

//        这个结果是：3   java规定：int和int类型最终的类型还是int类型
        int t1 = 10 / 3;
        System.out.println(t1);
    }
}
