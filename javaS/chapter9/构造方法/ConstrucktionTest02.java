/*
    1、构造方法对应的英语单词：constructor
    2、构造方法作用：
        创建对象，并且创建对象的过程中给属性赋值（初始化）。
    3、
*/


public class ConstrucktionTest02 {
    public static void main(String[] args){
        User u = new User();

        System.out.println(u.num);
        System.out.println(u.name);
        System.out.println(u.age);

        User u2 = new User(1243);

        System.out.println(u2.num);
        System.out.println(u2.name);
        System.out.println(u2.age);
    }
}