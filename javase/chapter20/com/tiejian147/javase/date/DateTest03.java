package javase.chapter20.com.tiejian147.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
//        这里的参数是传毫秒的
        Date time = new Date(156345345);
//        这样不好看
        System.out.println(time);//Thu Jan 01 08:00:00 CST 1970

//        new一个格式化的对象，然后把刚才的time传进去
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

//        因为北京是东八区，差8个小时
        System.out.println(sdf1.format(time));//1970-01-01 08:00:00 001

//        获取昨天此时的时间
        /**
         * 思路错了
//        首先获取当前时间
        Date nowTime = new Date();
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("当前时间为：" + sdf1.format(nowTime));
         */
//      System.currentTimeMillis() 这个方法是获取自1970年1月1日到现在的总毫秒数，然后减去一天的毫秒数，就是昨天的时间了
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
//        然后再格式化一下
        System.out.println(sdf1.format(time2));

//        再获取去年今天的时间
        /*
        long aYearTime = 1000L * 60 * 60 * 24 * 365;
        System.out.println(aYearTime);
        */
        Date time3 = new Date(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 365);
        String lastYearTime = sdf1.format(time3);
        System.out.println("去年的时间为：" + lastYearTime);
    }
}
