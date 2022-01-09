package chapter23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //目录下要是没有该文件，会新建一个
            //但是这个方法会将原文件中的内容做清空，谨慎使用
            fos = new FileOutputStream("C:\\迅雷下载\\myfile.txt",true);
            byte[] bytes = {97,98,99,100};
            //把数组中的字节都写入该文件
//            fos.write(bytes);
            //用追加的方法来写出
            fos.write(bytes,0,4);


            //写完之后一定要记得刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
