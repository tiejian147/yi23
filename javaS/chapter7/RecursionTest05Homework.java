/*
    编写程序，模拟用户登录功能，程序开始运行时，现在DOS命令窗口中初始页面。
    提醒用户输入用户名和密码，当用户输入用户名为admin，密码为123的时候，登录成功
    打印欢迎信息，当用户输入的用户名和密码不正确时，打印错误提示信息并退出系统。
    尽可能用定义相关方法来完成，不要吧所有的代码都写到main方法当中。

*/

public class RecursionTest05Homework{
    public static void main(String[] args){
        //等待键盘录入
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.println("请输入账号：");

        // String userName ;
        // s.next();
        // boolean result = true;
        
        if( userLonginForUsername(s.next())){
            System.out.println("成功");
        }
        // System.out.println("失败");
        

    }

    public static boolean userLonginForUsername(String userName){
        if(userName == "admin"){
            return true;
        }
        return false;
    }
}