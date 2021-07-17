package chapter08;
/*
只要记住一句话：
    里面有什么，就"."什么   就可以了
 */
public class UserTest01 {
    public static void main(String[] args) {
//        new 一个新用户
        User u1 = new User();
//        new 一个地址
        Address addr = new Address();
        addr.city = "北京市";

        u1.address = addr;


        System.out.println(u1.address.city);

    }
}
