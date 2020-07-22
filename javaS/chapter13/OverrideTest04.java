/***
 * 关于Object类中的toString方法
 *      1、 toString() 方法的作用是什么？
 *         作用：将“java对象” 转换成 “字符串” 的形式
 *      2、Object类中toString() 方法的默认实现是什么？
 *          public String toString(){
 *              return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *          }
 *          toString :方法名的意思是转换成String
 *          含义：调用一个java对象的toString() 方法就可以将java对象转换成字符串的表示
 * 
 *      3、那么toString() 方法给的默认实现够用吗？
 * 
 *      
 */


public class OverrideTest04 {
    public static void main(String[] args){
        //创建一个日期对象
        MyDate d1 = new MyDate();

        //调用toString() 方法（将对象转换成字符串形式）
        System.out.println(d1.toString());//输出：MyDate@15db9742 

        //创建一个日期对象
        MyDate d2 = new MyDate(1980,3,24);
        System.out.println(d2.toString());

        
    }
}

//日期类
class MyDate{
    private int year;
    private int month;
    private int day;

    //无参构造方法
    public MyDate(){
        this(1970,1,1);
    }
    //有参构造方法
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //setter and getter
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

    /**
     * 从Object类中继承过来的那个toString()方法已经无法满足我业务需求了
     * 我在子类MyDate中有必要对父类的toString()方法进行覆盖/重写
     * 我的业务要求是：调用toString()方法进行字符串转换的时候，希望转换的
     * 结果是：xxx年x月x日，这种格式
     * 重写一定要复制粘贴，不要手动编写，会错的
     */

     public String toString(){
         return year + "年" + month + "月" + day + "日";
     }

}