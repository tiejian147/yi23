package chapter09;

public class ConstructorTest02 {
    public static void main(String[] args) {
//        调用无参数构造方法
        User u1 =  new User();
        System.out.println(u1.age);
        System.out.println(u1.name);
        System.out.println(u1.uid);

        System.out.println("---------------");

//     调用有参数的构造方法
        User u2 = new User(100);
        System.out.println(u2.age);
        System.out.println(u2.name);
        System.out.println(u2.uid);

    }
}
