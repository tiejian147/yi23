/**
    实现计算器当中的：
        +
        -
        *
        /
        %
    实现思路：
        1、选择所有的数据从键盘输入
        2、使用switch语句进行判断
        3、需要从控制台输入三次：
            *第一个数字
            *运算符
            *第三个数字
        4、然后打印运算结果：
*/
public class SwitchTest03 {
    public static void main(String[] args){

        //先声明三个变量
        //第一个数字
        int num1 ;
        //第二个数字
        int num2 ;
        //运算符号
        String operator;

        //还要声明一个结果变量
        // int result = num1 + num2 ;
        
        //创建键盘输入
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("请输入第一个数字：");
        num1 = s.nextInt();

        System.out.print("请输入运算符：");
        operator = s.next();

        System.out.println("请输入第二个数字：");
        num2 = s.nextInt();

        switch(operator){

            case "+" :
                System.out.println("运算结果为：" + num1 + operator + num2 + "=" + (num1 + num2) );
                break;
            case "-" :
                System.out.println("运算结果为：" + num1 + operator + num2 + "=" + (num1 - num2) );
                break;
            case "*" :
                System.out.println("运算结果为：" + num1 + operator + num2 + "=" + (num1 * num2) );
                break;
            case "/" :
                System.out.println("运算结果为：" + num1 + operator + num2 + "=" + (num1 / num2) );
                break;
            case "%" :
                System.out.println("运算结果为：" + num1 + operator + num2 + "=" + (num1 % num2) );
                break;
            default :
                System.out.println("输入不合法");

        }

    }
}