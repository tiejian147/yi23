package chapter21;
/*
异常处理机制
    以下程序要是出现了不正常的情况，而这种不正常的情况叫做：异常
    java把该异常信息打印输出到控制台，供程序员参考，程序员看到后可以
    对程序进行修改，使程序更加健壮；
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b ;
        System.out.println("求商：" + c);
    }
}
