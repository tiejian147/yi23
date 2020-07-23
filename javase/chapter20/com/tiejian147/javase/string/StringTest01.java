package javase.chapter20.com.tiejian147.javase.string;

/**
 * 关于java JDK中内置的一个类：java.lang.String
 *      1、String表示字符串类型，属于引用数据类型，不属于基本数据类型；
 *      2、在java中随便使用双引号括起来的都是String对象，例如："adf"，"def"，"hello，world"等，这3个都是String对象
 *      3、java中规定，双引号括起来的字符串是不可变的，也就是说"abc"从出生到最终死亡，不可变，不能变成"abcd"，或者"dddd"
 *      4、在JDK当中双引号括起来的字符串，例如："abc"，"def"都是直接存储在"方法区"的"字符串常量池"当中的
 *      为什么SUN公司吧字符串存储在一个"字符串常量池"当中呢？因为字符串在实际的开发中使用太频繁，为了执行效率，
 *      所以吧字符串放到了方法区的字符串常量池当中
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bdd" + "bba";
        System.out.println(s2);

//        分析：这是使用new的方式创建的字符串对象，这个代码中的"xy"是从哪里来的？
//        凡是双引号括起来的都在字符串常量池中有一份
//        new对象的时候异丁在堆内存当中开辟空间
        String s3 = new String("ddd");
        System.out.println(s3);

    }
}
