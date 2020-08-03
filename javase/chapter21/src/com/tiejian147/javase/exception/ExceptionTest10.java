package com.tiejian147.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try...catch中的finally子句：
    1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
        finally子句必须和try一起出现，不能单独编写。

    2、finally语句通常使用在那些情况下呢？
        通常在finally语句块中完成资源的释放/关闭；
        因为finally中的代码比较有保障；
        即使try语句块中的代码出现异常，finally中代码也会正常运行。
 */
public class ExceptionTest10 {
    public static void main(String[] args) {

//      创建输入流对象
        FileInputStream fis = null;//声明位置放在try外面 ，这样在finally中才能用
        try {
             fis = new FileInputStream("C:\\迅雷下载\\小说\\长夜难明.txt");

//        开始读文件
            String s = null;
//        这里一定会出现异常！
            s.toString();

            System.out.println("hello world");
//        流使用完一定要关闭，因为流是占用资源的
//            即使以上程序出现异常，流也必须要关闭，放在这里有可能关不了
//            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            System.out.println("hello haoke");
//            流的关闭放在这里比较保险
//            finally中的代码是一定会执行的
//            即使try中出现了异常
            if (fis != null){//避免空指针异常
                try {
//                    close方法有异常，这里采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("hello ketty");





    }
}
