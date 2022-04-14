package chapter25;

import java.util.Date;

/**
 *要操作一个类的字节码，需要先获取到这个类的字节码，怎么获取java.lang.Class实例？
 *      三种方式
 *          第一种方式：Class.forName("完整类名带包名")
 *          第二种方式：Class c = 引用.getClass();
 *          第三种方式：
 *
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        Class.forName()
            1、静态方法；
            2、方法的参数是字符串；
            3、字符串需要的是一个完整类名；
            4、完整类名必须带有包名；（java.lang 包也不能省略）
         */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
            c2 = Class.forName("java.util.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");//c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();//x 代表String.class字节码文件，x 代表String类型
        System.out.println(c1 == x); //true  内存地址是一样的

        Date date = new Date();
        Class y = date.getClass();
        System.out.println(c2 == y); //true 内存地址是一样的

    }
}
