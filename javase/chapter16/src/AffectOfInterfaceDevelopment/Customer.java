/*
*   顾客类：
*       在这里要有菜单的私有属性，并编写构造方法和点菜的方法
* */

public class Customer {
    //私有属性
    private FoodMenu foodmenu;

    //无参构造方法
    public Customer() {
    }

    //有参构造方法

    public Customer(FoodMenu foodmenu) {
        this.foodmenu = foodmenu;
    }

    //setter and getter

    public FoodMenu getFoodmenu() {
        return foodmenu;
    }

    public void setFoodmenu(FoodMenu foodmenu) {
        this.foodmenu = foodmenu;
    }

    //点菜的方法
    public void order(){
        //先拿到菜单
        FoodMenu fm = this.getFoodmenu();
        fm.TomatoWithEggs();
        fm.MeatLikeFish();
////        FoodMenu fm = this.getFoodmenu().TomatoWithEggs();
//        foodmenu.MeatLikeFish();
//        foodmenu.TomatoWithEggs();

    }
}
