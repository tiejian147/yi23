/**
 * editPlus中蓝色是关键字
 * 黑色是标识符
 * 以上代码中：System、 out、println 都是标识符
 * 在editplus中的红色字体，表示这个类是SUN公司JDK写好的一个类
 */

 public class Test{
     //入口
     public static void main(String[] args){
            Test.stu.exam();
            System.out.println("hello world");
     }
     //静态变量
     static Student stu = new Student();

     
 }

 class Student{
     //实例方法
     public void exam(){
         System.out.println("kaoshi .....");
     }
 }