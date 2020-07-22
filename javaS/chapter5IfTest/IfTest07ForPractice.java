/*
    需求：输入三个整数，然后从大到小进行排列
*/

public class IfTest05{
    public static void main(String[] args){
        //声明三个变量
        int biggest;
        int middle;
        int smallest;

        // 然后创建键盘扫描对象
        
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.println("请输入第一个数字：");
        biggest = s.nextInt();

        System.out.println("请输入第二个数字：");
        middle = s.nextInt();

        System.out.println("请输入第三个数字：");
        smallest = s.nextInt();

        if(biggest > middle && middle > smallest){
            System.out.println("三个数字从大到小依次为：" + biggest + "," + middle + "," + smallest);
        }

·
        
    }
}