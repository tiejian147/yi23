package chapter21;
/*
java语言中的异常是以什么形式存在呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象；
    2、异常对应现实生活中是怎样的？
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过异常类实例化 “异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);

        //另一个实例化异常对象
        NullPointerException npe = new NullPointerException("空指针异常了");
        System.out.println(npe);


    }
}
