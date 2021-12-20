package chapter21.homework;

public class UserTest01 {
    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            us.register("zhangsan","1456");
        } catch (UserServiceException e) {
            System.out.println(e.getMessage());
        }
    }

}
