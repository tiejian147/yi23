package chapter11;
/*
this还有个新语法：可以调用当前类中的其他方法；
    this();

    总结：这个当前类中用this() 的用法，不会也没关系,没感觉提高多少效率；
 */
public class ThisTest04 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.detail();

        Date d2 = new Date(1980,5,20);
        d2.detail();
    }
}

class Date{
    private int year;
    private int month;
    private int day;

    public Date() {
            this(1970,1,1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//    再来一个方法
    public void detail(){
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}
