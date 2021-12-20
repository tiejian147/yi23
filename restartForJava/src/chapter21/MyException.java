package chapter21;
/*
自定义异常
 */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

//或者让这个类继承  运行时异常的父类

/*
public class MyException extends RuntimeException{

}*/
