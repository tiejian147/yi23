/**
 * 二、写一个名为Account的类模拟账户
 *      该类的属性和方法如下所示：
 *      该类包括的属性：账户id，余额balance，年利率annualInterestRate：
 *      包涵的方法：各属性的set和get方法，取款方法withdraw(),存款方法：deposit();
 * 
 * 写一个测试程序：
 *      1、创建一个Customer，名字叫Jane Smith ，他有一个账号为1000，余额为2000，年利率为：
 *      2、对Jane Smith 操作：
 *      存入100元，再取出960元，再取出2000；
 *      打印Jane Smith的基本信息
 *      信息如下显示：
 *      成功存入：100
 *      成功取出：960
 *      余额不足，取钱失败
 */

public class Customer {
    
    public static void main(String[] arge){
        Account a1 = new Account();
        Customer user1 = new Customer();
        user1.act = a1;
    }

    //实例变量  客户名字
    private String name;
    // 实例变量  账户
    private Account act;

    // 编写无参数的构造方法
    public Customer(){
        // this("Jane Smith", 1000);
    }

    //编写有参数的构造方法
    public Customer(String name, Account act){
        this.name = name;
        this.act = act;
    }
    //编写setter 和 getter方法
    public String  getName(){
        return name;
    }

    public Account  getAct(){
        return act;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAct(Account act){
        this.act = act;
    }

    
}
