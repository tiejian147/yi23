/*
    需求：假设系统给定一个人的年龄，根据年龄来判断这个人出于生命的哪个阶段？
    这个年龄需要从键盘输入，且年龄必须在0-150岁之间。
    【0-5】     幼年；
    【6-10】    少儿；
    【11-18】   青少年；
    【19-35】   青年；
    【36-55】   中年；
    【56-150】  老年；
*/



public class IfTest02 {

    public static void main(String[] args){

        //首先声明一个变量年龄；
        int age ;

        //然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("请输入您要键入的年龄值：" );//输出提示信息，要不然用户都不知道要干嘛

        //通过键盘输入年龄值
        age = s.nextInt();// 停下来等待用户的输入，输入之后自动接收，赋值给age变量。

        // if(age < 0 || age > 150){

        //     System.out.println("您输入的年龄不合法！");
        // }
        // else if (age >= 0 && age <= 5){

        //     System.out.println("您的阶段为幼年：" + age + "岁");
        // }
        // else if (age >= 6 && age <= 10){

        //     System.out.println("您的阶段为少儿：" + age + "岁");
        // }
        // else if (age >= 11 && age <= 18){

        //     System.out.println("您的阶段为青少年：" + age + "岁");
        // }
        // else if (age >= 19 && age <= 35){

        //     System.out.println("您的阶段为青年：" + age + "岁");
        // }
        // else if (age >= 36 && age <= 55){

        //     System.out.println("您的阶段为中年：" + age + "岁");
        // }
        // else {
        //     System.out.println("您的阶段为老年：" + age + "岁");
        // }

        //老师的写法：
        String str = "您处于生命周期的老年阶段";

        if(age < 0 || age >150){
            str = "您输入的年龄不合法！";
        }else if (age <= 5){
            str = "您处于生命周期的幼儿阶段";
        }else if(age <= 18){
            str = "您处于生命周期的青少年阶段";
        }else if(age <= 35){
            str = "您处于生命周期的青年阶段";
        }else if(age <= 55){
            str = "您处于生命周期的中年阶段";
        }
        //如果都不是那么就打印原始变量的赋值
        System.out.println(str);

       

       

        



    }

}