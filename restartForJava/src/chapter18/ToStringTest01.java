package chapter18;
/*
toString方法是需要重写的
 */
public class ToStringTest01 {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(1970,01,02);
        System.out.println(mt1);
    }
}

class MyTime{
    int year;
    int month;
    int day;

//    构造器
    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    重写toString方法

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
