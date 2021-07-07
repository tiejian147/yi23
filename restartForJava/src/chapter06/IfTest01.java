package chapter06;

public class IfTest01 {
    public static void main(String[] args) {
//        让我们来练习一下
        int a = 10;
        int b = 15;
        int c = 30;
        int d = 100;
//        这是第一种语法结构
        if (a > b){
            System.out.println("这里没执行");
            System.out.println("a>b");
        }
        System.out.println("a<b");
//        这是第二种语法结构
        if (a < b){
            System.out.println("这里就对了");
        }else {
            System.out.println("走这里就错了");
        }

//        这是第三种写法
        if (c > d){
            System.out.println("这里不能执行");
        }else if (b > c){
            System.out.println("这里不能执行2");
        }else if (d > c){
            System.out.println("这里执行就对了3");
        }else if (a > d){
            System.out.println("这里执行也不对4");
        }

//        做一个练习题
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入年龄值：");

        int age = s.nextInt();

        if ( age > 150 || age < 0 ){
            System.out.println("您输入的年龄不合法");
        }else if (age >= 0 && age <=5){
            System.out.println("该年龄属于婴幼儿");
        }else if (age >= 6 && age <= 10){
            System.out.println("该年龄属于少儿");
        }else if (age >= 11 && age <=18){
            System.out.println("该年龄属于少年");
        }else if (age >= 19 && age <=35){
            System.out.println("该年龄属于青年");
        }else if (age >= 36 && age <=55){
            System.out.println("该年龄属于中年");
        }else if (age >= 56 && age <=150){
            System.out.println("该年龄属于老年");
        }
    }
}
