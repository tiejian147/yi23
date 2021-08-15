package chapter14;

public class HomeworkDay16Num5 {
    public static void main(String[] args) {

    }
}

class MyTime{
//    声明三个属性
    private int second;
    private int minute;
    private int hour;
//    构造器

    public MyTime() {
    }

    public MyTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
//    setter and getter

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


}
