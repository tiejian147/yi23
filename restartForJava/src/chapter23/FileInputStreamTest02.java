package chapter23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
y用循环的方式
 */
public class FileInputStreamTest02{
    public static void main(String[] args) {
        FileInputStream fips = null;
        try {
            fips = new FileInputStream("C:\\迅雷下载\\test.temp");
            /*while (true){
                int readData = fips.read();
                if (readData == -1){
                    break;
                }
                System.out.println(readData);
            }*/
            //改造while循环
            int readData = 0;
            while ((readData = fips.read()) != -1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            //文件找不到的异常
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fips != null) {
                    fips.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
