/*
3、在程序中经常对时间进行操作但是并没有时间类型的数据。 
那么我们可以自己实现一个时间类来满足程序中的需要。
定义名为MyTime的类其中应有三个整型成员：时hour、分minute、秒second 
为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时初始化成员变量。 再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下方法：
addSecond(int sec) addMinute(int min) addHour(int hour) subSecond(int sec)
subMinute(int min) subHour(int hour)
*/

public class TimeTest{
   public static void main(String[] args){

   }

}

class Time{
    //设置私有属性 小时
    private int hour;

    //设置私有属性 分
    private int minute;
 
    //设置私有属性 秒
    private int second;
}