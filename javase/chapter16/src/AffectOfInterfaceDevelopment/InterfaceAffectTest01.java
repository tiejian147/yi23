/*
*
* */




public class InterfaceAffectTest01 {
    public static void main(String[] args) {
        //创建厨师对象--中餐
        FoodMenu cooker1 = new ChinaCooker();

        //创建顾客对象
        Customer c1 = new Customer(cooker1);

        //创建厨师对象--西餐
        FoodMenu cooker2 = new AmericaCooker();

        //创建顾客对象
        Customer c2 = new Customer(cooker2);


        //顾客点菜
        c1.order();
        c2.order();
    }
}
