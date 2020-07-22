/*
    使用while循环，输出1-10  
 */


public class WhileTest02 {
    public static void main(String[] args){

        int i =1;
        while(i <= 10){
            //i++; 这是我自己写的顺序，在这个位置上写了循环体,
            //如果i=1，那么这里最开始输出的数字就是2；前提是括号里写<10
            System.out.println("数字为：" + i);
            //这是视频给的位置：先打印一个i，i=1，然后再相加；上面
            //的括号给的是<= 10
            i++;

        }
        //此时i的值为11；
        System.out.println("最后i变量的值为：" + i);

        int j = 10;
        while(j > 0){
            System.out.println(j--);//10 9 8 7 6 5 4 3 2 1
            System.out.println("-->" + j);//9 8 7 6 5 4 3 2 1
        }
        System.out.println("最后j变量的值为：" + j);//0


        int k = 10;
        while(k >= 0){
            System.out.println(--k);//9 8 7 6 5 4 3 2 1  0 -1
            System.out.println("-->" + k);//9 8 7 6 5 4 3 2 1  0 -1
        }
        System.out.println("最后j变量的值为：" + k);// -1

    }
}