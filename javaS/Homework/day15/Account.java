/**
 * 二、写一个名为Account的类模拟账户
 *      该类的属性和方法如下所示：
 *      该类包括的属性：账户id，余额balance，年利率annualInterestRate：
 *      包涵的方法：各属性的set和get方法，取款方法withdraw(),存款方法：deposit();
 * 
 * 写一个测试程序：
 *      1、创建一个Customer，名字叫Jane Smith ，他有一个账号为1000，余额为2000，
 *          年利率为：1.23%的账户
 *      2、对Jane Smith 操作：
 *      存入100元，再取出960元，再取出2000；
 *      打印Jane Smith的基本信息
 *      信息如下显示：
 *      成功存入：100
 *      成功取出：960
 *      余额不足，取钱失败
 */

public class Account {
    //属性账户 实例变量
    private String id;
    //余额 实例变量
    private float balance;
    //年利率
    private double annualInterestRate;

    public static void main(String[] args){

    }

    //构造无参数构造方法
    public Account(){
        // this("1000",2000,0.0013);
        // this.id = 1000;
        // this.balance = 2000;
        // this.annualInterestRate = 0.0123;
    }
    //构造有参数构造方法
    public Account(String id, float balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //setter 和 getter 方法
    public String getId(){
        return id;
    }
    public float getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setBalance(Float balance){
        if(balance < 0){
            System.out.println("余额不足，取钱失败");
        }
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //编写存款方法
    public void withdraw(float num1){
        //如果不调用方法写的话，还可以这样写：
        // this.balance = this.balance + num1;
        // //或者这样
        // this.balance  += num1;


        // //或者这样写：this去掉也是可以的
        // balance = balance + num1;
        // //或者这样
        // balance += num1;
        

        //调用方法来实现怎么写呢？
        //this （向this指向的对象中存款）
        //Account a1 = new Account();//这里学了this之后可以省略了
        this.setBalance(this.getBalance() + num1);//this可写可不写，因为在同一个类当中
        //还能这样写：
        // setBalance(getBalance() + num1);

        System.out.println("成功存入：" + getBalance());
    }
    //编写取款方法
    public void deposit(float num2){
        // Account a3 = new Account();
        // a3.setBalance(num2);
        // a3.getBalance() = a1.getBalance() - num2;
        if(num2 > getBalance()){
            System.out.println("余额不足，取款失败");
            return;
        }
        this.setBalance(getBalance() - num2);
        System.out.println("成功取出：" + num2);
    }

}