/*
    在方法调用的时候，“类名.”什么时候是可以省略的，什么时候不能省略？
        a()方法调用b()方法的时候，a和b方法在同一个类中，“类.”可以省略。
        如果不在同一个类中，“类名.”不可以省略。
*/
//类1
public class MethodTest04{
    public static void main(String[] args){
        //调用daYin()方法
        MethodTest04.daYin();
        MethodTest04.daYin2();
        System.out.println("--------------------------------");
        //类名可以省略吗？
        daYin();
        daYin2();
        System.out.println("--------------------------------");
        //第一次跨类调用
        //像这种情况下,"类名."就不能省略了
        MyClass.daYin3();
        MyClass.daYin4();


    }

    public static void daYin(){
        System.out.println("hello world");
    }

    public static void daYin2(){
        System.out.println("hello world2");
    }
}

//类2
class MyClass{
    public static void daYin3(){
        System.out.println("test1111");
    }

    public static void daYin4(){
        System.out.println("test222223424234");
    }
}
