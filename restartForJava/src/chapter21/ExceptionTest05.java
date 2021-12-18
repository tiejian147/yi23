package chapter21;
/*
以下代码编译时报错：
 */
public class ExceptionTest05 {
    //第一种处理方式：上抛
    /*public static void main(String[] args) throws ClassNotFoundException {

        doSome();
    }*/

    public static void main(String[] args) {
        //第二种处理方式：try...catch
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!");
    }
}
