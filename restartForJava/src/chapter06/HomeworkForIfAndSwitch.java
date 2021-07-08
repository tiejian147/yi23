package restartForJava.src.chapter06;

public class HomeworkForIfAndSwitch {
    public static void main(String[] args) {
        //    判断一个数字的正负
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入任意整数：");
        int num1 = s.nextInt();
        if (num1 > 0){
            System.out.println("您输入的数字为正数。");
        }else if(num1 < 0){
            System.out.println("您输入的数字为负数。");
        }else {
            System.out.println("数字为0或者不合法");
        }
        System.out.println("---------------------");
//        判断数字的奇偶
        System.out.println("请再次输入任意整数：");
        int num2 = s.nextInt();
        if (num2 % 2 > 0){
            System.out.println("您输入的数字为奇数");
        }else {
            System.out.println("您输入的数字为偶数");
        }

//        计算打车费
        System.out.println("--------------");
        System.out.println("请输入里程数，单位为KM：");
        int num3 = s.nextInt();
        if (num3 <= 3){
            System.out.println("车费为：8元");
        }if (num3 <= 5){
            double price = (num3 - 3) * 1.2 + 8;
            System.out.println("车费为：" + price + "元");
        }if (num3 > 5){
            double price2 = (num3 - 3) * 1.5 + 8;
            System.out.println("车费为：" + price2 + "元");
        }



    }
}
