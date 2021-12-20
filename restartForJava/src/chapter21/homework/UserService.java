package chapter21.homework;

public class UserService {
    /**
     * 用户注册的方法
     * @param username 用户名
     * @param password 密码
     * @throws UserServiceException 当用户名为空或者长度不符合条件时，抛出的异常
     */
    public void register(String username,String password) throws UserServiceException {
        // 一定要加判空的条件， null先写 可以避免 = 写不够的情况
        if (null == username || username.length() < 6 || username.length() > 14){
            throw new UserServiceException("用户名称长度不够或者超长");
        }else if (password.length() < 6 || password.length() > 14){
            throw new UserServiceException("密码长度不够或者超长");
        }
        System.out.println("用户注册成功");
    }
}
