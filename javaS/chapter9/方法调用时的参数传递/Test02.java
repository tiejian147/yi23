/*
    java中关于方法调用时参数传递实际上只有一个规则：
        不管是基本数据类型还是引用数据类型，实际上传递的时候都是将变量中的
        “值”复制一份，传递过去。

        int x =1;
        int y = x;
        把x中保存的1 复制一份给y
        x和y都是两个局部变量。

        Person p1 = ox1234;
        person p2 = p1;
        把p1中保存的0x1234复制一份给p2；  如果是引用数据类型，那么保存的是内存地址，并不是那个值。
        p1和p2都是两个局部变量。


*/
public class Test02 {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("main方法的p-->" + p.age);//输出11
    }   
    
    public static void add(Person p){
        p.age ++;
        System.out.println("add方法的p-->" + p.age);//输出11
    }

    
}

class Person{
    int age;
}