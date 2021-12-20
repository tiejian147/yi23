package chapter21;
/*
自定义异常
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        //这样就自定义了异常
        MyException me = new MyException("用户名不能为空");
        //打印异常堆栈信息：
        me.printStackTrace();
        //打印异常信息
        System.out.println(me.getMessage());
    }
}
