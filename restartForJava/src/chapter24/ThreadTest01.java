package chapter24;
/*
实现线程的第一种方式：
    编写一个类，继承java.lang.Thread，重写run方法；

    怎么创建线程对象？new就行了
    怎么启动线程？调用线程对象中的start()方法就可以了


 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主线程，在主栈中运行；
        //新建一个分支线程对象
        MyThread myThread = new MyThread();
        //启动分支线程
        /*
        start() 方法的作用是：在JVM中开辟一个新的栈空间，这段代码完成之后，瞬间就结束了。
        启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部。
        run方法在分支栈的栈底部，main方法在主栈的栈底部，run和main是平级的。

         */
        myThread.start();
        //这里的代码还是运行在主线程中：
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序，这段程序在分支线程中（分支栈）
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程---->" + i);
        }
    }
}
