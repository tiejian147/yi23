package chapter16;

public class ChineseCooker implements Foodmenu {
//    重写菜单接口中的方法
    @Override
    public void XiHongShiChaoJiDan() {
        System.out.println("中餐厨师做了西红柿炒鸡蛋");
    }

    @Override
    public void YuXiangRouSi() {
        System.out.println("中餐厨师做了鱼香肉丝");
    }
}
