package chapter24;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式：
    实现callable接口
 */
public class ThreadTest15 {
    public static void main(String[] args) {
        //第一步，创建一个未来任务类对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call()方法就相当于run方法
                //只不过这里有返回值
                System.out.println("call method begin");
                Thread.sleep(1000*5);
                System.out.println("call method over");
                int a = 10;
                int b = 20;
                return a + b;
            }
        });

        //创建线程
        Thread thread = new Thread(futureTask);
        //执行就可以了
        thread.start();
    }
}
