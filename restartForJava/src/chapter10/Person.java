package chapter10;
/*
方法的封装
 */

public class Person {
//    不进行封装
//    int age ;
    private int age;

//    get 构造方法
    public int getAge(){
        return age;
    }

//    set 构造方法
    public void setAge(int nianLing){
        if (nianLing < 0 || nianLing > 100){
            System.out.println("抱歉，年龄不合法");
            return;
        }
        age = nianLing;
    }
}
