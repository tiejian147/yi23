package chapter23;

import java.io.*;

/*
转换流
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        //字节流
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:\\迅雷下载\\myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //字节转换成字符流
        InputStreamReader reader = new InputStreamReader(in);

        //这个方法只能传字符流，所以上面就转换了
        BufferedReader br = new BufferedReader(reader);
        String s = null;
        while (true){
            try {
                if (!((s = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
        //仍然记得需要关闭
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
