/**
 * 1、使用static关键字可以定义：静态代码块
 * 2、什么是静态代码块？语法？
 *      static {
 *          java语句；
 *          java语句
 *      }
 * 3、static静态代码块在什么时候执行？
 *      类加载时执行，并且只执行一次。
 *      静态代码块有这样的特征/特点。
 * 4、注意：静态代码块在类加载时执行，并且在main方法执行之前执行。
 * 5、静态代码块一般是按照自上而下的顺序执行。
 * 6、静态代码块有什么作用？
 *      第一：静态代码块不常用；（不是每一个类当中都要写的东西）
 *      第二：静态代码块这种语法机制实际上是SUN公司给java程序员的一个特殊的
 *           时刻/时机，这个时机叫做：类加载时机。
 *      
 *      具体的业务：
 *          项目经历说：所有编写的程序中，只要是类加载了，请记录一下类加载的
 *       日志信息。（年月日时分秒，哪个类加载到JVM中了）
 *      
 *       思考：这些日志记录写到哪里呢？
 *          写到静态代码块当中
 */


public class StaticTest06{
    //静态代码块（特殊的时机：类加载时机）
    static {
        System.out.println("A");
    }
    //一个类当中可以写多个静态代码块
    static {
        System.out.println("B");
    }
    //入口：
    public static void main(String[] args){
        System.out.println("Hello World !");
    }
    //静态代码块：
    static {
        System.out.println("C");
    }

}

/**
 * 以上代码打印结果：
 * A
 * B
 * C
 * Hello World !
 */