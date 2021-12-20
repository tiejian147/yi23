package chapter21.homework;
/*
用户注册异常类
 */
public class UserServiceException extends Exception{
    public UserServiceException() {
    }

    public UserServiceException(String message) {
        super(message);
    }
}
