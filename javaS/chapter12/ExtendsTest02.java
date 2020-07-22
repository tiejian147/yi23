/**
 * 银行账户类
 * 账户的属性：账号、余额
 * 
 * 下面两个类，有继承的语法来写：
 * 继承也是存在缺点的：耦合度高，父类修改，子类受牵连
 */

public class ExtendsTest02{
    public static void main(String[] args){
        Account a1 = new Account();
        a1.setActno("11111");
        a1.setBalance(10000);
        System.out.println("账号为：" + a1.getActno() + "，余额为：" + a1.getBalance());

        CreditAccount ca = new CreditAccount();
        ca.setActno("2222");
        ca.setBalance(20000);
        ca.setCredit(1.5);
        System.out.println("账号为：" + a1.getActno() + "，余额为：" + a1.getBalance() + "，信誉度为" + ca.getCredit());
    }
}

 class Account {
    //实例变量   属性
    private String actno;
    private double balance;

    //构造无参方法
    public Account(){
        
    }
    //构造有参方法
    public Account(String actno, double balance){
        this.actno = actno;
        this.balance  = balance;
    }


    //setter  and getter方法
    public String getActno(){
        return actno;
    }

    public double getBalance(){
        return balance;
    }

    public void setActno(String actno){
        this.actno = actno;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

/**
 * 其他类型的账户：信用卡账户
 * 账户、余额、信誉度
 */

 class CreditAccount extends Account{
    // 实例变量，属性  这里的属性是可以继承的 ，不需要写了
    // private String actno;
    // private double balance;
    private double credit;

    //除了构造方法之外，都是可以继承过来的
    public CreditAccount(){
        
    }
    //构造有参方法
    // public CreditAccount(String actno, double balance, double credit){
    //     this.actno = actno;
    //     this.balance  = balance;
    //     this.credit = credit;
    // }


    //setter  and getter方法
    

    public double getCredit(){
        return credit;
    }

    //set方法
    

    public void setCredit(double credit){
        this.credit = credit;
    }

 }