package chapter24;
/*
研究一下Class.forName()发生了什么
    重点：如果你只是希望一个类的静态代码块执行，其他代码一律不执行
    你可以使用：
        Class.forName("完整类名");
        这个方法的执行会导致类加载，类加载时，静态代码块执行。
后面JDBC的时候，还需要讲。
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        //如果只想让一个类的静态代码块执行的话，这样写就行了
        try {
            Class.forName("chapter24.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass的静态代码块执行了。");
    }
}
