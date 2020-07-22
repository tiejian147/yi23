/**
 * 什么是受变量声明为实例的，什么时候声明为静态的？
 *      如果这个类型的所有对象的某个属性值都是一样的，
 *      不建议定义为实例变量，浪费内存空间，建议定义为类级别特征，
 *      定义为静态变量，在方法区中只保留一份，节省内存开销。
 * 
 *    一个对象一份的是实例变量。
 *    所有对象一份的是静态变量。
 * 
 */

 public class StaticTest02{
    public static void main(String[] args){
        // Chinese p1 = new Chinese("23564564645","张三","中国");
        // Chinese p2 = new Chinese("25234654","李四","中国");

        // System.out.println(p1.idCard);
        // System.out.println(p1.name);
        // System.out.println(p1.country);
        // System.out.println("------------------------------");

        // System.out.println(p2.idCard);
        // System.out.println(p2.name);
        // System.out.println(p2.country);


        Chinese p1 = new Chinese("23564564645","张三");

        Chinese p2 = new Chinese("25234654","李四");

        //打印国籍：
        System.out.println(Chinese.country);

        System.out.println(p1.idCard);
        System.out.println(p1.name);

        System.out.println(p2.idCard);
        System.out.println(p2.name);
    }
 }

//  class Chinese{
//      //身份证号
//      //每一个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份
//      String idCard;

//      //姓名
//      //姓名也是一个人一个姓名，姓名也应该是实例变量
//      String name ;

//      //国籍
//      //对于”中国人“这个类来说，国籍都是中国，不会随着对象的改变而改变
//      //显然国际级并不是对象级别的特征
//      //国籍属于整个类的特征，整个族的特征
//      String country;

//      //无参数构造方法：
//      public Chinese(){

//      }

//      //有参数的构造方法
//      public Chinese(String s1,String s2,String s3){
//         idCard = s1;
//         name = s2;
//         country = s3;
//      }
//  }

class Chinese{
    //身份证号
    //每一个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份
    String idCard;

    //姓名
    //姓名也是一个人一个姓名，姓名也应该是实例变量
    String name ;

    //国籍
    //重点重点五颗星：加static的变量叫做静态变量
    //静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了
    //静态变量存储在方法区
    static  String country = "中国";

    //无参数构造方法：
    public Chinese(){

    }

    //有参数的构造方法
    public Chinese(String s1,String s2){
       idCard = s1;
       name = s2;
    }
}
    
