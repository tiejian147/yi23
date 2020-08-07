package day27.Weapon;

/**
 * 添加武器抛异常的方法
 */
public class AddWeaponException extends Exception{
    /**
     * 无参的构造方法
     */
    public AddWeaponException(){

    }

    /**
     * 有参数的构造方法
     * @param s
     */
    public AddWeaponException(String s){
        super(s);
    }
}
