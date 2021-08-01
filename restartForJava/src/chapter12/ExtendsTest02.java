package chapter12;

/*
这是使用继承的写法：
 */

public class ExtendsTest02 {
    public static void main(String[] args) {
        Account02 a3 = new Account02();
        a3.setActno(11111);
        a3.setBalance(5000);
        System.out.println("账户为" + a3.getActno() + ",余额为：" + a3.getBalance());

        CreditAccount02 ca2 = new CreditAccount02();
        ca2.setActno(33333);
        ca2.setBalance(500);
        ca2.setCredit(2.0);
        System.out.println("账户为" + ca2.getActno() + ",余额为：" + ca2.getBalance() + ",信誉度为：" + ca2.getCredit());
    }
}

// 账户类
class Account02{
    private int actno;
    private int balance;
    //    构造器
//     无参数
    public Account02() {
    }
//    有参数

    public Account02(int actno, int balance) {
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
class CreditAccount02 extends Account02{
//    private int actno;
//    private int balance;
    private double credit;
//    构造器
//    无参数

    public CreditAccount02() {
    }

//    有参数

//    public CreditAccount02(int actno, int balance, double credit) {
//        this.actno = actno;
//        this.balance = balance;
//        this.credit = credit;
//    }

//    setter and getter
/*    因为继承了父类，这里就不用写了
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
*/
    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}

