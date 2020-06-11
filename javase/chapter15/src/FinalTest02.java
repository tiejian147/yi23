/*
    final修饰的变量，如果这个变量是一个"引用"会怎样？
        重点：final修饰的变量只能赋一次值（万变不离其宗）
        "引用"是否是一个变量？   答案是肯定的。

    final修饰的引用：
        该引用只能指向一个对象，并且它只能永远指向该对象，
        无法再指向其他对象。
        并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。
        直到当前方法结束，才会释放空间。

        虽然final的引用指向对象A后，不能再重新指向对象B。
        但是对象A内部的数据可以被修改。
 */

public class FinalTest02 {
    public static void main(String[] args) {
        Person p = new Person(20);
        System.out.println("年龄为：" + p.age);

        //第一次赋值没有问题
        final Person p1 = new Person(60);

        //再次赋值就报错了：无法为最终变量p1分配值
//        p1 = new Person(55);



        System.out.println("年龄为：" + p1.age);
    }
}

class Person{
    //设置属性
    int age;

    //无参构造方法
    public Person() {
    }

    //有参构造方法

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
