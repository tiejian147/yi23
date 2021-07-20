package chapter10;

public class AnimalTest01 {
    public static void main(String[] args) {
//        new 对象
        Animal a1 = new Animal();
        System.out.println(a1.getAge());//0

        a1.setAge(5);
        System.out.println(a1.getAge());//5

        a1.setAge(-5);
        System.out.println(a1.getAge());//
    }
}
