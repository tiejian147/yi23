package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 关于Integer 类的构造方法，有两个：
 *  Integer(int)
 *  Integer(String)
 */
public class IntegerTest03 {
    public static void main(String[] args) {

//        java9之后不建议使用这个构造方法了，出现横线表示已经过时
//        将数字100转换成Integer包装类型（int --> Integer）
        Integer x = new Integer(100);
        System.out.println(x);

//        将String类型的数字，转换成Integer包装类型（String --> Integer）
        Integer s = new Integer("123");
        System.out.println(s);

//        double --> Double
        Double d = new Double(1.23);
        System.out.println(d);

//        String -- > double
        Double e = new Double(3.14);
        System.out.println(e);

    }
}
