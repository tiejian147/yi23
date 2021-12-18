package chapter21;
/*
异常对象有两个非常重要的方法：
    1、获取异常的简单的描述信息：
        String name = exception.getMessage();
    2、打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        //空指针异常 打印信息
        NullPointerException e = new NullPointerException("空指针异常");
        System.out.println(e.getMessage());

        //打印异常的堆栈信息
        e.printStackTrace();
        System.out.println("hello world");
    }
}
