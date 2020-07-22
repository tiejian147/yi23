/* 
    for循环嵌套for循环
*/
public class ForTest04{
    public static void main(String[] args){

        for(int i = 1; i <= 10; i ++){//共循环10次
            //循环体重可以编写其他的控制语句
            //控制语句可以嵌套使用
            //控制语句可以是：if、if..else、switch、for、while、do..while

            //内层循环，内层循环中的变量名和外层循环中的变量名不能重名
            /*
            for(int i = 100;;){

             }
            */
            System.out.println("i -- > " + i );

            //这里是循环体，无论这个循环体当中编写了什么样的代码，这堆代码也
            //需要执行10遍；
            for(int j = 0; j < 3; j++){
                System.out.println("看j打印多少遍：" + j);
            }

        }


        for(int a = 0; a < 10; a++){
            System.out.println("Bigin");

            for(int k = 0; k < 1 ; k++){
                System.out.println("这里打印k值一遍：" + k);
            }

            System.out.println("Over");
        }
        /*
        打印结果：
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        Bigin
        这里打印k值一遍：0
        Over
        */

    }
}