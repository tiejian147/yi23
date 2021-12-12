package chapter20;

/**
 * 使用StringBuild 类进行扩容
 * 和StringBuffer的区别：
 *      StringBuffer是线程安全的；
 *      StringBuild是非线程安全的；
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdfds");
        stringBuilder.append("bbc");
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append(false);
        System.out.println(stringBuilder);
    }
}
