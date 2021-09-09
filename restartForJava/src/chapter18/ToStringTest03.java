package chapter18;

import java.util.Objects;

public class ToStringTest03 {
    public static void main(String[] args) {
        Student s3 = new Student(111,"中古友谊小学");
        Student s4 = new Student(111,"中古友谊小学");
        System.out.println(s3.equals(s4));


    }
}


class Student{
    int no;
    String school;
//    有参和无参的构造方法

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }
//    重写toString方法

    @Override
    public String toString() {
        return "学号" + this.no + "，" + "学校为：" + this.school;
    }
//    重写equals方法：判断如果学号和学校名称一样，那么对象相等

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Student)) return false;
        if(this == o) return true;
        Student s1 = (Student) o;
        return this.no == s1.no && this.school.equals(s1.school);
    }


}

