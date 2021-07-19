package chapter09;

public class Test01 {
    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println("main中的i=" + i);//这里是10
    }
//    编写一个方法
    public static void add(int i){
        i++;
        System.out.println("i=" + i);//这里是11
    }
}
