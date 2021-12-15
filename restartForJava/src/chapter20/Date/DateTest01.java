package chapter20.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间
        Date nowDate = new Date();
        System.out.println(nowDate);//这里打印的日期格式不符合中国人查看
        //如何日期格式化? SimpleDateFormat 这个类就是日期格式化的类
        //date 转化为 String
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy+MM+dd HH:mm:ss SSS");
        System.out.println(sdf1.format(nowDate));
        System.out.println(sdf2.format(nowDate));
        System.out.println(sdf3.format(nowDate));

        //String 如何转化为Date
        String nowDate2 = "2021-12-12 09:12:24 456";
//        SimpleDateFormat sdf4 = new SimpleDateFormat("要和要转换的日期格式相同");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date1 = sdf4.parse(nowDate2);//这里报错了，先抛个异常

        System.out.println(sdf4.format(date1));//这里还是String
        System.out.println(date1);//这里就是Date类型



    }
}
