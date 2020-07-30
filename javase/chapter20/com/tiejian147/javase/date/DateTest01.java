package javase.chapter20.com.tiejian147.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {
//        获取系统当前时间（精确到毫秒的系统当前时间）
//        直接调用无参数构造方法
        Date nowTime = new Date();

//        java.util.Date类的toString方法已经被重写了
//        输出的应该不是一个对象的内存地址，应该是一个日期的字符串
        System.out.println("现在时间为：" + nowTime);//Thu Jul 30 15:05:00 CST 2020

        /**
         * 日期可以格式化吗？
         * 将日期类型Date，按照指定的格式进行转换：Date --- 转换成具有一定格式的日期字符串--->String
         * SimpleDateFormat是java.text包下的，专门负责日期格式化的
         * yyyy 年
         * MM 月
         * dd 日
         * HH 时
         * mm 分
         * ss 秒
         * SSS 毫秒(毫秒3位，最高999，1000代表1秒)
         * 注意：在日期格式中，除了y M d H m s S 这些字符不能随便写之外，剩下的符号格式自己随意组织
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

//        调用simpleDateFormat里的format方法，然后传参：nowTime
        String str1 = simpleDateFormat.format(nowTime);
        System.out.println(str1);

//        或者不用声明变量，直接打印
        System.out.println(simpleDateFormat.format(nowTime));

//        假设现在有一个日期字符串String，怎么转换成Date类型
        String s1 = "2020-07-30 17:44:05 005";
        Date dateTime = simpleDateFormat.parse(s1);
        System.out.println(dateTime);//Thu Jul 30 17:44:05 CST 2020
//        再弄的格式化美观一些
        System.out.println(simpleDateFormat.format(dateTime));//2020-07-30 17:44:05 005
    }
}
