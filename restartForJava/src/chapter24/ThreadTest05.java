package chapter24;
/*
1、怎么获取当前线程对象？
 static Thread currentThread()
2、获取线程对象的名字？
    String name = 线程对象.getName()
3、修改线程对象的名字？
    线程对象.setName()
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        //获取当前线程
        Thread threadcurrent = Thread.currentThread();
        System.out.println("main中的当前线程：" + threadcurrent);
        MyThread2 t = new MyThread2();
        //获取线程的名字，未修改之前：
        System.out.println(t.getName());//Thread-0
        //修改线程的名字，然后再次输出：
        t.setName("new线程");
        System.out.println("新名字：" + t.getName());
        //启动线程：
        t.start();
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            Thread threadcurrent1 = Thread.currentThread();
            System.out.println("获取分支线程的当前线程：" + threadcurrent1);
            System.out.println("分支线程==>" + i);
        }
    }
}
