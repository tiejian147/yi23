/*
*
* final
*   1、final是java语言中的一个关键字；
*
*   2、final表示最终的，不可变的；
*
*   3、final可以修饰变量以及方法，还有类等；
*
*   4、final修饰的变量？
*       final修饰的局部变量，一旦赋值不能重新赋值。
*
*
*   5、final修饰的方法？
*       final修饰的方法无法被覆盖，被重写。
*
*   6、final修饰的类？
*       final修饰的类无法继承。
*
*
*       重点：final修饰的变量，只能赋一次值。
*
* */

public class FinalTest01 {
    public static void main(String[] args) {
        //局部变量
        int i = 100;
        //重新赋值
        i = 200;

        //局部变量
        final int k = 50;
        //重新赋值
//        k = 100;//Error:(30, 9) java: 无法为最终变量k分配值

        final int m;
        //第一次赋值
        m = 90;//这里不报错，可以第一次赋值
        //再次赋值
//        m = 100;//这里会报错：Error:(36, 9) java: 可能已分配变量m

    }
}

/*
B类继承A类，相当于对A类的功能进行扩展，如果你不希望别人对A类进行扩展。
就可以给A类加final关键字，这样的话A类就无法继承了。
下面代码编译会报错：29行报错：无法从最终A进行继承。
 */

/*
final class A{

}

class B extends A{

}

 */

/*
class C{
    public final void doSome(){
        System.out.println("C's doSome...");
    }
}

class D extends C{
    public void doSome(){
        System.out.println("D's doSome...");
    }
}

 */


