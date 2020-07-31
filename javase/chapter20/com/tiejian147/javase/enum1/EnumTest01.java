package javase.chapter20.com.tiejian147.javase.enum1;

/**
 * 下面的案例还没有使用java中的枚举，分析以下程序，在设计方面有什么缺陷？
 */
public class EnumTest01 {
    public static void main(String[] args) {
//        System.out.println("这是没有调用方法的：" + 10 / 0);//java.lang.ArithmeticException: / by zero
//        调用下面的方法
        System.out.println(divide(0,2));
    }

    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，返回0表示失败
     */

    public static int divide(int a, int b){
        try {
            int c = a / b;
//            程序执行到此处表示以上代码没有发生异常，表示执行成功
            return 1;
        }catch (Exception e){
//            程序执行到此处表示以上程序出现了异常！
//            表示执行失败
            return 0;
        }


    }
}
