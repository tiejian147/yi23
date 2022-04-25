package chapter25;

import chapter25.bean.Student;

import java.lang.reflect.Field;

/*
必须掌握：
    怎么通过反射机制访问java对象的属性？
        给属性赋值set
        获取属性的值get

 */
public class ReflectTest07 {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchFieldException {
        //我们不使用反射机制，怎么去访问一个对象的属性呢？
        Student s = new Student();

        s.no = 111;

        //使用反射机制，怎么去访问一个对象的属性？
        Class studentClass = Class.forName("chapter25.bean.Student");
        Object obj = studentClass.newInstance();//obj就是Student对象（底层调用无参构造方法）

        //获取no属性
        Field noField = studentClass.getDeclaredField("no");

        noField.set(obj,222);

        //获取属性的值
        System.out.println(noField.get(obj));

        //可以获取私有属性的值吗？
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装(反射机制的缺点：打破封装可能会给不法分子留下机会！)
        nameField.setAccessible(true);
        //赋值
        nameField.set(obj,"jack");
        //获取
        System.out.println(nameField.get(obj));

    }
}
