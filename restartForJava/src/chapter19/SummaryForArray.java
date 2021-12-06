package chapter19;
/*
数组的总结：
1.2、一维数组的静态初始化和动态初始化：
    静态的：
    int[] ary = {1,2,3};
    Object[] objs = {new Object(),new Object(),new Object(),new Object()};
    动态的：
    int[] arr = new int[4]; // 4个长度，每个元素默认值0
    Object[] objs = new Object[4];// 4个长度，每个元素默认值 null
1.3、一维数组的遍历
    for(int i = 0, i < ary.length, i++){
        System.out.println(ary.[i]);
    }
1.4、二维数组的静态初始化和动态初始化：
    静态的：
    int[][] array = {
                     {1,2,3},
                     {2,3,4},
                     {3,4,5}
                    };
    Object[][] object = {
                         {new Object{}},
                         {new Object{}},
                         {new Object{}}
                        };
    动态的：
    int[][] array = new int[3][4];
    Object[][] object = new Object[3][4];

1.5、遍历二维数组：
     for(int i = 0, i < array.length, i++){
        for(int j = 0, j < array.[i].length, j++){
            System.out.print(array.[i][j]);
        }
        //换行：
        System.out.println();
     }
 */
public class SummaryForArray {
}
