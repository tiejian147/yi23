/*
    对象的创建和使用
*/

public class StudentsTest{
    public static void main(String[] args){
        //访问学生姓名可以直接通过类名吗？
        //学生姓名是一个实例变量。实例变量是对象级别的变量。
        //是不是应该先有对象才能说姓名的事儿。
        //不能通过“类名”来直接访问“实例变量”
        //System.out.println(Students.name);//这样直接编译会报错

        //i属于局部变量吗？当然是
        //局部变量存储在栈内存当中（栈主要存储局部变量）
        // int i = 100;

        //创建学生对象1
        //s1 属于局部变量吗？ 当然是
        //s1 这个局部变量叫做引用
        Students s1 = new Students();

        //怎么访问实例变量？
        //语法：引用.实例变量名
        System.out.println(s1.num);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);
        System.out.println(s1.addr);


        //创建学生对象2
        //s2也是局部变量
        //s2 也叫做引用。 
        System.out.println("------------------------------------");
        Students s2 = new Students();

        System.out.println(s2.num);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
        System.out.println(s2.addr);

        System.out.println("------------------------------------");

        //new一个address类的实例对象
        Address a1 = new Address();

        //通过“=” 复制的方式将内存中实例变量的值修改一下。
        a1.city = "北京市";
        s1.num = 110;
        s1.name = "张三";
        s1.age = 19;
        s1.sex = false;
        s1.addr = a1;
        

        

        System.out.println("学号是："  + s1.num);
        System.out.println("姓名是："  + s1.name);
        System.out.println("年龄是："  + s1.age);
        System.out.println("性别是："  + s1.sex);
        System.out.println("地址是："  + s1.name + "的城市是：" + s1.addr.city);



        // public static void method(){
        //     //i s1 s2 都是main方法中的局部变量，在这里是无法访问的
        //     // System.out.println(i);
        //     // System.out.println(s1);
        //     // System.out.println(s2); 
        // }


    }
}