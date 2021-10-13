package chapter19;
//遍历二位数组
public class ArrayTest11 {
    public static void main(String[] args) {
//        二维数组
        String[][] s1 = {
                {"张三","李四","王五","赵柳"},
                {"rose","jack","joke","hello"},
                {"玉米","黄瓜","豆腐","饺子"}
        };
//        遍历
        for (int i = 0; i < s1.length; i++) {
//            此时拿到了一维数组的遍历
            String[] s2 = s1[i];
//            System.out.println(s2);
//            继续遍历
            for (int j = 0; j < s2.length; j++) {
                System.out.print(s2[j] + " ");
            }
//            输出换行符
            System.out.println();
        }
    }
}
