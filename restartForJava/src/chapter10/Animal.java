package chapter10;
/*
个人练习方法的封装
 */
public class Animal {
//    声明一个变量
    private int age;
//    编写无参数构造方法
    public int getAge(){
        return age;
    }
//    编写有参数的构造方法
    public void setAge(int nianLing){
        if (nianLing < 0 || nianLing > 100){
            System.out.println("年龄不合法");
            return;
        }
        age = nianLing;

    }
}
