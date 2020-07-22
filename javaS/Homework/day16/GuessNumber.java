/**
 * 1、猜数字游戏 一个类A有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值。 
 * 另外再定义一个类B，对A类的实例变量进行猜测。
 * 如果大了，测提示大了。 小了则提示小了。 等于则提示猜测成功。
 * 
 * 2、请定义一个交通工具（vihicle）的类 其中有属性： 速度（speed） 体积（size）等等 方法： 移动move()
 * 设置速度setSpeed(int speed) 加速speedUp() 减速speedDown()
 * 最后再测试类Vehicle中的main()中实例化一个交通工具对象。 并通过方法给她初始化speed，size的值并且打印出来。
 * 另外调用加减速的方法对速度进行改变。
 * 
 * 3、在程序中经常对时间进行操作但是并没有时间类型的数据。 那么我们可以自己实现一个时间类来满足程序中的需要。
 * 定义名为MyTime的类其中应有三个整型成员：时hour、分minute、秒second 为了保证数据的安全性这三个成员变量应声明为私有。
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。 再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下方法：
 * addSecond(int sec) addMinute(int min) addHour(int hour) subSecond(int sec)
 * subMinute(int min) subHour(int hour)
 * 
 */

public class GuessNumber {
    public static void main(String[] args) {
        //创建对象
        A a1 = new A(100);
        B b1 = new B(a1);

        //开始猜测
        java.util.Scanner s = new java.util.Scanner(System.in);
        //写一个如果猜对了就停止循环的方法
        while(true){
            System.out.println("请输入要猜测的数字");
            int num = s.nextInt();
            b1.guess(num);
        }



    }
}

class A {
    // 定义一个实例变量
    private int v;

    // 构造无参方法
    public A() {

    }

    // 构造有参方法
    public A(int v) {
        this.v = v;
    }

    // 构造setter and getter方法
    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

}

class B{
    //定义A类型的实例变量
    //通过B猜测A，在B的对象中需要有一个A对象的引用
    //通常初学者，会卡在这里，不知道应该要这样写
    //不知道将A设置为B的一个属性。
    private A a;

    //构造无参方法
    public B(){

    }
    //构造有参方法
    public B(A a){
        this.a = a;
    }

    //构造setter and getter 方法
    public A getA(){
        return a;
    }

    public void setA(A a){
        this.a = a;
    }

    //写个猜测的方法
    public void guess(int shiJiZhi){
        if(shiJiZhi == a.getV()){
            System.out.println("猜对了！");
            //跳出循环的语句
            System.exit(0);
        }else if(shiJiZhi < a.getV()){
            System.out.println("猜小了");
        }else{
            System.out.println("猜大了");
        }
    }


}
