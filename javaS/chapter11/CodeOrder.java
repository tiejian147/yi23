public class CodeOrder{
    //静态代码块
    static {
        System.out.println("A");
    }

    //入口方法
    public static void main(String[] args){
        System.out.println("main begin");
        new CodeOrder();
        System.out.println("main over");
    }

    //构造方法：
    public CodeOrder(){
        System.out.println("B");
    }

    //实例语句块
    {
        System.out.println("C");
    }
    //静态代码块
    static {
        System.out.println("X");
    }
}
/**
 * A
 * X
 * main begin
 * C
 * B
 * main over
 */