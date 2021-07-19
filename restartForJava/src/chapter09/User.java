package chapter09;

public class User {
//    声明变量 姓名
    String name ;
//    声明变量 年龄
    int age;
//    声明变量 id
    int uid;

//    编写构造方法--无参数
    public User(){
//        其实默认有三行代码，表示初始值的
        name = null;
        age = 0;
        uid = 0;
//        重新赋值
        name = "张三";
        age = 18;
        uid = 001;
    }

//    编写有参数的构造方法
    public User(int i){

    }

}
