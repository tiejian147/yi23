/*
    需求：输入月份，获取相对应的季节
    3~5：春季
    6~8：夏季
    9~11：秋季
    12~2：冬季
*/

public class IfTest04 {

    public static void main(String[] args) {

        // 声明一个整数型的变量
        int season;

        // 然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.println("请输入要查询的月份：");

        season = s.nextInt();

        if (season > 12 || season < 1) {
            // 先给一个不可取的数值范围
            System.out.println("您输入的数字不合法");
        } else if (season >= 3 && season <= 5) {
            // 判断春季的月份
            System.out.println("这个月份属于春季");
        } else if (season >= 6 && season <= 8) {
            // 判断夏季的月份
            System.out.println("这个月份属于夏季");
        } else if (season >= 9 && season <= 11) {
            // 判断秋季的月份
            System.out.println("这个月份属于秋季");
        }
        // else if (season == 12 || season == 1 || season == 2){
        // //判断冬季的月份
        // System.out.println("这个月份属于冬季");
        // }
        else {
            System.out.println("这个月份属于冬季");
        }

    }

}