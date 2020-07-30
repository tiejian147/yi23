package javase.chapter20.com.tiejian147.javase.integer;

/**
 * String int Integer之间互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {

//        String-->int
        int i1 = Integer.parseInt("100");
        System.out.println(i1 + 1);//101

//        int-->String
        String s2 = i1 + "";
        System.out.println(s2 + 1);//1001

//        int --> Integer
//        自动装箱
        Integer x = 1000;
        System.out.println(x);//1000;

//        Integer --> int
//        自动拆箱
        int y = x;
        System.out.println(y);//1000

//        String --> Integer
        Integer k = Integer.valueOf("123");
        System.out.println(k);

//        Integer --> String
        String e = String.valueOf(k);
        System.out.println(e);
    }
}
