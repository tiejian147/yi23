/*
	关于java语言中的赋值运算符
		赋值类运算符包括两种：
			*基本的赋值运算符
				=			

			*扩展的赋值类运算符
				+=
				-=
				*=
				/=
				%=

		1、赋值类运算符的优先级：先执行等号右边的表达式，将执行结果赋值给等号左边的变量。
		2、注意以下代码：
			byte a = 10;
			a += 5;	等同于： a = (byte)(a + 5);

			int b = 10;
			b -= 3;	等同于： b = (int)(b - 3);

			long c = 10;
			c *= 2;	等同于：c = (long)(c * 2);

			long x = 10L；
			int y = 20;
			y += x; 等同于：y = (int)(y + x);
		
		3、重要结论：扩展类的赋值运算符不改变运行结果类型，假设最初这个变量的类型是byte类型，那么
			不论怎么追加或者追减，最终该变量的数据类型还是byte类型。 


*/

public class OperatorTest04
{
	public static void main(String[] args){

		System.out.println("test");

		int a = 10;
		a = a + 4;
		System.out.println(a);//14;

		
		a += 5; //等同于 a = a + 5 ;
		System.out.println(a);// 19;

		a -= 3;//等同于 a = a - 3;
		System.out.println(a);//16

		a *= 5; //等同于 a = a * 5;
		System.out.println(a);// 80

		a /= 2;//等同于 a = a / 2;
		System.out.println(a);// 40

		a %= 10;// 等同于a = a % 10;
		System.out.println(a);//没有余数就是0

		byte b = 5;
		//b = b + 5;//这里会编译报错，因为等号右边是默认int类型，而b的类型是byte，大容量转小容量必须要
		//加强制转换符号；
		//纠正错误
		b = (byte)(b + 5);

		System.out.println(b);//10


		byte x = 18;
		x += 5;//等同于 x = (byte)(x + 5); 其实不等同于：x = x + 5;
		System.out.println(x);//23

		byte z = 0;
		z += 128;//等同于 z = (byte)(z + 128);
		System.out.println(z);//-128【损失精度】

		//这里是字符串连接运算符
		int m = 500;
		int n = 60;
		System.out.println(n + "+" + m + "=" + (n + m));
	}


}