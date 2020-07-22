/*
	关于java语言当中的标识符
		1、什么是标识符？
			-在java源程序中凡是程序员自己有权利命名的单词都是标识符。
			-标识符在sublime编辑器中以绿色高亮展示；
			-标识符可以标识什么元素呢？
				*类名
				*方法名
				*变量名
				*接口名
				*常量名
				......
		2、标识符的命名规则？【不按照这个规则来，编译器就会报错，这是语法】
			*一个合法的标识符只能由数字、字母、下划线_、美元符号$组成，不能含有其他符号；
			*不能数字开头；
			*严格区分大小写；
			*关键字不能做标识符；例如public、class、main等其他语法单词
			......

		3、标识符的命名规范？【只是一种规范，不属于语法，不遵守规范编译器不会报错】
			*最好见名知意，举例：类名，方法名不能随便取，最好是什么服务，什么功能就取什么样的名字；
				public UserService{
					public void login(String username,String password){
		
					}
				}
			*遵守驼峰命名方式
				SystemService
				UserService
				CustermorService
			*类名，接口名：首字母大写，后面每个单词首字母大写。
			*变量名，方法名：首字母小写，后面每个单词首字母大写。
			*常量名：全部大写

		4、常见的关键字有哪些？
			public public   public  public  public  public
			class
			static
			void
			int
			char
			if
			else
			while
			do
			default
			byte
			short
			long
			float
			double
			boolean
			private
			protected
			swich
			break
			public
			public
			public
			public
		5、字面值：
		*字面值就是数据。
		*字面值是java源程序中的重要组成部分之一。包括标识符和关键字它们都是java源程序中的组成部分。
		*数据在现实世界中是分门别类的，所以数据在计算机编程语言中也是有类型的：【数据类型】
			-10、100 			是属于整数型字面值
			-3.14 				是属于浮点型字面值
			-true、false 		是属于布尔型字面值
			-"abc"、"中国人" 		是属于字符串型字面值
			-'A'、'人' 			是属于字符型字面值、
		注意：
			java语言当中所有的字符串数据类型都要用双引号括起来，双引号是半角；
			java语言中所有的字符型数据类型都要用单引号括起来，单引号是半角；
*/



public class ElementOfGrammar{  // ElementOfGrammar 就是一个类名，名字可以修改。

	// main是一个方法名
	public static void main(String[] args){

		System.out.println("知识点都在注释里，要打开文件去看哦~~");

		System.out.println("这个文件主要讲解的是java语法基础：包括标识符，标识符的命名规则，标识符的命名规范；关键字等等。");

		System.out.println("这些东西都需要去记住，死记硬背的记住先。");

		System.out.println("老婆做的小吊梨汤好好喝呀~~~");
	}
}