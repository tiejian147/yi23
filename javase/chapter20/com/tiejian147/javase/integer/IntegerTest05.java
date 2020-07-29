package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 好消息：自java5之后，引入了一种新特性，自动装箱和自动装箱
 *  自动装箱：基本数据类型的自动转换成包装类
 *  自动拆箱：包装类自动转换成基本数据类型
 *
 *  有了自动拆箱之后，Number类中的方法就用不着了。
 *
 *  自动装箱和自动拆箱的好处？
 *      方便编程。
 */
public class IntegerTest05 {
    public static void main(String[] args) {
//        900是基本数据类型
//        x是包装类型
//        基本数据类型 -- （自动转换）--> 包装类型：自动装箱
        Integer x = 900;
        System.out.println(x);

//        x是包装类型
//        y是基本数据类型
//        包装类型 --（自动转换）--> 基本数据类型：自动拆箱
        int y = x;
        System.out.println(y);

//        分析以下代码为什么没有报错？
//        int1 是一个引用，是一个变量，int1还是保存了一个对象的内存地址
//        +两边要求是基本数据类型的数字，int1 是包装类，不属于基本数据类型，这里会进行自动拆箱机制，将int1转换成基本数据类型。
//        在java5之前这样写肯定会报错
        Integer int1 = 1000;
        System.out.println(int1 + 1);

        Integer a = 1000;//Integer a = new Integer(1000);
        Integer b = 1000;//Integer b = new Integer(1000);
//        == 比较的是对象的内存地址，a和b两个引用中保存的对象内存地址不同
//        == 这个运算符不会触发自动拆箱机制，只有+ - * / 符号， 运算的时候才会有自动拆箱机制
        System.out.println(a == b);//false
    }
}
