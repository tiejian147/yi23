package javase.chapter20.com.tiejian147.javase.Stringbuffer;

/**
 * 如果以后需要进行大量字符串的拼接，建议使用JDK中自带的：
 *      java.lang.StringBuffer
 *      java.lang.StringBuilder
 *
 * 如何优化StringBuffer的性能？
 *      在创建StringBuffer的时候尽可能给定一个初始化容量。
 *      最好减少底层数组的扩容次数，预估计一下，给一个大一些的初始化容量。
 *      关键点：给一个合适的初始化容量。
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
//        创建一个初始化容量为16个byte[] 数组，（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

//        拼接字符串，以后拼接字符串统一调用append()方法
//        append是追加的意思
        stringBuffer.append("s");
        stringBuffer.append("tu");
        stringBuffer.append("dent");
        stringBuffer.append("321");
//        append方法底层在进行追加的时候，如果byte数组满了，会自动扩容
        stringBuffer.append(100L);


        System.out.println(stringBuffer.toString());

//        预先给一个初始化容量
        StringBuffer sb = new StringBuffer(100);
        sb.append("hello");
        sb.append("world");
        sb.append("ooo");

        System.out.println(sb.toString());
    }
}
