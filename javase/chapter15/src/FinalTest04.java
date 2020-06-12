/*
    FinalTest03中的结论：
        final修饰的实例变量，必须手动赋值。
        final修饰的变量，只能赋一次值。

        结论：
            final修饰的实例变量一般添加static修饰。

        终极结论：
            static final 联合修饰的变量称为"常量"
            常量名建议全部大写，每个单词之间采用下划线衔接。

        常量：实际上常量和静态变量一样，区别在于：
            常量的值不能变。

        常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。

        常量一般都是公共的：public 的
 */

public class FinalTest04 {
    public static void main(String[] args) {

        //常量不用new对象，直接"类名."的方式调用就可以了
        System.out.println(Chinese.COUNTRY);

        System.out.println(MyMath.PI);
    }
}

class Chinese{
    //姓名，对象不同姓名不一样
    String name;

    //身份证号，每个人都不一样，对象级别的
    String idCard;

    //国家的值是一个固定值：中国
    //实例变量在堆中，一个对象一份，100个对象100份。
    //实例变量既然使用final修饰了，说明该实例变量不会随着对象的变化而变化。
    //所以该实例变量前面应添加：static 关键字，变为静态的，存储在方法区。
//    static final String country = "中国";

    //正确的编写格式为：
    static final String COUNTRY = "中国";

    //i永远是10，创建100个对象，i也是10
    //i是10是永远不会发生改变的，既然这样，没必要声明为实例变量，最好是静态的，节省内存。
    final int i = 10;
}

class MyMath{
    //数学中的π 是永远不会变的，可以写成公开的：public
    public static final double PI = 3.141592653;
}
