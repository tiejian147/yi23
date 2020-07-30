package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 总结一下之前所学的经典异常？
 *  空指针异常：NullPointerException
 *  类型转换异常：ClassCastException
 *  数组下标越界异常：ArrayIndexOutOfBoundException
 *  数字格式化异常：NumberFormatException
 *
 *  Integer类当中有哪些常用的方法？
 *
 */
public class IntegerTest07 {
    public static void main(String[] args) {
//        手动装箱
        Integer x = new Integer(1000);

//        手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("1234");
        System.out.println(a);

//        编译的时候没问题，一切符合java语法，运行时会不会有问题呢？
//        不是一个"数字"可以包装秤"Integer吗，不能，运行时出现异常
//        Integer b = new Integer("ceshi");
        System.out.println(a);//java.lang.NumberFormatException

        /**
         * 重点方法：
         * static int parseInt(String s)
         * 静态方法，传参String，返回int
         * 网页上文本框中输入的100实际上是"100"字符串
         * 后台数据库中要求存储100数字，此时java程序需要
         * 将"100"转换成100数字
         */
        int retValue = Integer.parseInt("123");
        System.out.println(retValue + 100);//223
//        System.out.println("中文");//NumberFormatException

//        照葫芦画瓢
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2 + 1);//4.140000000000001(精度问题)

        float retValue3 = Float.parseFloat("2.0");
        System.out.println(retValue3);

//        valueOf方法作为了解
//        static Integer valueOf(int i)
//        静态的：int --> Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);



    }
}
