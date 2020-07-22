/**
 *  1、this可以使用在实例方法中，不能使用在静态方法中。
 *  2、this关键字大部分情况下可以省略，什么时候不能省略呢？
 *      在实例方法中，或者构造方法中，为了区分局部变量和实例变量，这种情况下：
 *      this.   是不能省略的
 */


public class ThisTest03{
    public static void main(String[] args){
        //调用无参数构造方法
        Student s1 = new Student();
        s1.setName("张三");
        s1.setNo(34);
        System.out.println("学号为" + s1.getNo());
        System.out.println("姓名为" + s1.getName());

        //调用有参数构造方法
        Student s2 = new Student(1212,"李四");

        System.out.println("学号为" + s2.getNo());
        System.out.println("姓名为" + s2.getName());

    }
}
//学生类
class Student{
    //学号
    private int no;
    //姓名
    private String name;
    //构造方法无参
    public Student(){

    }
    //构造方法有参
    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }
    //setter and getter方法
    //int i 可读性太差了，变量名起的没有意义，但是直接用 int no 会报错；
    // public void setNo(int no){
    //     no = no ;//这两个no都是局部变量no，和实例变量no没有关系
    // }

    public void setNo(int no){
        //no是局部变量
        //this.no是指的实例变量
        this.no = no;//this. 的作用是：区分局部变量和实例变量
        //no = i ;
    }

    public int getNo(){
        return no;//这里获取的实际上是this.no
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;//这里获取的实际上是this.name
    }
}
