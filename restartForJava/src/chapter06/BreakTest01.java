package restartForJava.src.chapter06;
/*
break 只会终止离他最近的循环语句，再往外有循环的话，不会被break
 */
public class BreakTest01 {
    public static void main(String[] args) {
//        break 练习
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("这里的代码照常执行");
    }
}
