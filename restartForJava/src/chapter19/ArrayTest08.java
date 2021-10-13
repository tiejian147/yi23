package chapter19;
/*
数组的扩容
 */
public class ArrayTest08 {
    public static void main(String[] args) {
//        System.arraycopy();数组拷贝的方法调用
        int[] a1 = {11,22,44,321,434};
        int[] dust = new int[20];
//        拷贝数组
        System.arraycopy(a1,1,dust,4,3);
        for (int i = 0; i < dust.length; i++) {
            System.out.println(dust[i]);
        }
    }
}
