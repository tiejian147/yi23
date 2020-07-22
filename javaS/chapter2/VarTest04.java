/*
	关于变量的分类：
		根据变量声明的位置来分类：
			*局部变量
				- 在方法体当中声明的变量叫局部变量
			*成员变量
				- 在方法体外【类体之内】声明的变量叫做成员变量；

	在不同的作用域当中，变量名是可以重名的；
	在同一个作用域当中，变量名是不能重名的；
*/

public class VarTest04{

	//这里也属于成员变量；
	int k=200;
	public static void main(String[] args){

		//i 就是局部变量
		int i =10;

		//java 遵循就近原则；
		System.out.println(i);

	}

	public static void doSome(){

		//这里也是局部变量
		int j = 1999;
	}

	// 这里就是成员变量；
	int i =100;

	//类体中不能直接编写java语句【除声明变量之外】
	//System.out.println(i);  // 这一行会编译报错
}