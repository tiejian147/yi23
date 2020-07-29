package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 1、java中为8中基本数据类型又对应了8中包装类型，8中包装类属于引用数据类型，父类是Object
 * 2、思考：为什么要再提供8中包装类？
 * 因为8种基本数据类型不够用。
 * 所以sun公司又提供对应的8中包装类型。
 */
public class IntegerTest01 {
    //    入口
    public static void main(String[] args) {
        //    有没有这种需求：调用doSome()方法的时候需要传一个数字进去？
//    但是数字属于基本数据类型，而doSome()方法参数的类型是Object
//    可见doSome()方法无法接受基本数据类型的数字，那怎么办呢？可以传一个数字对应的包装类进去
//    把100这个数字经过构造方法包装成对象
        MyInt myInt = new MyInt(100);
        doSome(myInt);
    }

    public static void doSome(Object obj) {
//        因为没有重写toString方法  ，所以返回的是内存地址
        //javase.chapter20.com.tiejian147.javase.integer.IntegerTest01.MyInt@61bbe9ba
//        在MyInt类中重写了toString方法之后，就能打印出想要的数值了
        System.out.println(obj);
    }


}
