/*

*/


public class ForTest05 {
    public static void main(String[] args){

        for(int i = 1; i <= 5; i++){
            System.out.println("开始：");

            for(int j = 1; j <= 5; j++){
                System.out.println(i * j);
            }
            System.out.println("结束");
        }
        /*打印结果：
        开始：
        1*1
        1*2
        1*3
        1*4
        1*5
        结束
        开始：
        2*1
        2*2
        2*3
        2*4
        2*5
        结束
        开始：
        3*1
        3*2
        3*3
        3*4
        3*5
        结束
        开始：
        4*1
        4*2
        4*3
        4*4
        4*5
        结束
        开始：
        5*1
        5*2
        5*3
        5*4
        5*5
        结束
        */
        
    }
}