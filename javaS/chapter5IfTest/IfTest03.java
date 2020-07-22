/*
    再来一个需求：
    判断当前的天气：
        当外面下雨的时候：
            带雨伞：
                当性别为男：带一把大黑伞；
                当性别为女：带一把小花伞；
        当外面是晴天的时候：
            判断天气的温度：
                当气温为30度以上：
                    当性别为男：戴墨镜；
                    当性别为女：擦防晒霜
*/

public class IfTest03 {
    public static void main(String[] args) {

        // 首先声明天气的变量和性别的变量
        int weather;
        int sex;
        int temperature;

        // 然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("请输入您的性别是1：男生；2：女生----");

        // 等待用户输入性别值
        sex = s.nextInt();

        System.out.print("请先说明今天是1:下雨；2：晴天----");

        // 等待用户输入天气答案：
        weather = s.nextInt();

        if (weather == 1) { // 判断天气要是雨天，那么就走带伞的逻辑

            if (sex == 1) { // 如果是男生
                System.out.println("您需要带一把大黑伞。");
            } else { // 如果是女生
                System.out.println("您需要带一把小花伞");
            }
        } else if (weather == 2) { // 如果是晴天
            System.out.println("气温温度是：");

            // 等待用户输入温度值
            temperature = s.nextInt();
            if (temperature >= 30) {
                //再次判断性别来走分支
                if (sex == 1) { // 如果是男生
                    System.out.println("您需要佩戴太阳镜出门。");
                } else { // 如果是女生
                    System.out.println("您需要涂抹防晒霜出门。");
                }

            } else {
                System.out.println("今天的天气很好，可以出门逛逛。");
            }

        } else {
            System.out.println("您输入的数值不合法！");
        }

    }
}