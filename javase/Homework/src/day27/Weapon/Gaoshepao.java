package day27.Weapon;
/*
高射炮能开炮，不能移动
 */
public class Gaoshepao extends Weapon implements AttackAble{
    @Override
    public void shoot() {
        System.out.println("高射炮开炮~~~~");
    }
}
