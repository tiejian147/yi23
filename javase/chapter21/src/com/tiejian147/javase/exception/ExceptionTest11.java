package javase.chapter21.src.com.tiejian147.javase.exception;
/*
finally语句
    【再次强调！！！！！】：放在finally语句块中的代码是一定会执行的！！！！！！！
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try 和 finally，没有catch可以吗？可以的
            但是try不能单独使用；
            try，finally可以联合使用；

            以下代码的执行顺序：
                先执行try.....
                再执行finally.....
                最后再执行return （return只要执行，方法必然结束）
         */
        try {
            System.out.println("try.....");
            return;
        }finally {
//            finally中的语句是一定会执行的，一定会的！！！！
            System.out.println("finally.....");
        }
//        这里不能写语句，因为这个代码是无法执行到的
//        System.out.println("hello world");
    }
}
