/*
3、在程序中经常对时间进行操作但是并没有时间类型的数据。
        那么我们可以自己实现一个时间类来满足程序中的需要。
        * 定义名为MyTime的类其中应有三个整型成员：时hour、分minute、秒second
        为了保证数据的安全性这三个成员变量应声明为私有。
        * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。
        再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下方法：
        addSecond(int sec) addMinute(int min)
        addHour(int hour) subSecond(int sec)
        subMinute(int min) subHour(int hour)

 */
public class MyTime {
    public static void main(String[] args) {
        Time t1 = new Time(5,15,10);
        //调用增加秒的方法
        t1.addSecond(90);

        //调用增加分的方法
        t1.addMinute(90);

        //调用增加时的方法
        t1.addHour(19);

//        System.out.println(t1.getSecond());
//        System.out.println(t1.getMinute());

        //打印时间
        System.out.println("现在的时间为：" + t1.getHour() + "时" + t1.getMinute() + "分" + t1.getSecond() + "秒");
    }

}
class Time{
    //设置私有属性 小时
    private int hour;

    //设置私有属性 分钟
    private int minute;

    //设置私有属性 秒
    private int second;

    //创建无参数构造方法

    public Time() {
    }

    //创建有参数构造方法

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //创建setter方法

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    //创建getter方法

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //创建增加秒的方法
    public void addSecond(int sec){
        this.second = sec + this.getSecond();
        if(this.second >= 60 && this.second <120){
            this.second = this.getSecond() - 60;
            this.minute += 1;
        }

    }

    //创建增加分的方法
    public void addMinute(int min){
        this.minute = min + this.getMinute();
        if(this.minute >= 60 && this.minute <120){
            this.minute = this.getMinute() - 60;
            this.hour += 1;
        }

    }

    //创建建增加时的方法
    public void addHour(int hourNum){
        this.hour = hourNum + this.getHour();
        if(this.hour > 24){
            this.hour = this.getHour() - 24;
            System.out.println("现在是第二天的：" + getHour() + "时" + getMinute() + "分" + getSecond() + "秒");
        }
    }
}
