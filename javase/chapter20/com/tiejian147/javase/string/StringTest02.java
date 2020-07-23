package javase.chapter20.com.tiejian147.javase.string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
//        "hello"是存储在方法去的字符串常量池当中
//        所以这个"hello"不会新建（因为这个对象已经存在了）
        String s2 = "hello";


//        分析打印结果是true 还是false？
//        == 双等号比较的是不是变量中保存的内存地址：是的
        System.out.println(s1 == s2);//true

        String s3 = new String("abc");
        String s4 = new String("abc");

//        分析结果是true还是false？
//        == 双等号比较的是不是变量中保存的内存地址：是的
        System.out.println(s3 == s4);//false

//        通过这个案例的学习，我们知道了：字符串对象之间的比较不能使用"=="
//        "=="不保险，应该调用String类的equals方法
//        String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法

        System.out.println(s3.equals(s4));//true

//        为什么"testing"这个字符串后面可以加"."呢？
//        因为"testing"是一个String字符串对象，只要是对象都能调用方法
        String k = new String("testing");
        System.out.println("testing".equals(k));//建议使用这种方式，因为这个方式可以避免空指针异常
//        还可以写成这样：
        System.out.println(k.equals("testing"));
    }
}
