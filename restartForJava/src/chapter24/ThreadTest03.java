package chapter24;
/*
实现线程的第二个方式：
    编写一个类实现java.lang.Runnable接口
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        /*//创建一个可运行的对象
        MyRunnable r = new MyRunnable();
        //将可运行的对象封装成一个线程对象
        Thread thread = new Thread(r);*/
        //将上面两行代码合并：
        Thread thread = new Thread(new MyRunnable());
        //启动线程
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主栈线程：" + i);
        }

    }
}
//这并不是一个线程类，是一个可运行的类，它还不是一个线程。
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分栈线程--->" + i);
        }
    }
}
