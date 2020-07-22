/*
    从网上找一些if语句的练习题，来巩固自己的知识
    练习题1；
    大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：
    高： 180cm以上；
    富：财富1千万以上；
    帅：是。
 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
 如果三个条件都不满足，则：“不嫁！” 
*/
public class IfTest04ForMe{

    public static void main(String[] args){

        System.out.println("这个系统来让你选到自己的如意郎君！");

        //声明三个变量，身高、财富、颜值
        double tall ;
        double money;
        int goodLook;

        //准备扫描键盘输入
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("男方身高多高啊，填整数，单位cm：");
        tall = s.nextInt();

        System.out.print("对方家里有多少存款啊，填正整数，单位元：");
        money = s.nextInt();

        System.out.print("男方帅不帅啊0：帅，1：不帅------");
        goodLook = s.nextInt();


        if(tall >= 180 && money > 100000 && goodLook == 0){
            //三个条件都满足，一定嫁，肯定是true
            System.out.println("你一定要嫁给他!!!");
        }else if (tall >= 180 || money > 100000 || goodLook ==0){
            //以上满足一个条件，那么就是true 
            System.out.println("嫁吧，比上不足，比下有余。");
        }else if(tall < 180 && money < 100000 && goodLook == 1){
            //三个条件都不满足，那就不能嫁人了
            System.out.println("绝对不能嫁给他哦~~~");
        }



    }

}
