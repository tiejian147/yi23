package chapter24;

public class JavaForLianXi {
    public static void main(String[] args) {
        int x;
        int y;
        int m;
        int n;
        for (x = -100; x <= 100; x++) {
            for (y = -100; y <= 100; y++) {
                for (m = -100; m <= 100; m++) {
                    for (n = -100; n <= 100; n++) {
                        if (x+y==8&&m-n==6&&x+m==14&&y+n==10){
                            System.out.println("x:"+x);
                            System.out.println("y:"+y);
                            System.out.println("m:"+m);
                            System.out.println("n:"+n);
                        }
                    }
                }
            }
        }
        //联系三目运算符来判断是否是周日还是工作日
        int b =5;
        String a = (b-5) > 0 ? "周末" : "工作日";
        System.out.println(a);

    }
}
