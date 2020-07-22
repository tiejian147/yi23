/*
    方法重载（overload）
        什么时候需要考虑使用方法重载？
            在同一个类当中，如果“功能1”和“功能2”它们的功能是相似的，那么可以
            考虑将它们的方法名一致，这样代码既美观，又便于后期的代码编写（容易记忆）。

            注意：方法重载overload不能随便使用，如果两个功能压根不想干，
            不相似，根本没关系，此事两个方法使用重载机制的话，会导致编码更麻烦，
            无法进行方法功能的区分。
        
        什么时候会发生方法重载？
            条件1：在同一个类当中
            条件2：方法名称相同
            条件3：参数列表不同
                参数的个数不同算不同；
                参数的类型不同算不同；
                参数的顺序不同算不同；

            只要同时满足以上3个条件，那么我们可以认定方法和方法之间发生了重载机制。

    注意：不管代码怎么写，一定要让编译器很好的区分开这两个方法。

        方法重载与方法的“返回值类型”无关。
        方法重载与方法的“修饰符列表”无关；
*/


public class OverloadTest03 {
    public static void main(String[] args){
        m();
        m(4);

        m1(100);
        m1(3.14);

        m2(3.14, 5);
        m2(14, 18.19);
    }
    //举例说明：参数的个数不同算不同；
    public static void m(){
        System.out.println("这里走到了方法1");
    }

    public static void m(int x){
        System.out.println("这里走到了方法2");
    }

    //举例说明：参数的类型不同算不同；
    public static void m1(int x){
        System.out.println("这里看类型不同");
    }

    public static void m1(double y){
        System.out.println("这里看类型不同2");
    }

    //举例说明：参数的顺序不同算不同；
    public static void m2(double m,int n){
        System.out.println("这里看顺序不同1");
    }

    public static void m2(int n, double x){
        System.out.println("这里看顺序不同2");
    }

    //完全相同的两个方法，根本连编译都通不过的
    //以下代码会报错：方法重复了
    // public static void m3(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // }

    // public static void m3(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // }

    //如果方法的返回值类型不一样，编译器认为也是相同的两个方法
    //以下代码会报错：方法重复了
    // public static void m4(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // }

    // public static void m4(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // }

    //如果只是修饰符列表一个有，一个没有
    //以下代码会报错：方法重复了
    // public static void m5(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // }

    // void m5(int n, double x){
    //     System.out.println("这里看顺序不同2");
    // } 
}
