package chapter09;
/*
构造方法：通过构造方法可以完成方法的创建；
        同时给对象的属性赋值；
        注意：当一个类中提供了一个构造方法，系统将不再提供默认的构造方法了；
 */
public class ConstructorTest01 {
    public static void main(String[] args) {
//        调用无参数的构造方法
        new Student();

//        new 一个student对象，并引用
        Student s1 = new Student();

        System.out.println(s1);
    }
}
