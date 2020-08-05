package day27.Weapon;

/**
 * 战斗机，能移动也能攻击
 */
public class Fighter extends Weapon implements AttackAble,Moveable{
    @Override
    public void shoot() {
        System.out.println("战斗机开炮");
    }

    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }
}
