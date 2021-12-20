package chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch 中的finally子句：
    1.在finally中的代码是最后执行的，并且是一定执行的，即使try语句中的代码出现了异常；
        finally子句必须和try..catch一起出现，不能单独编写。
    2.finally子句通常使用在那些情况呢？
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            //先new一个读取文件的对象
             file = new FileInputStream("C:\\个人资料电子版\\刘生超简历0316.pdf");

            // 这里一定会报空指针异常
            String s = null;
            System.out.println(s);

            //如果上面出异常，那么io流就无法关闭，因为下面代码可能会不执行
            //file.close();
            System.out.println("这里不一定有输出");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //所以io流关闭的代码放在这里比较保险，这的代码一定会执行的
            if (file != null){
                try {
                    file.close();
                    System.out.println("这里一定有输出");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
