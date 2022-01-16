package chapter24;
/*
终止睡眠：

 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable2());
        //线程改名
        thread.setName("tttt");
        //线程名称输出：
        System.out.println(thread.getName());
        //线程执行
        thread.start();
        //希望5秒钟之后tttt线程醒来
        try {
            thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            //打印异常信息：
            e.printStackTrace();
        }
        //终断线程的睡眠（这种中断睡眠的方式依靠了java的异常处理机制）
        thread.interrupt();

    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("myRunnable方法begin");
        //睡眠1天才继续执行代码
        try {
            Thread.sleep(1000 * 60 * 60 * 24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("myRunnable方法over");
    }
}


