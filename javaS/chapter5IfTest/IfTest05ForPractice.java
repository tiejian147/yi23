
public class IfTest05ForMe {

    public static void main(String[] args){

        System.out.println("这个程序是来自小媳妇儿的题目：");
    //先声明几个变量：
    int season ;
    int tem ;
    int weather;

    // 然后创建键盘扫描对象
    java.util.Scanner s = new java.util.Scanner(System.in);

    System.out.println("请输入现在是什么季节：1：冬天，2：夏天");

    season = s.nextInt();

    if(season == 1){//如果现在是冬季

        System.out.println("请输入现在的气温，整数值");
        tem = s.nextInt();//等待用户输入气温

        if(tem > 0){//如果现在是零上的气温
            System.out.println("现在的气温可以穿大衣~~");
        }else{
            System.out.println("现在的气温需要穿羽绒服~~~~");
        }

    }else if(season == 2){//如果现在是夏季

        System.out.println("请说出现在是什么天气1：下雨，2：晴天");
        weather = s.nextInt();//等待用户输入天气值

        if(weather == 1){//如果现在是下雨天
            System.out.println("下雨啦，请穿雨鞋出门呀~~~");
        }else if(weather == 2){
            System.out.println("天气不错，可以穿布鞋出门~~~");
        }
    }
    else{
        System.out.println("您输入的数值不合法~~");
    }

    }

}