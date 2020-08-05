package day27;
/*
用户类，处理用户相关的业务，：例如登录，注册等功能。
 */
class UserService {
    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @throws MyUserServiceException 当用户名和密码不合法，会出现该异常
     */
    public void register(String username, String password) throws MyUserServiceException {
        /*
        引用等于null的这个判断最好放到所有条件的前面
         */

        /*
        再分享一个经验：username == null  不如写成：null == username
         */

        if (null == username ){
//            System.out.println("长度不对");
            throw new MyUserServiceException("用户名不能为空");
        } else if (null == password){
//            System.out.println("不能空填写");
            throw new MyUserServiceException("密码不能空填写");
        } else if (username.length() < 5 || username.length() >15){
            throw new MyUserServiceException("用户名长度不对");
        }

        System.out.println("注册成功");
    }
}
