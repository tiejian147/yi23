package day27;
//写一个用户服务的异常类
public class MyUserServiceException extends Exception{
//    编写一个无参数的构造方法
    MyUserServiceException(){

    }

//    编写一个有参数的构造方法
    MyUserServiceException(String s){
        super(s);
    }
}
