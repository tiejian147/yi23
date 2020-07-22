

public class DateTest {
    public static void main(String[] args){
        //创建日期对象
        Date d1 = new Date();

        //给年月日重新赋值
        d1.year = 2010;
        d1.month = 12;
        d1.day = 23;

        //打印年月日
        System.out.println("日期为：" + d1.year + "年" + d1.month + "月" + d1.day + "日");
        System.out.println("------------------------------------------------------");

        //创建男人对象
        Men p1 = new Men();

        //给男人的属性赋值
        p1.idNo = 11221;
        p1.name = "zhangsan";
        p1.sex = "男";
        p1.woman = "知否";

        //输出男人的各类信息。
        System.out.println("他的身份证号码是：" + p1.idNo);
        System.out.println("他的名字是：" + p1.name);
        System.out.println("他的性别是：" + p1.sex);
        System.out.println("他的女人是：" + p1.woman);
        System.out.println("------------------------------------------------------");

        //创建女人对象
        Women p2 = new Women();

        //给女人的属性赋值
        p2.idNo = 12326521;
        p2.name = "安杰";
        p2.sex = "女";
        p2.man = "江德福";

        //输出男人的各类信息。
        System.out.println("她的身份证号码是：" + p2.idNo);
        System.out.println("她的名字是：" + p2.name);
        System.out.println("她的性别是：" + p2.sex);
        System.out.println("她的男人是：" + p2.man);
        System.out.println("------------------------------------------------------");

        //创建银行对象
        BankAccount bank1 = new BankAccount();

        //给银行对象赋值
        bank1.bankNum = 12312123;
        bank1.bankPassword = 321;
        bank1.accountBalance = 500.12F;

        //输出银行的账户信息
        System.out.println("银行账户为：" + bank1.bankNum);
        System.out.println("银行密码为：" + bank1.bankPassword);
        System.out.println("银行余额为：" + bank1.accountBalance);
        System.out.println("------------------------------------------------------");

        //创建丈夫对象
        Husband nan1 = new Husband();
        //创建妻子对象
        Wife nv1 = new Wife();

        nan1.idNo = 1232;
        nan1.name = "大刘";

        nv1.idNo = 122222;
        nv1.name = "小方";
        /*这里非常有意思；88、89行代码
        //第一个报错：首先我写的是Husband.wife = nan1; 报错：无法从静态上下文中引用非静态变量，这个报错是因为我在
        丈夫类和妻子类中 将各自的配偶的属性，都写成了String，那就肯定不对了，因为是要从各自的对象中各自关联，
        所以肯定要写各自的类型，而且不能直接引啊，要用创建的对象来引，所以要写成：nan1.wife = nan1; 丈夫类中
        的妻子要写成Wife类型的，妻子类中的丈夫要写成Husband类型的。
        第二个报错：改好之后，再次编译：还是报错：不兼容的类型，Husband无法转换为Wife
        报错还是这一行；
        为什么类型不对呢？
        等号左边nan1.wife 是Wife类型的；而等号右边写的是nan1，nan1 是new的Husband(); 出来的对象，所以nan1是Husband类型的，
        Wife类型怎么能等于Husband类型呢？所以就报错了：不兼容的类型，Wife无法转换为Husband
        更改：nan1.wife = nv1;
            nv1.husband = nan1;
        编译通过。

        */
        nan1.wife = nv1;
        nv1.husband = nan1;
       

        System.out.println("丈夫的身份证号：" + nan1.idNo);
        System.out.println("丈夫的姓名：" + nan1.name);
        System.out.println("丈夫的妻子：" + nan1.wife.name);

       

        // System.out.println();
    }
}