/*
    1、方法怎么定义，语法机制是什么？
        [修饰符列表] 返回值类型 方法名(形式参数列表){
            方法体;
            return 值;

        }
        注意：[]符号叫做中括号，以上中括号[]里面的内容表示不是必须的，是可选的，
             方法体由java语句构成。
             方法定义之后要去调用，不调用是不会执行的。

        1.1、关于修饰符列表：
            修饰符列表不是必选项，是可选的。目前为止，大家同意写成：public static
            后面就会自然明白应该怎么写了。
        1.2、关于返回值类型：
            第一：返回值类型可以是任何类型，只要是java中合法的数据类型就行，
                数据类型包括：基本数据类型和引用数据类型，也就是说返回值类型可以是：
                byte、short、int、long、float、double、boolean、char、String...

            第二：什么是返回值？
                返回值一般指的是一个方法执行结束之后的结果。
                结果通常是一个数据，所以被称为”值“，而且还叫”返回值“。
                方法就是为了完成某个特定的功能，方法结束之后，大部分情况下都是有一个结果的，
                而体现结果的一般都是数据。数据得有类型，这就是返回值类型。

                main(){
                    //调用a方法
                    a(); //如果a方法执行结束之后有返回值，那么这个返回值给main了。
                }
                a(){
                    //方法执行结束之后的返回值实际上是给调用者了，谁调用就返回给谁。
                }

            第三：当一个方法执行结束不返回任何值的时候，返回值类型也不能空白，必须写上void关键字。
                所以void表示该方法执行结束后不返回任何结果。

            第四：如果返回值类型不是void，那么你在方法体执行结束的时候必须使用”return 值;”这样的
                语句来完成“值”的返回，如果没有“return 值;” 这样的语句，那么编译器会报错；
                    return 值; 这样的语句作用是什么？ 作用就是“返回值”，返回方法的执行结果。
            
            第五：只要有“return”关键字的语句执行，当前方法必然结束。
                return只要执行，当前所在的方法结束，记住：不是整个程序结束。
            
            第六：如果返回值类型是void，那么在方法体当中不能有“return 值;”这样的语句。
                但是可以有“return;”语句。这个语句“return;” 的作用就是用来终止当前方法。
            
            第七：除了void之外，剩下的都必须有“return 值;” 这样的语句。
        
        1.3、方法名
                方法名要见名知意。（驼峰命名方式）
                方法名在标识符命名规范当中，要求首字母小写，后面每个单词首字母大写。
                只要是合法的标识符就行。
        1.4、形式参数列表
            简称：形参
            注意：形式参数列表中的每一个参数都是“局部变量”，方法结束之后内存释放。
            形参的个数是：0~N个。
            public class void sumInt(){}
            public class void sumInt(int x){}
            public class void sumInt(int x, int y){}
            public class void sumInt(int a, int b, int c,String y,double e){}
            形参有多个的话使用英文的逗号隔开“,”。
            形参的数据类型起决定性作用，形参对应的变量名是随意的。
        1.5、方法体：
            由java语句构成，java语句以“;”结尾。
            方法体当中编写的是业务逻辑代码，完成某个特定功能。
            在方法体中的代码遵循自上而下的顺序依次逐行执行。
            在方法体中处理业务逻辑代码的时候需要数据，数据来源就是这些形参。
    2、方法定义之后怎么调用？
        方法必须调用才能执行。
        怎么调用，语法？
            类名.方法名(实际参数列表);

        实参和形参的类型必须一一对应，另外个数也要一一对应。

            



*/

public class MethodTest03{

    //方法定义在这里是可以的。
    //main方法结束之后不需要给JVM返回任何结果
    public static void main(String[] args){
        //调用方法
        //错误：不兼容的类型：String无法转换为int
        //MethodTest03.devide("abc",3);

        //错误原因：实际参数列表和形式参数列表长度不同
        //MethodTest03.devide();

        //调用求商的方法
        MethodTest03.devide(10,2);

        //调用求和的方法sum();
        //怎么去接受这个方法的返回结果？？？
        //使用变量来接受这个方法的返回值
        //注意：变量的定义需要指定变量的数据类型。
        //变量的数据类型是？？
        
        int result  = MethodTest03.sum(10, 20);//定义一个变量接收结果
        System.out.println("求和的结果是：" + result);

        double result02  = MethodTest03.sum(100, 220);//定义一个变量接收结果
        System.out.println("求和的结果是：" + result02);

        //没有返回值的方法，变量能接收吗；？
        //这里也会编译报错：不兼容的类型：void无法转换为int
        //devide方法结束没有返回值，不能接收。
        //int i = MethodTest03.devide(55,5);

        //当一个方法有返回值的时候，是否可以选择不接收？
        //答案：可以的，编译通过
        //只不过这样没有意义，一般程序返回了执行结果，都是需要接收这个结果的。
        //我们可以不接收，但是这个返回值该返回还是会返回的，只不过不用变量接收，
        //以下代码虽然没有使用变量接收这个返回值，但是这个值还是返回了。
        //返回之后内存马上释放，因为没有使用变量接收。
        MethodTest03.sum(100, 220);



    }

    //方法定义到这里也是可以的，没有顺序要求；
    //业务是什么？计算两个int类型的数据的商；
    //方法执行结束之后返回执行结果；
    /* 错误：缺少返回语句
    public static int devide(int x , int y){
        int z = x / y;
    }
    */

    /* 错误：不兼容的类型：String无法转换为int
    public static int devide(int x , int y){
        int z = x / y;
        return "abc";
    }
    */

    
    // public static int devide(int x , int y){
    //     int z = x / y;
    //     return z;//这样就编译通过了。
    //     //return x / y; //这样也是可以的
    // }

    //编写一个求商的方法
    public static void devide(int x , int y){
        System.out.println(x / y);//5
    }

    //编写一个求和的方法
    public static int sum(int a , int b){
        return a+b;
        //System.out.println(a + "+" + b + "=" + (a+b) );
    }
    
    

}