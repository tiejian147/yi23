package chapter20;
/*
1、java中为8种基本数据类型准备了8种包装类型，8中包装类型属于引用数据类型，父类是Object
2、思考：为什么要再提供8种包装类呢？
    因为8种基本数据类型不够用，所以SUN公司为我们写好了8种引用的数据类型；

3、 8种包装类
----------------------------------
    基本数据类型              引用数据类型
    ---------------------------------
    byte                    java.long.Byte
    short                   java.long.Short
    int                     java.long.Integer
    long                    java.long.Long
    folat                   java.long.Float
    double                  java.long.Double
    boolean                 java.long.Boolean
    char                    java.long.Character
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //装箱：将基本数据类型转换为引用数据类型
        Integer integer = new Integer(123);
        System.out.println(integer);

        //拆箱：将引用数据类型转换为基本数据类型
        float f2 = integer.floatValue();
        System.out.println(f2);

        //各种数据类型的最大值和最小值：
        System.out.println("int的最大值：" + Integer.MAX_VALUE);
        System.out.println("int的最小值：" + Integer.MIN_VALUE);
        System.out.println("byte的最大值：" + Byte.MAX_VALUE);
        System.out.println("byte的最小值：" + Byte.MIN_VALUE);

    }
}
