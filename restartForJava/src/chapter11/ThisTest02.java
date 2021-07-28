package chapter11;

public class ThisTest02 {
//    实例变量
    int k = 1;

//    静态变量
    static String s = "中国";
    public static void main(String[] args) {
//        如果想访问k,必须要先new对象
//        ThisTest02 tt = new ThisTest02();
        System.out.println(new ThisTest02().k);

//        访问静态变量，用类名. 的方式访问就好了
        System.out.println(ThisTest02.s);
    }
}
