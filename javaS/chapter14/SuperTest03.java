/**
 *      1、举个例子：在恰当的时间使用：super（实际参数列表）;
 * 
 *      2、注意：在构造方法执行过程中一连串调用了父类的构造方法，父类构造方法又继续
 *           向下调用它的父类的构造方法，但是实际上对象只创建了一个。
 * 
 *      3、思考：super(实参)的作用是：初始化当前对象的父类型特征。
 *           并不是创建新对象，实际上对象只创建了一个。
 * 
 *      4、super关键字代表什么？
 *          super关键字代表的就是“当前对象”的那部分父类型特征。
 *          
 *          我继承了我父亲的一部分特征：
 *              例如：眼睛、皮肤等。
 *              super代表的就是“眼睛、皮肤等”。
 *              “眼睛、皮肤等”虽然是继承了父亲的，但是这部分是在我身上的。
 * 
 */

 public class SuperTest03{
     public static void main(String[] args){
        CreditAccount ca1 = new CreditAccount();
        System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());

        CreditAccount ca2 = new CreditAccount("1111",5.66,1.04);

        System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());

     }
 }

 //账户类
 class Account {
    // 实例变量 属性  账户
    private String actno;
    // 实例变量 属性  余额
    private double balance;

    // 构造无参方法
    public Account() {

    }

    // 构造有参方法
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    // setter and getter方法
    public String getActno() {
        return actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


 //信用账户


class CreditAccount extends Account{
    // 实例变量，属性
    
    private double credit;

    // 构造无参方法
    public CreditAccount() {

    }

    // 构造有参方法
    public CreditAccount(String actno, double balance, double credit) {
        //分析以下程序是否存在编译错误？会报错
        //私有的属性，只能在本类中访问。
        // this.actno = actno;
        // this.balance = balance;

        //以上两行代码在恰当的位置，正好可以使用：super(actno,balance);
        //通过子类的构造方法，调用父类的构造方法

        super(actno,balance);
        this.credit = credit;
    }

    // setter and getter方法
   

    public double getCredit() {
        return credit;
    }

   

    public void setCredit(double credit) {
        this.credit = credit;
    }

}