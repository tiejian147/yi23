package day27;
/*
编写程序模拟用户注册：
    1、程序开始执行时，提示用户输入"用户名"和"密码"信息；
    2、输入信息之后，后台java程序模拟用户注册；
    3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。

    注意：
        完成注册的方法放到一个单独的类中。
        异常类自定义即可

        class UserService{
            public void register(String username, String password)
//            这个方法中完成注册
        }

     编写main方法，在main方法中接受用户输入的信息，在main方法中调用UserService的 register方法完成注册。
 */
public class MyUserService {
    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            us.register(null,null);

        } catch (MyUserServiceException e) {
            System.out.println(e.getMessage());
        }

    }
}
