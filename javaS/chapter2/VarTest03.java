/*
	关于java中的变量：
		变量中的作用域

		1、什么是作用域？
			变量的作用域，其实描述的就是变量的有效范围；
			在什么范围之内是可以访问的，只要出了这个范围就不能访问了。

		2、变量的作用域就只用一句话概括：
			出了大括号就不认识了。
*/

public class VarTest03{

	// 注意：这里的static不能去掉
	static int k =19;

	public static void main(String[] args){

		//声明一个变量i
		int i ;

		//给变量赋值
		i = 18;

		//打印变量i的赋值
		System.out.println(i); //这里打印是可以的

		System.out.println(k); //这里打印是可以的

		//以下会编写一个for循环语句
		//这个for循环后面的控制语句的时候详细讲解；
		for(int a =10;a<10;a++){ //a变量的作用域是整个for循环，for循环结束之后，a变量的内存就释放了

		}
		//这里无法访问a变量 
		//System.out.println(a); //这里打印是不可以的；

		//这里再写一个for循环语句，这次的变量j写在for循环的外面，此事j的作用域是main方法
		int j;
		for(j=0;j<10;j++){

		}
		System.out.println(j);//这里编译是不会出错的；

	}


	public static void doSome(){

		System.out.println(k);
	}

}