package chapter16;

public class EatingTest {
    public static void main(String[] args) {
//        创建厨师对象
        Foodmenu f1 = new ChineseCooker();
        Foodmenu f2 = new AmericanCooker();
//        创建顾客对象
        Customer c1 = new Customer();
        c1.setFoodmenu(f1);
//        顾客点菜
        c1.order();
    }
}
