
/* 
    三元运算符/三目运算符/条件运算符

        1、语法规则：
            布尔表达式?表达式1 ： 表达式2；
        
        2、三元运算符的执行原理？
            当布尔表达式的结果是true的时候，将表达式1作为整个表达式的执行结果；
            当布尔表达式的结果是false的时候，将表达式2作为整个表达式的执行结果；
*/

public class OperatorTest06 {

    public static void main(String[] args) {

        // 编译错误，不是一个完整的java语句；
        // 10;

        // 编译错误，不是一个完整的java语句；
        // "男";

        // 布尔类型的变量；
        boolean sex = false;

        sex = true;
        System.out.println(sex ? "男" : "女");

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

        score = 66.0;
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
            // System.out.println("test:" + grade);
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



        

    }

}