package chapter23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
记录日志：
 */
public class Logger {
    public static void log(String msg){
        try {
            //true是文件追加的意思
            PrintStream out = new PrintStream(new FileOutputStream("C:\\迅雷下载\\log.txt"),true);
            //改变输出方向：
            System.setOut(out);
            //增加一个时间的对象
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            //输出时间+日志
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
