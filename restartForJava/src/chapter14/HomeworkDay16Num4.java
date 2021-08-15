package chapter14;

public class HomeworkDay16Num4 {
    public static void main(String[] args) {
        Human h1 = new Human("张三",15);
        h1.display();

        Human h2 = new Human("李四",16);
        h2.display();
    }
}

class Human{
//    声明两个属性
    private String name;
    private int age;
//    构造器

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("姓名为：" + this.getName());
        System.out.println("年龄为：" + this.getAge());
    }
}