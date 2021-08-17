package chapter15;
/*
final修饰的变量：只能赋一次值；
修饰的类，子类无法继承；
修饰的方法，无法被覆盖，无法重写；
修饰的引用，只能赋一次值；
final修饰的实例变量，系统不负责赋值-默认值，要求程序员必须手动赋值，
这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。

final修饰的实例变量，一般配合static修饰
static final 修饰的变量为常量，常量名全部英文大写。
 */
public class FinalTest01 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
    }
}

class Chinese {
//    常量
    static final String COUNTRY = "中国";
}
