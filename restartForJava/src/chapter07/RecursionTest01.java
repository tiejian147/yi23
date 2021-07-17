package chapter07;
/*
方法的递归：
    方法自己调用自己，叫做方法递归
 */
public class RecursionTest01 {
    public static void main(String[] args) {
        doOther();
        sum(3);
        sum(6);
    }
    public static void doOther(){
        System.out.println("doSome doing");//这行就会报错
//        doOther();
        System.out.println("doSome done");
    }
//    计算 1+2+3+4+...n 的总和
    public static void sum(int num){
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        System.out.println("总和为：" + result);
    }
}
