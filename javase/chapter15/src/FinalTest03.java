/*
    final修饰的实例变量？
        还是那个重点：final修饰的变量只能赋值一次。

        结论：
            final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。

        终极结论：
            final修饰的实例变量，系统不负责赋默认值，要求程序员必须手动赋值。
            这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。
 */

public class FinalTest03 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.height);
    }
}

class User{
    //实例变量 这里会报错：变量 age 未在默认构造器中初始化
    //所以这里必须要手动赋值
//    final int age ;
//      int age;

    //手动赋值之后就编译通过了。
      final double height ;

    //这个时候是第一次赋值，所以编译会通过
    //只要我再系统赋默认值之前赋值就行。
    public User() {
        this.height = 80;
//        this.height = 81;//这里就报错了，因为不能再次赋值。
    }
}
