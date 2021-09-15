package chapter19;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] a1 = {123,222,300};
        printArray(a1);

        Object[] b1 = new Object[3];
        b1[0] = new Object();
        printArray(b1);
    }
//      整数型数组的传参
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("整数型数组的元素：" + array[i]);
        }
    }

//    对象数组传参
    public static void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("对象数组的元素：" + array[i]);
        }
    }
}
