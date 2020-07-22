/*
    这个需求同样来自小媳妇儿：

    午休时间，如果少于30分钟：
            如果和同事聊天
                如果聊到了王凯：聊天内容优
                如果聊到了吃喝玩乐：聊天内容良好；
                如果聊到了化妆品：聊天内容非常优秀；
            还可以看电视剧；
            还可以睡觉；
    如果多于30分钟：
            如果去商场
                去商场买东西；
                去商场四楼溜溜
                如果去地下超市
                    如果买东西
                        买吃的
                        买用的
            如果去大街溜达
                如果去百盛方向
                    如果去百盛商城
                        逛逛柜台，纯逛
                如果去公园方向
                    赏花，晒太阳
                如果去阜成门方向
                    买蛋挞：
                    买coco
                    买牛肉饼
                        如果价格>10，不买了
                        如果价格=5，买2个
                        如果价格=3，买5个
*/
public class IfTest06ForMe {
    public static void main(String[] args){

        System.out.println("欢迎来到小媳妇儿方夫人的午休时光！！！");

        //声明几个变量
        //声明午休时间的变量
        int noonTime;

        //声明活动项目的变量：
        int scheduling;

        //声明聊天的变量
        int talking;
       
        //声明商场的变量
        int market;

        //声明去街道的变量
        int Street;

        //声明百盛商场的变量
        int baishengMall;

        //声明在公园的变量
        int inPark;

        //声明去阜成门的变量
        int fuchengmen;

        //声明牛肉饼单价的变量
        int beefPiePrice;



        // 然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.println("请问今天中午的午休时间是否大于30分钟？0：是，1：不是");
        noonTime = s.nextInt();

        if(noonTime == 1){//如果午休少于30分钟

            System.out.println("请问现在想进行什么项目活动1：聊天，2：看电视剧，3：午休半小时");
            //等待用户输入活动安排
            scheduling = s.nextInt();

            //如果找同事聊天
            if(scheduling == 1){
                System.out.println("请问方夫人想找哪位同事聊天1：A，2：B，3：C");
                //等待用户输入聊天对象
                talking = s.nextInt();
                
                if(talking == 1){
                    //找A聊天
                    System.out.println("夫人和同事A聊到了王凯，优~~~");
                }else if(talking == 2){
                    //找B聊天
                    System.out.println("夫人和同事B聊到了吃喝玩乐，良~~~~~");
                }else if(talking == 3){
                    //找C聊天
                    System.out.println("夫人和同事C聊到了化妆品呢，优秀~~~~~~");
                }
                else{
                    System.out.println("没有这个选项哦，夫人");
                }
            }else if(scheduling == 2){
                //如果看电视剧
                System.out.println("夫人要用平板看电视剧和综艺啦，小心老板看到哦~~~");
            }else if(scheduling == 3){
                //如果选择午休
                System.out.println("夫人要小憩一会儿，请盖好毛巾毯不要着凉哦~~~");
            }else{
                System.out.println("三个选项还不够吗，要啥自行车呀~~~");
            }
        }else if(noonTime == 0){
            //如果午休时间多于30分钟
            System.out.println("请夫人选择要去什么地方呀4：去商场，5：去街上溜达");
            scheduling = s.nextInt();

            if(scheduling == 4){
                //如果去商场
                System.out.println("请夫人选择去商场做什么呀1：买东西，2：去四楼遛，3：去地下超市");
                
                //输入去商场的目的地
                market = s.nextInt();

                if(market == 1){
                    //如果去买东西
                    System.out.println("夫人选择了去商场买东西，请不要把钱花光光哦~~~~");
                }else if(market == 2){
                    //选择去四楼
                    System.out.println("夫人去商场的四楼做什么呢，难道彭于晏在那里？");
                }else if(market == 3){
                    //选择去地下超市
                    System.out.println("夫人去地下超市看三文鱼吗？");
                }else{
                    System.out.println("商场的选项就这么多啦~~~");
                }


            }else if(scheduling == 5){
                //如果去大街溜达
                System.out.println("请问夫人要去街上哪个方向呀1：百盛商场方向，2：公园方向，3：阜成门方向");
                //等待夫人输入方向值
                Street = s.nextInt();

                if(Street == 1 ){
                    //去百盛商场方向
                    System.out.println("请问夫人去百盛1：柜台，2：纯逛");
                    //等待夫人输入百盛的目的地
                    baishengMall = s.nextInt();

                    if(baishengMall == 1){
                        //选择了柜台
                        System.out.println("夫人，专柜虽好，敢花钱就揍你！！");
                    }else if(baishengMall == 2){
                        //选择了纯逛
                        System.out.println("夫人真棒，选择纯逛最健康~~");
                    }else{
                        System.out.println("夫人，百盛商场没有其他的选项了哦~~");
                    }



                }else if(Street == 2){
                    //选择了公园方向
                    System.out.println("请夫人选择在公园1：看花草树木，2：晒太阳");
                    //等待夫人输入在公园的数值
                    inPark = s.nextInt();
                    
                    if(inPark == 1){
                        //选择赏花
                        System.out.println("夫人在公园多看绿色，对眼睛有很好的保护作用呢~~");
                    }else if(inPark == 2){
                        //选择晒太阳
                        System.out.println("夫人在公园晒太阳，注意事先涂抹防晒霜哦~~");
                    }else{
                        System.out.println("公园里不能干别的了哦~~");
                    }

                }else if(Street == 3){
                    //选择了阜成门方向
                    System.out.println("请夫人选择要去阜成门1：买蛋挞，2：买coco，3：买牛肉饼");
                    //等待夫人选择阜成门选项
                    fuchengmen = s.nextInt();
                    if(fuchengmen == 1){
                        //选择买蛋挞
                        System.out.println("澳门葡式蛋挞，夫人值得拥有!");

                    }else if(fuchengmen == 2){
                        //选择买coco
                        System.out.println("夫人，coco好喝，但不要贪杯哦~~~");
                    }else if(fuchengmen == 3){
                        //选择买牛肉饼
                        System.out.println("牛肉饼多少钱一个呀1--10元；2--5元，3--3元");
                        //等待夫人输入价格
                        beefPiePrice = s.nextInt();

                        if(beefPiePrice == 1){
                            //选择了10元
                            System.out.println("夫人，牛肉饼有点小贵了，不买了吧~~~");
                        }else if(beefPiePrice == 2){
                            //选择了5元
                            System.out.println("夫人，牛肉饼的价格正合适哦，买两个吧");
                        }else if(beefPiePrice == 3){
                            //选择了3元
                            System.out.println("夫人，牛肉饼价格超值哦，来5个！！！");
                        }else{
                            System.out.println("没有别的价格选项了");
                        }

                    }else{
                        System.out.println("提供三样了还不够你买呀夫人？");
                    }
                }else{
                    System.out.println("要不夫人回去吧，没别的地了");
                }
            }else{
                System.out.println("除了商场和街上，你还想去哪？");
            }
        }else{
            System.out.println("没有更多选项啦~~~~~~~~~~~~~~");
        }



    }
}