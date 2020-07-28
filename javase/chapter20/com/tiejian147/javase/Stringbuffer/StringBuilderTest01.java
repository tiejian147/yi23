package javase.chapter20.com.tiejian147.javase.Stringbuffer;

/**
 * java.lang.StringBuilder
 * StringBuffer和StringBuilder的区别：
 *      StringBuffer中的方法都有：synchronized关键字修饰，表示StringBuffer在多线程环境下运行是安全的。
 *      StringBuilder中的方法没有：synchronized关键字修饰，表示StringBuffer在多线程环境下运行是不安全的。
 *
 *      StringBuffer是线程安全的。
 *      StringBuilder是非线程安全的。
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {

//        使用StringBuilder也是可以完成字符串的拼接
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        sb.append("124");

        System.out.println(sb);
    }
}
