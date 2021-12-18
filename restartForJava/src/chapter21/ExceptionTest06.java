package chapter21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
深入throw
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        System.out.println("捕捉异常之后，这句话会输出");
    }
    public static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");

    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
        System.out.println("现在没出异常，出异常后，这里也不执行");
    }

    public static void m3() throws FileNotFoundException {
        System.out.println("m3 begin");
        new FileInputStream("C:\\个人资料电版\\刘生超简历0316.pdf");
        System.out.println("m3 over");
        System.out.println("现在没出异常，出异常之后，这里不执行");
    }

}
