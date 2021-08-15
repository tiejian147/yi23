package chapter14;

public class HomeworkDay16Num3 {
    public static void main(String[] args) {
        Number nn = new Number(10,20);
//        调用加减乘除的方法
        nn.addition();
        nn.subtration();
        nn.multiplication();
        nn.division();
    }
}

class Number{
//    定义两个属性；
    private int n1;
    private int n2;
//    构造器

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Number() {
    }
//    setter and getter

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
//    加法方法
    public void addition(){
        System.out.println("求和：" + n1 + "+" + n2 + "=" + (n1+n2));
    }
//    减法方法
    public void subtration(){
        System.out.println("减法：" + n1 + "-" + n2 + "=" + (n1-n2));
    }
//    乘法方法
    public void multiplication(){
        System.out.println("乘法：" + n1 + "*" + n2 + "=" + (n1*n2));
    }
//    除法方法
    public void division(){
        System.out.println("求商：" + n1 + "/" + n2 + "=" + (n1/n2));
    }
}