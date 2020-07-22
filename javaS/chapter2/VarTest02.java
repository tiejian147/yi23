/*
	关于java中的变量：
	1、在方法体中的java代码，是遵守自上而下的顺序依次执行的。逐行执行。
		第一行；
		第二行；
		第三行；
		特点：第二行的代码必须完整的执行结束后，第三行的代码才能执行。
	2、在同一个“作用域”当中，变量名不能重名，但是变量名可以重新赋值；
*/

public class VarTest02{
	public static void main(String[] args){

		//声明一个变量i
		int i ;

		//给变量i赋值；
		i = 156;

		//打印变量i
		System.out.println(i);

		//以下代码为错误示例：顺序编写错误，应该先声明，然后赋值，再访问；
		/*
		System.out.println(k);

		int k;

		k =177;
		*/

		int i =188;

		System.out.println(i);
	}
}