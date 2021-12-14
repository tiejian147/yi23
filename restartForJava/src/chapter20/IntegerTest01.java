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

        Integer x = 900;
        System.out.println(x);

        int y = 1000;
        System.out.println(y);

        Integer z = 800;
        // +号两边要求是基本数据类型的数字，z是系统做了自动拆箱，所以没有报错；
        System.out.println(z + 1);

        // 比较两个对象，内存地址肯定是false，装箱的数字比较的也是内存地址
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a == b);//false
        System.out.println(a.equals(b));//比较两个对象，用equals的话，就可以是true了；

        //Integer的方法
        //这个静态方法是可以将String类型的数字转化成int类型的数字
        int intValue = Integer.parseInt("123");
        System.out.println(intValue + 100);//打印出来的是int 类型

        //String和int互转
        // int 转String
        int i4= 33;
        String s4 = String.valueOf(i4);
        System.out.println(s4);//这个就是String类型的了

        System.out.println("====");
        String s6 = i4 + "";
        System.out.println(s6 + 1);

        //String 转int
        String s5 = "123";
        int i5 = Integer.valueOf(s5);
        System.out.println(i5);//打印结果就是int类型

        int i15 = Integer.parseInt(s5);
        System.out.println(i15);


        //int 和Integer互转
        // int 转Integer
        //自动装箱
        Integer i6 = 444;
        System.out.println(i6);
        //调用方法
        Integer i7 =Integer.valueOf(444);
        System.out.println(i7);

        //Integer转int
        //自动拆箱
        int i8 = i7.intValue();
        System.out.println(i8);

        //String和Integer互转
        //String转Integer
        Integer i9 = Integer.valueOf("123");
        System.out.println(i9);

        //Integer转String
        String s10 =String.valueOf(i9);
        System.out.println(s10);







    }
}
