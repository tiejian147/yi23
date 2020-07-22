/**
 * 在外部程序中访问Person这个类型中的数据
 */

public class PersonTest{
    public static void main(String[] args){
        //创建person对象
        Person p1 = new Person();
        //访问人的年龄，访问一个对象的属性，通常包括两种操作：
        //一种是读数据
        //一种是改数据
        // System.out.println("初始化的年龄为" + p1.age);//读（get表示获取）
        //修改数据（set表示修改/设置）
        // p1.age = 50;
        //再次读取
        // System.out.println("变更后的年龄为" + p1.age);
        //在PersonTest这个外部程序中  目前是可以随意对age这个属性进行操作的
        //一个人的年龄值不应该为负数
        //程序中给年龄赋值了一个负数，按说是不符合业务要求的，但是程序目前还是让他通过了
        //其实这就是一个程序的bug
        // p1.age = -100;//随意在这里对Person内部的数据进行访问，导致了不安全
        // System.out.println("再次变更后的年龄为" + p1.age);

        // int nianLing = p1.getAge();
        System.out.println(p1.getAge());

        p1.setAge(-100);

        p1.setAge(100);
        System.out.println("重新赋值后的年龄为：" + p1.getAge());
    }
}