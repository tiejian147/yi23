package day27.Weapon;


public class WeaponTest {
    public static void main(String[] args) {
//        构建一个军队
        Army army = new Army(4);

//        创建武器对象
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Wuzifeiji wuzifeiji = new Wuzifeiji();
        Wuzifeiji wuzifeiji2 = new Wuzifeiji();
        Gaoshepao gaoshepao = new Gaoshepao();


//        添加武器
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuzifeiji);
            army.addWeapon(gaoshepao);
            army.addWeapon(wuzifeiji2);
        } catch (AddWeaponException e){
            System.out.println(e.getMessage());
        }

//        让所有可移动的移动
        army.attackAll();

//        让所有可攻击的攻击
        army.moveAll();

        AddWeaponException addWeaponException = new AddWeaponException("shangxian");
        System.out.println(addWeaponException.getMessage());

    }
}
