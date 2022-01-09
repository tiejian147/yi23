package chapter23;

import java.io.File;
import java.io.IOException;

/*
file类：

 */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\迅雷下载\\file");
        //判断File是否存在
        System.out.println(file.exists());;
        //如果file不存在，就以文件的形式新建
        /*if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("新建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        //如果file不存在，以目录的形式新建
        if (!file.exists()){
            file.mkdir();
            System.out.println("创建目录成功");
        }
    }
}
