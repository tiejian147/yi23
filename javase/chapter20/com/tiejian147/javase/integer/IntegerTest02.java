package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 1、8种基本数据类型对应的包装类都是什么？
 * 基本数据类型          包装类型
 * -------------------------------
 * byte                java.lang.Byte（父类Object）
 * short               java.lang.Short（父类Object）
 * int                 java.lang.Integer（父类Object）
 * long                java.lang.Long（父类Object）
 * float               java.lang.Float（父类Object）
 * double              java.lang.Double（父类Object）
 * boolean             java.lang.Boolean（父类Object）
 * char                java.lang.Character（父类Object）
 * <p>
 * 2、以上8种包装类中，重点以java.lang.Integer为代表的学习，其他的类照葫芦画瓢就行了。
 *
 * 3、八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法：
 *      Number是一个抽象类，无法实例化对象。
 *      Number类中有这样的方法：
 *          byte byteValue() 以byte形式返回指定的数值；
 *          abstract double doubleValue() 以double形式返回指定的数值
 *          abstract float floatValue() 以float形式返回指定的数值
 *          abstract int intValue() 以int形式返回指定的数值
 *          abstract long longValue() 以long形式返回指定的数值
 *          short shortValue() 以short 形式返回指定的数值
 *          这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的。
 *
 */
public class IntegerTest02 {
    public static void main(String[] args) {
//        123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
//        基本数据类型 - （转换为） -> 引用数据类型(装箱)
        Integer i = new Integer(123);

//        将引用数据类型 -- （转换为） -> 基本数据类型
        float f = i.floatValue();
        System.out.println(f);//123.0

        //        将引用数据类型 -- （转换为） -> 基本数据类型（拆箱）
        int retValue = i.intValue();
        System.out.println(retValue);//123

    }
}
