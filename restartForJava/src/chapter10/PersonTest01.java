package chapter10;

public class PersonTest01 {
    public static void main(String[] args) {
//        赋值输出
//        Person p1 = new Person();
//        System.out.println(p1.age);// 0
//
//        p1.age = 10;
//        System.out.println(p1.age);//10
////       再次赋值
//        p1.age = -100;
//        System.out.println(p1.age);

        Person p1 = new Person();
        System.out.println(p1.getAge());

//        设置年龄
        p1.setAge(1);
        System.out.println(p1.getAge());

        p1.setAge(15);
        System.out.println(p1.getAge());


    }
}
