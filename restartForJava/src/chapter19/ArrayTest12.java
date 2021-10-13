package chapter19;
//动态初始化二维数组遍历
public class ArrayTest12 {
    public static void main(String[] args) {
        int[][] ints = new int[4][5];
//        遍历上面的二维数组
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] +",");
            }
//            换行符
            System.out.println();
        }

//  静态初始化一个二维数组
        int[][] ints1 = {
                {1,2,3,4},
                {3,4,5,3,4},
                {234,543,54}
        };
//        调用下面的方法，传进这个二维数组
        domain(ints1);
    }

    public static void domain(int[][] ints){
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] +",");
            }
//            换行符
            System.out.println();
        }
    }
}
