package chapter14;

public class SuperTest07 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.moveAgain();
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("Cat move");
    }

    public void moveAgain(){
        this.move();//cat move
        move();// cat move
        super.move();// Animal move
    }
}


