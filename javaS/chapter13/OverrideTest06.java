// 私有方法不能覆盖

public class OverrideTest06{

    //私有方法
    // private void doSome(){
    //     System.out.println("OverrideTest06's private method doSome execute");
    // }

    //私有方法
    public void doSome(){
        System.out.println("OverrideTest06's private method doSome execute");
    }


    public static void main(String[] args){
        //多态
        OverrideTest06 ot = new T();
        ot.doSome();//如果是私有方法，那么就会打印父类的；如果是公共方法，那么就是子类的
        //但是子类的方法也要写成公共的

    }
}

// 子类

class T extends OverrideTest06{
    //尝试重写父类中的doSome()方法
    //访问权限不能更低，可以更高。
    public void doSome(){
        System.out.println("T's private method doSome execute");
    }
}