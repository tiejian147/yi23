package chapter18;
/*
关于equals()方法是否够用的问题；
    编程过程当中，需要调用equals()方法来判断两个对象是否相等。
 */
public class EqualsTest01 {
    public static void main(String[] args) {
        MyTime01 mt03 = new MyTime01(1980,02,02);
        MyTime01 mt04 = new MyTime01(1980,02,02);
        System.out.println(mt03);

    }
}

class MyTime01{
    int year;
    int month;
    int day;

    //    构造器
    public MyTime01() {
    }

    public MyTime01(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    重写toString方法

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
//    重写equals()方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime01 myTime01 = (MyTime01) o;
        return year == myTime01.year &&
                month == myTime01.month &&
                day == myTime01.day;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}