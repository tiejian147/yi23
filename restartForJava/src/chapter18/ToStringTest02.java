package chapter18;

public class ToStringTest02 {
    public static void main(String[] args) {
        String s1 = new String("test01");
        String s2 = new String("test01");

//        对象之间的比较不能用== 符号，因为这个比较的是对象的内存地址
        System.out.println(s1 == s2);//false  这个结果是不正确的

//        这个结果竟然是true，说明String类中已经重写equals方法了
        System.out.println(s1.equals(s2));//true

//      经过测试，说明String类已经重写了toString()方法了
        System.out.println(s1.toString());

    }
}
