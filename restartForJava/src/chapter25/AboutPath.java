package chapter25;

import java.io.FileReader;

/*
研究一下文件路径的问题：

 */
public class AboutPath {
    public static void main(String[] args) {
        //这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根。
        //这个假设离开了其他路径，换到了其他位置，可能当前路径就不是project的根了，这时这个
        //路径就无效了。
        //FileReader reader = new FileReader("chapter25/classinfo.properties");

        //接下来说的一种比较通用的路径。即使代码移植了，这样编写仍然是通用的。
        //注意：使用以下通用方式的前提是：这个文件必须在类路径下。
        //什么是类路径：凡是在src路径下的都是类路径下。
        //src是类的根路径。
        /*
        解释：
            Thread.currentThread() 当前线程对象
            getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
            getResource("") 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
            getPath();
         */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        System.out.println(path);// /C:/study/java/yi23/out/production/restartForJava/classinfo2.properties
        //采用以上方式可以拿到一个文件的绝对路径，这种方式是获取绝对路径是通用的，是可以跨操作系统的

        //或缺db.proterties文件的绝对路径
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("chapter25/bean/db.properties").getPath();
        System.out.println(path2);

    }
}
