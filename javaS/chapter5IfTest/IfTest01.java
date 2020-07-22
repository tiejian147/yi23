/*
    关于java语言中的if语句：属于选择结构，if语句又被成为分支语句/条件控制语句；

        1、if语句的语法结构：四种编写方式；

            第一种：
                if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
            
            第二种：
                if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
                else{
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
                
            第三种：
                if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }else if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
            第四种：
                if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
                else if(布尔表达式){
                    java语句;
                    java语句;
                    java语句;
                    ...
                }
                else{
                    java语句;
                }
    2、重点：对于java中的if语句来说，只要有一个分支执行，整个if语句就会全部结束；
    3、注意：以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以100%保证会有分支执行。
    4、所有的if语句都是可以嵌套的，只要合理嵌套就可以。
            if(){
                if(){
                    if(){

                    }
                }
            }
            else{
                if(){
                    if(){

                    }
                }
            }
            注意：嵌套使用的时候，代码格式要保证完美。【该缩进的时候就要缩进】
    5、if语句的分支中只有一条java语句的时候，大括号可以省略不写。
            if(true){
                一条java语句;
            }

            if(true) 一条java语句;
        注意：这种方式不推荐使用，但是别人这么写能看懂就行；
*/


public class IfTest01
{
    public static void main(String[] args){
        int x = 10;

        x = 90;
        if (x < 20) {
            System.out.println("这个数字是小于20的：" + x);
        } else if (x >= 20 && x <= 50) {
            System.out.println("这个数字是在30~50之间的：" + x);
        }
        // else if (x == 90)
        // {
        // System.out.println("这个数字一定是90：" + x);
        // }
        else if (x > 50 && x < 100) {
            System.out.println("这个数字实在50到100之间的：" + x);
        } else {
            System.out.println("这个数字不知道是多大" + x);
        }

        // 声明一个天气的变量；
        String Weather;
        Weather = "rain";

        // 如果天气下雨了，那么就要带伞
        if (true) {
            System.out.println("今天下雨了，需要带伞");
        }

        // 五公里有麦当劳的话，我去麦当劳吃午饭
        int distance;

        distance = 5;

        if (distance < 5 || distance == 5) {

            System.out.println("距离不到5公里，我去麦当劳吃午饭。");

        }

        // 需求：假设系统给定一个学生的成绩，成绩可能带有小数点；成绩范围是 0~100分
        // 根据学生的成绩判断该学生的等级；
        // [90-100] A
        // [80-90) B
        // [70-80) C
        // [60-70) D
        // [0-60) E

        double score;

        score = 45.0;
        // if (score < 0 || score > 100) {
        //     System.out.println("对不起，该学生的成绩不合法！");
        // } else if (score >= 90) {
        //     System.out.println("该学生的评级为A，分数为：" + score);
        // } else if (score >= 80) {
        //     System.out.println("该学生的评级为B，分数为：" + score);
        // } else if (score >= 70) {
        //     System.out.println("该学生的评级为C，分数为：" + score);
        // } else if (score >= 60) {
        //     System.out.println("该学生的评级为D，分数为：" + score);
        // } else {
        //     System.out.println("该学生的评级为E，分数为：" + score);
        // }
        String grade = "该考生的评级为E";

        System.out.println("test:" + grade);

        if (score < 0 || score > 100) {
            System.out.println("对不起，该学生的成绩不合法！");
        } 
        else if (score >= 90) {
            grade = "该考生的评级为A";
        } 

        else if (score >= 80) {
            grade = "该考生的评级为B";
        } 
        else if (score >= 70) {
            grade = "该考生的评级为C";
        } 
        else if (score >= 60) {
            grade = "该考生的评级为D";
        } 
        System.out.println(grade);

        //查询相对于狗，人类的年龄：我家的狗5岁了， 5岁的狗相当于人类多大呢？
        // 其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。
        // 那么5岁的狗相当于人类多少年龄呢？（应该是： 10.5 + 10.5 + 4 + 4 + 4 = 33岁。）
        // 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
        // 如果用户输入负数，请显示一个提示信息。

        //声明一个狗的年龄的变量；
        double dogAge ;
        //给变量赋值为1；
        dogAge = 0;

        if(dogAge <= 0){
            System.out.println("狗狗的年龄输入不合法！");
        }
        else if (dogAge > 0 && dogAge <= 2){
            System.out.println("人类的年龄为" + dogAge * 10.5 + "岁");
        }
        else if (dogAge > 2){
            System.out.println("人类的年龄为" + (((dogAge-2) * 4) + 10.5 * 2) + "岁" );
        }

    }
}