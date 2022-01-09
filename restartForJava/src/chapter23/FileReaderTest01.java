package chapter23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            //创建一个对象
            fr = new FileReader("C:\\迅雷下载\\myfile.txt");
            char[] chars = new char[8];
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1){
                System.out.println(new String(chars,0,readCount));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
