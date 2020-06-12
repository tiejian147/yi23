/*
    抽象类：
        1、什么是抽象类？
            类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
            类本身是不存在的，所以抽象类无法创建对象（无法实例化）

        2、抽象类属于什么类型？
            抽象类也属于引用数据类型。

        3、抽象类怎么定义？
            语法：
                [修饰符列表] abstract class 类名{
                    类体；
                }

        4、抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。

        5、final 和 abstract 不能联合使用，这两个关键字是对立的。

 */

public class AbstractTest01 {
    public static void main(String[] args) {
        //这里会报错：Account是抽象的，无法实例化
        new CreditAccount();
    }
}

//银行账户类--抽象类
abstract class Account{

}

//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{

}
