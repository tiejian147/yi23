package javase.chapter20.com.tiejian147.javase.date;

/**
 * 获取自1970年1月1日 00：00：00 000 到当前系统时间的总毫秒数
 * 1秒=1000毫秒
 *
 * 简单总结一下System类的相关属性和方法：
 *      System.out [out是System类的静态变量]
 *      System.out.println() [println()方法不是System类的，是PrintStream类的方法]
 *      System.gc() 建议启动垃圾回收器
 *      System.currentTimeMillis() 获取字1970年1月1日到系统当前时间的总毫秒数
 *      System.exit(0) 退出JVM
 */
public class DateTest02 {
    public static void main(String[] args) {
//        获取自1970年1月1日 00：00：00 000 到当前系统时间的总毫秒数
        long nowTime = System.currentTimeMillis();
        System.out.println(nowTime);//1596105773080

//        统计一个方法耗时
//        在调用目标方法之前记录一个毫秒数
        long nowTime1 = System.currentTimeMillis();

        println();

        long nowTime2 = System.currentTimeMillis();
        System.out.println("耗时为：" + (nowTime2 - nowTime1) + "毫秒");

    }

    public static void println(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i=" + i);
        }
    }
}
