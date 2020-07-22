/**
 * 1、this除了可以使用在实例方法中，还可以使用在构造方法中。
 * 2、新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下新语法：
 *      this(实际参数列表)
 *      
 *      通过一个构造方法1去调用构造方法2，可以做到代码复用。
 *      但需要注意的是：构造方法1和构造方法2都是在同一个类当中
 * 3、this() 这个语法作用是什么：代码复用
 * 4、还有一个特殊规则：死记硬背
 *      this() 的调用只能出现在构造方法的第一行。
 * 
 *      要是这个this()在构造方法前面还有其他代码，就会报错。 
 */

public class ThisTest04{
    public static void main(String[] args){
        Date d1 = new Date();
        d1.detail();

        Date d2 = new Date(1898,12,23);
        d2.detail();

        
    }
}

/**
 * 需求：
 * 1、定义一个日期类，可以表示年月日信息
 * 2、需求中要求：
 *      如果调用无参数构造方法，默认创建的日期为：1970年1月1日；
 *      当然，除了调用无参数构造方法之外，也可以调用有参数的构造方法
 *      来创建日期对象。
 */

 class Date{
     //创建实例变量年
     int year;
     //创建实例变量月
     int month;
     //创建实例变量日
     int day;

     //创建无参数构造方法
     public Date(){
        //以下代码如果调用其他构造方法怎么写？
        // this.year = 1970;
        // this.month = 1;
        // this.day = 1;

        //这里是调用了下面有参数的构造方法
        this(1970,1,1);
     }
     //创建有参数构造方法
     public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
     }

     //写一个detail方法来调用
     public void detail(){
        System.out.println("日期为" + year + "年" + month + "月" + day + "日");
     }

     //setter 和 getter 方法
     public void setYear(int year){
         this.year = year;
     }
     public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

 }