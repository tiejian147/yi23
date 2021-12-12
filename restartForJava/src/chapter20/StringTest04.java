package chapter20;
//String类中的构造方法
public class StringTest04 {
    public static void main(String[] args) {
        byte[] bytes = {97,98,99};
        String s1 = new String(bytes);
        System.out.println(s1);//abc   说明String类已经重写了toString方法；

        String s2 = "sdfsd";
        System.out.println(s2);//String类中已经重写了toString方法；

        //将bytes数组中的一部分转换成字符串
        String s3 = new String(bytes,1,2);
        System.out.println(s3);//bc  从下标1，往后2位

        //将char数组转化成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        //将char数组部分转化成字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);

    }
}
