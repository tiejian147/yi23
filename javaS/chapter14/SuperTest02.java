/**
 * 判断程序的输出结果：
 *          A的无参数构造执行
            B类的有参数构造执行（String）
            C的有参数构造执行（String，int）
            C的有参数构造执行（String）
            C的无参数构造执行

    在java语言中不管是new什么对象，最后老祖宗的Object类的无参数构造方法一定会执行。
    （Object类的无参数构造方法是处于栈顶部）
            栈顶的特点：
                最后调用，但是最先执行结束。
                后进先出原则。

    注意：
        以后写代码的时候，一个类的无参数构造方法还是建议要手动写出来；
        如果无参数构造方法丢失的话，可能会影响到子类对象的构建。
 */


public class SuperTest02{
    public static void main(String[] args){
        new C();
        // 打印结果：
        /**
         * A的无参数构造执行
            B类的有参数构造执行（String）
            C的有参数构造执行（String，int）
            C的有参数构造执行（String）
            C的无参数构造执行
         */
    }
}

//实际上父类都继承一个老祖宗类  Object
//但是Object类中的无参构造方法，就没有super() 和this() 方法了
/*
class Object{
    public Object(){

    }
}
*/
//父类A
class A extends Object{
    public A(){
        System.out.println("A的无参数构造执行");
    }
}

//子类B继承A
class B extends A{
    public B(){
        System.out.println("B的无参数构造执行");
    }

    public B(String name){
        //这里会默认有一个super()；调用父类的无参构造方法
        System.out.println("B类的有参数构造执行（String）");
    }
}
//子类C继承B
class C extends B{
    public C(){
        this("zhangsan");
        System.out.println("C的无参数构造执行");

    }

    public C(String name){
        this(name, 20);
        System.out.println("C的有参数构造执行（String）");
    }

    public C(String name ,int age){
        super(name);
        System.out.println("C的有参数构造执行（String，int）");
    }
}