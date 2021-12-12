package chapter20;

/**
 * 字符串拼接
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //append() 是追加字符串的方法
        stringBuffer.append(100);
        stringBuffer.append("sdfdsf");
        stringBuffer.append("QWE");
        stringBuffer.append(true);
        stringBuffer.append(100L);
        System.out.println(stringBuffer);



    }
}
