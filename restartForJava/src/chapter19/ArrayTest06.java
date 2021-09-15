package chapter19;
/*
编写程序：登录输入账户和密码
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("这个账户名和密码不正确，例如输入：zhangsan 123");
        }
//        程序能执行到这里，说明数组的长度是等于2的
        String username = args[0];
        String password = args[1];
//        假设username=admin&password=123时，登录成功
//        if (username.equals("admin") && password.equals("123")){
        if ("admin".equals(username) && "123".equals(password)){//这样写能避免空指针异常
            System.out.println("登录系统成功");
        }else{
            System.out.println("用户名或者密码错误");
        }
    }
}
