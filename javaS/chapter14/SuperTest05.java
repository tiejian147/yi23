/**
 * 校验打印结果：
    null正在购物！
    张三正在购物！
    null正在购物！

    1、“this.” 和“super.” 大部分情况下都是可以省略的
    2、this. 什么时候不能省略？
        public void setName(String name){
            this.name = name;
        }
    3、super. 什么时候不能省略？
        父类中有，子类中又有，如果想在子类中访问“父类特征”，super. 不能省略。
        
 */

public class SuperTest05{
    public static void main(String[] args){
        Vip v = new Vip("张三");
        v.shopping();

    }
}

class Customer{
    String name;

    public Customer(){

    }

    public Customer(String name){
        this.name = name;
    }
}

class Vip extends Customer{

    //假设子类也有一个同名属性
    String name;//实例变量

    public Vip(){

    }

    public Vip(String name){
        super(name);
    }

    //super和this 都不能出现在静态方法中
    public void shopping(){

        /**
         * java是怎么来区分子类和父类的同名属性的？
         *      this.name :当前对象的name属性。
         *      super.name ：当前对象的父类型特征中的name属性。
         */


        //this表示当前对象。
        System.out.println(this.name + "正在购物！");
        //super表示当前对象的父类型特征（super是this指向的那个对象中的一块空间）
        System.out.println(super.name + "正在购物！");
        System.out.println(name + "正在购物！");

    }
}