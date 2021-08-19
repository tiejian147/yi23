package chapter16;

public class AmericanCooker implements Foodmenu {
//    实现菜单接口，那么就要重写接口中的方法
    @Override
    public void XiHongShiChaoJiDan() {
        System.out.println("西餐厨师做了西红柿炒鸡蛋");
    }

    @Override
    public void YuXiangRouSi() {
        System.out.println("西餐厨师做了鱼香肉丝");
    }
}
