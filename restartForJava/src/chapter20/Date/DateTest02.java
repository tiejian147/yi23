package chapter20.Date;
/*
获取从1970年1月1日 0点0分0秒到现在的毫秒数
1秒= 1000毫秒

 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);

        //如果有个需求：统计print()方法耗费的时长
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "毫秒");
    }

    //一个静态方法
    public static void print(){
        for (int i = 0; i < 1000000000; i++) {//如果不打印，十亿次的循环，才几毫秒
//            System.out.println("i =" + i );//打印才是慢
        }
    }
}
