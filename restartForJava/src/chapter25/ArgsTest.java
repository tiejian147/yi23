package chapter25;
/*
可变长度参数
    int...args 这就是可变长度参数
    语法是：类型...  （注意一定得是3个点）
    1、可变长度参数要求的参数个数是 0-N个
    2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个
    3、
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(1111111);
        m(10,2);
    }
    public static void m(int...args){
        System.out.println("m方法执行了");
    }
}
