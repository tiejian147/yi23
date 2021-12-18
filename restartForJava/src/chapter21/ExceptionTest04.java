package chapter21;
/*
以下代码编译时报错：
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        /*
        main方法中调用doSome()方法
        因为doSome()方法声明位置上有：throws ClassNotFoundException
        我们在调用这个方法之前必须要进行预先处理
        如果不处理，编译器就会报错
         */
//        doSome();
    }

    /**
     * doSome方法在声明位置上使用了:throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常，
     * 叫做类没有找到异常。这个类的直接父类是：Exception,所以ClassNotFoundException是编译时异常。
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!");
    }
}
