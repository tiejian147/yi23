package javase.chapter20.com.tiejian147.javase.string;

/**
 * 分析以下程序一共创建了几个对象?
 */
public class StringTest03 {
    public static void main(String[] args) {
/**
 * 一共创建了3个对象：
 *      方法区字符串常量池中有1个："abc"
 *      堆内存中有两个String对象
 *      一共3个。
 */
        String s1 = new String("abc");
        String s2 = new String("abc");
    }
}
