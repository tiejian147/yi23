package day27;

class UserService {
    public void register(String username, String password) throws MyUserServiceException {
        if (username.length() >15 || username.length() < 5){
//            System.out.println("长度不对");
            throw new MyUserServiceException("长度不对");
        }else if (password == null){
//            System.out.println("不能空填写");
            throw new MyUserServiceException("不能空填写");
        }

        System.out.println("注册成功");
    }
}
