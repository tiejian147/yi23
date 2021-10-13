package chapter19;

public class ArrayTest10 {
    public static void main(String[] args) {
        int[][] a = {
                {10,9,8,7},
                {100,200,300,500},
                {666,777,888,999}
        };
//        取二维数组中第一个一维数组中的第一个元素
        System.out.println(a[0][0]);
//        取二维数组中第二个一维数组中的第二个元素
        System.out.println("二维数组中第二个一维数组中的第二个元素：" + a[1][1]);

//        修改数值
        a[1][1]= 11111;
        System.out.println("二维数组中第二个一维数组中的第二个元素：" + a[1][1]);
    }
}
