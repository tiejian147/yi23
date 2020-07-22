/*
    switch 确实可以探测String类型，这是java7的新特性
        如果用的版本是java7之前的版本，那么switch括号里的变量就不能是String类型
*/


public class SwitchTest02 {
    public static void main(String[] args){

        //收集键入的信息
        java.util.Scanner s = new java.util.Scanner(System.in);

        //声明String类型的变量
        String dayOfWeek ;

        //等待用户输入
        System.out.println("请输入今天星期几");
        dayOfWeek = s.next();

        switch(dayOfWeek){

            case "星期一" :
                System.out.println(1);
                break;
            case "星期二" :
                System.out.println(2);
                break;
            default :
                System.out.println("输入不合法");

        }

        char ch = '8';
        int r = 10;
        switch(ch + 1){
            case 1:
                System.out.println("dui");
                break;
            case 9:
                System.out.println(9);
            break;
            default :
                System.out.println("cuo");
        }

        System.out.println(ch + 1);


        System.out.println("================================");


        switch(5){
            default :
                System.out.println(5);
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                break;
            
        }


    }
}