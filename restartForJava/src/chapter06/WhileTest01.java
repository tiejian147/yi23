package restartForJava.src.chapter06;

/*
while :执行次数   0-N次
do...while  执行次数： 1-N次    至少执行一次
 */
public class WhileTest01 {
    public static void main(String[] args) {
//        while 练习
        int i = 0;
        while (i < 9){
            System.out.println("ok");
            i++;
            System.out.println("i = " + i);
        }

//        do...while 循环
        int k = 0;
        do {
            k++;
            System.out.println("k --> " + k);
        }while (k < 9);
    }
}
