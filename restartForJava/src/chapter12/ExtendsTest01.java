package chapter12;
/*
这是不使用继承的写法：代码臃肿
 */

public class ExtendsTest01 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setActno(11111);
        a1.setBalance(5000);
        System.out.println("账户为" + a1.getActno() + ",余额为：" + a1.getBalance());

        CreditAccount ca1 = new CreditAccount(22222,-1000,1.25);
        System.out.println("账户为" + ca1.getActno() + ",余额为：" + ca1.getBalance() + ",信誉度为：" + ca1.getCredit());
    }
}

// 账户类
class Account{
    private int actno;
    private int balance;
//    构造器
//     无参数
    public Account() {
    }
//    有参数

    public Account(int actno, int balance) {
        this.actno = actno;
        this.balance = balance;
    }


//    setter and getter

    public int getActno() {
        return actno;
    }

    public void setActno(int actno) {
        this.actno = actno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

//  信用卡类
class CreditAccount{
    private int actno;
    private int balance;
    private double credit;
//    构造器
//    无参数

    public CreditAccount() {
    }

//    有参数

    public CreditAccount(int actno, int balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
    }

//    setter and getter

    public int getActno() {
        return actno;
    }

    public void setActno(int actno) {
        this.actno = actno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
