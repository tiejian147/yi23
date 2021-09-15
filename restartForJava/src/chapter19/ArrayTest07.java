package chapter19;

public class ArrayTest07 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};
        for (int i = 0; i < animals.length; i++) {
//            Animal a = animals[i];
//            a.move();
//            可以合并为一行吗？
            animals[i].move();//可以
        }
    }
}

class Animal{
    public void move(){
        System.out.println("animal moving ...");
    }
}
