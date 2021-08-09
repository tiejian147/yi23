package chapter13;

public class Master {
    public static void main(String[] args) {
        Master m1 = new Master();
//        把宠物都创建对象


        m1.feed(new Dog());
        m1.feed(new Fish());
        m1.feed(new Mouse());
//        System.out.println(p1 instanceof Fish);

    }
    public void feed(Pet pet){
//        Pet p1 = new Dog();
//        Pet p2 = new Fish();
//        Pet p3 = new Mouse();
        if (pet instanceof Dog){
            new Dog().eat();
        }else if (pet instanceof Fish){
            new Fish().eat();
        }else if (pet instanceof Mouse){
            new Mouse().eat();
        }
    }
}
