package chapter16;

public class Customer {
//    顾客 has a 菜单，所以定义菜单属性
    Foodmenu foodmenu;
//  构造器，有参和无参
    public Customer() {
    }

    public Customer(Foodmenu foodmenu) {
        this.foodmenu = foodmenu;
    }
//    setter and getter

    public Foodmenu getFoodmenu() {
        return foodmenu;
    }

    public void setFoodmenu(Foodmenu foodmenu) {
        this.foodmenu = foodmenu;
    }

//    创建一个点菜的方法
    public void order(){
        foodmenu.XiHongShiChaoJiDan();
        foodmenu.YuXiangRouSi();
    }
}
