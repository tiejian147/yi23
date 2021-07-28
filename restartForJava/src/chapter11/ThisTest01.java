package chapter11;

/*
this的使用
 */

public class ThisTest01 {
    public static void main(String[] args) {
//        new对象
        Customer c1 = new Customer("张三");
        Customer c2 = new Customer("李四");
        c1.shopping();
        c2.shopping();
    }
}

class Customer{
//    实例变量
    String name;
//    无参数构造方法
    public Customer(){

    }
//    有参数的构造方法
    public Customer(String s){
        name = s;
    }

//    顾客购物的方法
    public void shopping(){
        System.out.println(name + "正在购物");//name前面其实是有this. 隐藏的
    }
}
