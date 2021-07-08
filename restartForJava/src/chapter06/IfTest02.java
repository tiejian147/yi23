package restartForJava.src.chapter06;

import java.sql.SQLOutput;

public class IfTest02 {
//    测试提交代码
    public static void main(String[] args) {
        String s1 = "sdfsd";
        System.out.println(s1);
//        自己练习一下if语句
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入今天的天气如何--0表示晴天、1表示雨天：");
//        定义变量天气
        int weather = s.nextInt();

        System.out.println("请输入您是--1表示男士、0表示女士：");
        int sex = s.nextInt();

//        if (weather != 0 || weather != 1){
//            System.out.println("天气值不合法");
//        }else if (weather == 0){
//            if (sex == 1){
//                System.out.println("直接走起，出去玩耍！");
//            }
//            if (sex == 0){
//                System.out.println("擦点防晒霜，出去玩耍~");
//            }
//        }else if (weather == 1){
//
//        }


        if (weather == 0){
            if (sex == 1){
                System.out.println("直接走起，出去玩耍！");
            }
            if (sex == 0){
                System.out.println("擦点防晒霜，出去玩耍~");
            }
        }else if (weather == 1){
            if (sex ==1){
                System.out.println("撑一把大黑伞");
            }else if (sex == 0){
                System.out.println("撑一把小花伞");
            }
        }else {
            System.out.println("您输入的天气不合法");
            return;
        }



    }
}
