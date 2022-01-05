package chapter23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fism = null;
        try {
            //创建文件对象，绝对路径
             fism = new FileInputStream("C:\\迅雷下载\\test.temp");
            //开始读文件：
            int readData = fism.read();
            System.out.println(readData);//97

            int readData1 = fism.read();
            System.out.println(readData1);

            int readData2 = fism.read();
            System.out.println(readData2);

            int readData3 = fism.read();
            System.out.println(readData3);

            int readData4 = fism.read();
            System.out.println(readData4);

            int readData5 = fism.read();
            System.out.println(readData5);
            //读取到文件末尾，没有了，就会打印-1
            int readData6 = fism.read();
            System.out.println(readData6);


        } catch (FileNotFoundException e) {
            //文件找不到的异常
            e.printStackTrace();
        } catch (IOException e) {
            //文件读取的异常
            e.printStackTrace();
        } finally {
            //在finally语句块中一定要确保流要关闭
            //关闭流的前提是流不是空，空的话没必要关闭
            if (fism != null) {
                try {
                    fism.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
