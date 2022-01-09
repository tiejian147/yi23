package chapter23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader：
    带有缓冲区的字符输入流；
    使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，
    自带缓冲。
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        /*
        当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流；
        外部负责包装的这个流：叫做包装流，或者处理流；
        像当前这个程序来说：FileReader就是一个节点流，BufferedReader就是一包装流/处理流；
         */
        //先new 一个文件对象
        try {
            FileReader reader = new FileReader("C:\\迅雷下载\\myfile.txt");
            //创建流的对象，传参是reader
            BufferedReader br = new BufferedReader(reader);
            //readLine() 这个方法返回的是String
            String s = null;
            //这个方法是整行读，然后返回的是字符串
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
            //记得关闭
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
