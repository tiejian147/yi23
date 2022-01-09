package chapter23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream其他的方法：
    int available(); 返回流当中剩余的没有读到的字节数量；
    long skip(long n); 跳过几个字节不读；
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fils = null;
        try {
            fils = new FileInputStream("C:\\迅雷下载\\test.temp");
            //读一个字节
            int readbyte =  fils.read();
            //还剩下多少个字节：
            System.out.println("读完一个还剩：" + fils.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fils != null) {
                try {
                    fils.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
