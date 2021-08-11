package chapter14;
/*
检验super

什么时候super不能省略：
    父类中有属性，子类又有一样的属性，如果想在子类中访问父类中的同名属性，那么就必须
    要加super.
 */
public class SuperTest04 {
    public static void main(String[] args) {
//        Customer c1 = new Customer();


        Vip v2 = new Vip("张三");
        v2.shopping();

    }
}

class Customer{
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

}

class Vip extends Customer{
    String name;//如果子类中有和父类一样的重名属性的话，接下面注释
    public Vip(){

    }
    public Vip(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(this.name + "正在购物");
        System.out.println(super.name + "正在购物");//  这个super就不能省略了
        System.out.println(name + "正在购物");
    }
}
