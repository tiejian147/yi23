package day27.Weapon;
/*
物资飞机   只能移动，不能攻击
 */
public class Wuzifeiji extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("物资飞机起飞");
    }
}
