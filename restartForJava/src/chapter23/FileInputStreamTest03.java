package chapter23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
最终版
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        //还是先建立个null的文件对象
        FileInputStream files = null;
        try {
            files = new FileInputStream("C:\\迅雷下载\\test.temp");

            byte[] bytes = new byte[4];
            int readCount = 0;
            while ((readCount = files.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (files != null) {
                try {
                    files.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
