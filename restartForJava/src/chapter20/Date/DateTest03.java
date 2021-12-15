package chapter20.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Date 的方法
 */
public class DateTest03 {
    public static void main(String[] args) {
        // 构造方法中传值  单位是毫秒
        Date date = new Date(1);
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s1.format(date));

        //获取昨天的时间
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date2 = new Date(System.currentTimeMillis() - 60 * 60 * 24 * 1000);
        System.out.println(s2.format(date2));//昨天的时间

        //获取去年的这个时候的时间
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        long l1 = 1000 * 60*24*60*365;
        System.out.println(l1);
        Date date3 = new Date(System.currentTimeMillis() - l1);
        System.out.println(s3.format(date3));//昨天的时间



    }
}
