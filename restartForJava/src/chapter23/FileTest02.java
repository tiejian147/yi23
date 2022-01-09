package chapter23;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
file学习
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("C:\\迅雷下载\\myfile.txt");
        //获取文件名称的方法
        System.out.println("文件名：" + file.getName());
        //是否目录
        System.out.println(file.isDirectory());
        //是否文件
        System.out.println(file.isFile());
        //最后一次修改文件的时间
        long lastTime = file.lastModified();
        //将总毫秒转换成日期
        Date date = new Date(lastTime);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss SSS");
        String srtTime = sdf.format(date);
        System.out.println("最后一次修改的时间是：" + srtTime);

        //获取文件大小
        System.out.println("文件大小：" + file.length());//字节

        //获取当前目录下所有的子文件
        //File[] listFile();
        File file1 = new File("C:\\迅雷下载");
        File[] files =  file1.listFiles();
        //foreach
        for (File file2 : files) {
            System.out.println(file2.getAbsolutePath());
        }


    }
}
