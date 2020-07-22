/*
	运算符
	关于java编程中运算符之：算术运算符
		+	求和
		-	相减
		*	乘积
		/	商
		%	求余数【取模】
		
		++	自加1
		--	自减1
		
	注意：一个表达式当中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。
			没有必要去专门记忆运算符的优先级。
*/
public class OperatorTest01{
	public static void main(String[] args){
		System.out.println("ceshi");
		
		int i = 10;
		int j = 3;
		
		System.out.println(i + j); // 13;
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3
		System.out.println(i % j); //1
		
		//声明一个变量k ，并且赋值自加1；
		int k =10;
		
		//++ 运算符可以出现在变量后面【单目运算符】
		k ++;
		
		//打印变量k
		System.out.println("++在后面的运算结果：" + k); //11
		
		//举例++出现在变量前并打印变量y
		int y = 10;
		++ y ;
		System.out.println("++在前面的运算结果：" + y);
		
		//小结：
		//		++运算符可以出现在变量前，也可以出险在变量后，无论是变量前还是变量后，只要++运算结束，
		//		该变量的值一定会自加1。
		
		//++ 出现在变量后
		// 规则：先做赋值运算，再对变量中保存的值自加1；
		int a = 100;
		int b = a ++;
		System.out.println("当++出现在变量后--");
		System.out.println("这里的变量a的值是：" + a); //101 
		System.out.println("这里的变量b的值是：" + b); //100
		
		//++ 出现在变量前
		//规则：先进行自加1运算，然后再进行赋值操作；
		int c = 100;
		int d = ++ c ;
		
		System.out.println("当++出现在变量前--");
		System.out.println("这里的变量c的值是：" + c); // 101
		System.out.println("这里的变量d的值是：" + d); // 101
		
		int xx =500;
		System.out.println(xx);
		
		int e = 100;
		System.out.println(e ++); // 100
		System.out.println(e); // 101
		
		int s = 100;
		System.out.println(++ s); //101
		System.out.println(s);    //101
		
		System.out.println("-------------------------------");
		
		
		
		System.out.println("第一个：" + -- s); //100 ;
		System.out.println("第二个：" + s ++); // 100
		System.out.println("第三个：" + s --); // 
		System.out.println("第四个：" + s --); //
		System.out.println("第五个：" + s --); //
		System.out.println("第六个：" + s);
		
	}
}