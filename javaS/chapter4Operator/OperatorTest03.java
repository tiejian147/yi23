/*
	逻辑运算符
		&		逻辑与 【并且】 （两边的算子都是true，结果才是true）
		|		逻辑或 【或者】 （两边的算子只要有一个是true，结果就是true）
		!		逻辑非 （取反，!false 就是true；!true 就是false）
		^		逻辑亦或 （两边的算子只要不一样，结果就是true）

		&&		短路与  
		||		短路或

	1、逻辑运算符要求两遍的算子都是布尔类型，并且逻辑运算符最终的运算结果也是布尔类型。
	2、短路与和逻辑与最终的运算结果是相同的，只不过短路与存在短路现象；
	3、短路或和逻辑或最终的运算结果是相同的，只不过短路或存在短路现象；
	4、什么时候发生短路现象？什么时候选择使用短路与、短路或运算符？

		
*/

public class OperatorTest03{
	public static void main(String[] args){
		
		System.out.println("test");

		System.out.println("这里进行数值的比较：");
		System.out.println(5 > 3 & 5 > 4); //true
		System.out.println(5 > 4 & 5 > 9); // false
		System.out.println(5 > 4 | 5 > 9); // true

		

		// //声明两个变量，然后用逻辑与打印比较结果
		// int x = 10;
		// int y = 8;
		// System.out.println("这里x和y做对比：");
		// System.out.println(x < y & ++x < y);
		// System.out.println("这里使用逻辑与的时候，x的结果：" + x);
		

		//声明两个变量，然后用短路与打印比较结果
		int x = 10;
		int y = 8;
		//短路与：
		//x < y 结果是false，整个表达式结果已经确定是false；所以后面的表达式没有再执行，这种现象被称为短路现象；
		//短路与才会有短路现象，逻辑与是不会出现短路现象的。
		System.out.println("这里x和y做对比：");
		System.out.println(x < y && ++x < y);
		System.out.println("这里使用短路与的时候，x的结果：" + x);

		// 从某个角度来看，短路与更智能，由于后面的表达式可能不执行，所以执行效率更高。
		//这种方式在实际开发中使用较多。短路与比逻辑与使用的更多。短路与更常用。

		//但是，在某些特殊的业务逻辑当中，要求运算符两边的算子必须全部执行，此事必须使用逻辑与，不能使用短路与，
		//使用短路与可能导致右边的表达式不执行。

		// System.out.println(x > y || ++x < y);
		// System.out.println("这里的x应该短路：" + x);

		System.out.println(x < y || ++x > y);
		System.out.println("这里的x应该短路：" + x);

		



	}
}