/*
    空指针异常：NullPoingerException

    关于垃圾回收期：GC
        在java语言中，垃圾回收期主要针对的是内存。
        当一个java对象没有任何引用指向该对象的时候，
        GC会考虑将该垃圾数据释放回收掉。

    出现空指针异常的前提条件是？
        “空引用”访问实例相关【对象相关】的数据时，都会出现空指针异常。
*/




public class NullPointerTest{
    public static void main(String[] args){
        //创建客户对象
        Customer c = new Customer();
        //引用
        System.out.println("用户的初始化ID为：" + c.id);

        //重新赋值uid
        c.id = 9521;
        System.out.println("用户重新赋值之后的id为：" + c.id);

        c = null;
        //NullPointerException
        //编译器没问题，因为编译器只检查预发，编译器发现c是Customer类型
        //Customer类型中有id属性，所以可以：c.id  语法过了
        //但是运行的时候需要对象的存在，但是对象没了，就只能出现一个异常。 
        System.out.println("用户重新赋值之后的id为：" + c.id);
        
    }
}

class Customer{
    //客户id
    int id ;//成员变量中的实例变量，应该先创建对象，然后通过“引用”的方式来访问。
}   