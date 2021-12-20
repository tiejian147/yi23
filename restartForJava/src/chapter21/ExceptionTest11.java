package chapter21;
/*
finally语句
    重点：放在finally语句块中的代码是一定执行的
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //try 和 finally 可以联合使用
        //以下代码的执行顺序：
        //先执行try，再执行finally，最后执行return
        try{
            System.out.println("try begin!");
            return;
        }finally {
            System.out.println("finally over");
        }
    }
}
