/*
	关于java语言中的“+” 运算符；
		1、+ 运算符在java语言当中有两个作用：
			*加法运算，求和；
			*字符串连接运算；
		
		2、当“+” 运算符两边的数据都是数字的话，一定是加法运算；

		3、当“+”运算符两边的数据只要有一个数据是字符串的话，一定会进行字符串连接运算。
			并且，连接运算之后的结果还是一个字符串类型。
		
			数字 + 数字 ---> 数字【求和】

			数字 + "数字" ----> "字符串" 【字符串连接】
		
		4、在一个表达式当中，可以出现多个 + 号，在没有出现小括号的前提下，遵循自左向右的顺序依次运算；



	
*/

public class OperatorTest05
{
	public static void main(String[] args){

		int a = 100;
		int b = 20;

		//要求在控制台中打印出：10 + 20 = 30；且是动态变量的；
		System.out.println(a + "+" + b + "=" + (a + b));

		String userName = "zhangsan";

		userName = "jack";
		System.out.println("恭喜你，欢迎" + userName + "回来");

	}
}