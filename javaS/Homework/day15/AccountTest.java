public class AccountTest{
    public static void main(String[] args){
        //new 各个类对象
        Account a2 = new Account("1000", 2000, 1.23);
        Customer user1 = new Customer("Jane Smith" , a2);

//         1、创建一个Customer，名字叫Jane Smith ，他有一个账号为1000，余额为2000，
//  *          年利率为：1.23%的账户
//  *      2、对Jane Smith 操作：
//  *      存入100元，再取出960元，再取出2000；
        // user1.a2.deposit(100);

        user1.getAct().withdraw(100);
        user1.getAct().deposit(960);
        user1.getAct().deposit(2000);

        


        
    }
}