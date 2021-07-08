package restartForJava.src.chapter06;

public class SwitchTest01 {
    public static void main(String[] args) {
//        练习switch语句
       java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入整数数字1-7：");
        int date = s.nextInt();

        switch (date){
            case 6:
                System.out.println();
            case 7:
                System.out.println("星期日");
                break;
        }

    }
}
