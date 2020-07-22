/**
 * 从第一天开始讲HelloWorld到目前为止，一个类当中一共就写过这些东西
 *      类{
 *          //实例相关的都是需要new对象的，通过“引用.”访问
 *          实例变量;
 *          实例方法;
 *          
 *          //静态相关的都是采用“类名.”访问，也可以使用“引用.”访问，只不过不建议
 *          静态变量;
 *          静态方法;
 *      
 * 
 *      }
 */



public class StaticTest04{
    public static void main(String[] args){
        //这是比较正规的方式，静态方法采用”类名.”
        StaticTest04.doSome();
        System.out.println("--------------------------");

        //对象
        StaticTest04 st = new StaticTest04();
        //用“引用.”访问
        st.doSome();
        System.out.println("--------------------------");

        //空引用
        st = null;
        //不会出现空指针异常
        st.doSome();//这行代码在最终执行的时候会转变为：StaticTest04.doSome();
        System.out.println("--------------------------");

        //实例方法：doOther();
        //对象级别的方法（先new对象，通过“引用.”来访问）
        // StaticTest04.doOther();这里会报错：无法从静态上下文中引用非静态方法
        //要这样写：
        StaticTest04 st2 = new StaticTest04();
        st2.doOther();
    }

    //静态方法（静态方法不需要new对象，直接使用“类名.”来访问）
    //但是也可以使用“引用.“来访问，不建议用（因为其他程序员会感到困惑） 
    public static void doSome(){
        System.out.println("静态方法doSome()执行了");
    }

    //实例方法（实例相关的都需要new对象，使用”引用.“来访问）
    public void doOther(){
        System.out.println("实例方法doOther()执行了");
    }
}