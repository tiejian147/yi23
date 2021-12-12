package chapter20;

public class StringTest01 {
    public static void main(String[] args) {
        //常量池里面的String比较
        String s1 = "xyz";
        String s2 = "xyz";
        System.out.println(s1 == s2);
        //new对象之后String 比较
        String s3 = new String("yyy");
        String s4 = new String("yyy");
        System.out.println(s3 == s4);
        //通过以上的案例的分析，字符串对象之间的比较不能用“==”  ，不保险
        //String类中equals方法重写了，要用equals方法比较
        System.out.println("字符串对象之间比较：" + s3.equals(s4));

    }
}
