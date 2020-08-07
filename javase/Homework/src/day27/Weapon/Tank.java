package day27.Weapon;

/*

 */
public class Tank extends Weapon implements AttackAble,Moveable{
    @Override
    public void shoot() {
        System.out.println("坦克向前移动");
    }

    @Override
    public void move() {
        System.out.println("坦克开炮！！！！！");
    }
}
