package chapter22.Collection;
/*
JDK5.0之后推出了一个新特性：叫做增加for循环，或者叫foreach

 */
public class ForEachTest01 {
    public static void main(String[] args) {
        //[]
        int[] arr = {454,54,54,5,4,54,5,21};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");
        //foreach的语法是：
        //foreach的缺点是没有下标；
        for (int data: arr) {
            System.out.println(data);
        }
    }
}
