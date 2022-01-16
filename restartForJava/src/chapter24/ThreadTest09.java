package chapter24;
/*
合理的终止一个进程；
    加boolean判断
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        MyRunnable4 r  = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("run3");
        System.out.println(t.getName());
        t.start();
        //5秒之后终止进程
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        r.run=false;
    }
}

class MyRunnable4 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        //先给个boolean值

        if (run){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                //每隔一秒输出一次名字
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            //如果不等于true，那么就终止进程
            return;
        }

    }
}
