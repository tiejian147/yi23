package javase.chapter20.com.tiejian147.javase.string;

public class StringTestPractice {
    public static void main(String[] args) {
        byte[] bytes = {12,23,35};
        String s1 = new String(bytes);
        System.out.println(s1.toString());

        System.out.println("sdfds是的范德萨范德萨");

        char s2 = "我是中国人".charAt(3);
        System.out.println(s2);


        String s3 = "http://www.baidu.com";
        String s4 = "www";
        String s5 = "www";
        String s6 = "wwW";
        //判断前面的字符串是否包含后面的字符串  contains()
        System.out.println(s3.contains(s4));//true
        //判断前面的字符串是否以后面的字符串结尾   endsWith()
        System.out.println(s3.endsWith(s4));//false
        //比较两个字符串是否相等   用equals()
        System.out.println(s3.equals(s4));//false
        System.out.println(s4.equals(s5));//true
        //比较两个字符串是否相等，且不区分大小写
        System.out.println(s5.equalsIgnoreCase(s6));//true

        //转化为字节数组的方法 getBytes()
        byte[] bytes1 = "wodfd".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }







    }
}
