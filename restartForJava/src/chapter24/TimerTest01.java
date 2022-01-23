package chapter24;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
定时器任务
 */
public class TimerTest01 {
    public static void main(String[] args) {
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);//守护线程的方式

        //指定定时任务
        //timer.schedule(定时任务，第一次执行任务的时间，间隔多久);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2022-01-23 21:07:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println(firstTime);
        timer.schedule(new logTimeTask(),firstTime,1000*5);

    }
}
//编写一个定时任务类
//假设这是一个记录日志的定时任务
class logTimeTask extends TimerTask {

    @Override
    public void run() {
        //编写你需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + ":完成了一次数据备份");
    }
}
