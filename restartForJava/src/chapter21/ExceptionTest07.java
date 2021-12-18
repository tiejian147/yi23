package chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
深入try...catch
    1、catch后面的小括号类型可以是具体的类型，也可以是异常类型的父类型；
    2、catch可以写多个，建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch多个的时候，必须遵循从小到大的规律。

    注意：如何选择throw还是try...catch呢？
        如果希望调用者来处理，选择throws上报;
        其他情况使用捕捉的方式。
 */
public class ExceptionTest07 {
    public static void main(String[] args) {

        try {
            new FileInputStream("C:\\个人资料电子版\\刘生超简历0316.pdf");
            System.out.println("这句话打印出来说明文件找到了，没有异常");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到了~~");
        }
    }
}
