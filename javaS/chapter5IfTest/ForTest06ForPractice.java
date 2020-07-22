/*
    for循环语句的练习题：
    2、计算1000以内所有不能被7整除的整数之和；
*/
public class ForTest06ForPractice {
    public static void main(String[] args){
        //声明一个总和的变量
        int sum =0;
        
        for(int num = 0;num <= 1000; num++){
            if(num %7 != 0){//如果num除以7求余数不为0
                sum = sum + num;
                System.out.println("这里打印的是所有不能被7整除的数字：" + num);
            }
            // num = num %7 !=0;
            // System.out.println("这里打印的是所有不能被7整除的数字：" + num);
            
        }
        System.out.println("这里打印的是所有不能被7整除的数字的总和" + sum);


        //用for画一个圣诞树
        for(int a =0 ;a <1; a++){
            System.out.println(" *");
            
        }
        for(int b =0 ;b <2; b++){
            System.out.println("*");
            
        }
        for(int c =0 ;c <3; c++){
            System.out.println("*");
        }
        //我这个没有画出来


//      答案：三部分 行 列 每行递减的空格数量
    for(int ln = 0;ln <5;ln++){  //外层行数
        for(int space = 5;space>ln;space--){   //第一样前面五个空格，第二行前面四个，这个循环执行完了去下一个循环
        System.out.print(" ");   //print  去掉ln  同行输出
        }
        for(int row =0;row<=ln;row++){    //内层列数 
        System.out.print("* ");  
        }
        System.out.println();
    }
    
    }
}