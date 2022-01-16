package chapter24;
/*
关于线程sleep方法：
    static void sleep(long millis)
    1、静态方法，Thread.sleep(1000)
    2、参数是毫秒
    3、作用：让当前线程进入休眠，进入”阻塞状态“ ，放弃占有的时间片，让给其他线程使用。
    4、sleep方法可以做到这种效果：
        间隔特定时间，去执行一段特定的代码，每隔多久执行一次；
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        //让当前线程sleep5秒钟然后再继续执行代码：
        /*try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒后才会执行下面的代码：
        System.out.println("hello world");
         */

        for (int i = 0; i < 10; i++) {
            //获取当前进行的名字
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            //每隔1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
