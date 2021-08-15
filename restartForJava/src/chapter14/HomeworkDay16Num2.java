package chapter14;

public class HomeworkDay16Num2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setSpeed(50);
        v1.setSize(100);
        System.out.println("体积为：" + v1.getSize() + "立方米");
        System.out.println("速度为：" + v1.getSpeed() + "公里/时");

//        调用加速和减速的方法
        v1.speedAdd(10);
        v1.speedSub(10);
    }
}
class Vehicle{
//    建立两个属性：速度和体积
    private int speed;
    private int size;
//   构造器：有参和无参
    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }
//    setter and getter

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
//    设置加速的方法
    public void speedAdd(int speedNumAdd){
        this.setSpeed(this.getSpeed() + speedNumAdd);
        System.out.println("加速了：" + this.getSpeed() + "公里/时");
    }
//    设置减速的方法
    public void speedSub(int speedNumSub){
        this.setSpeed(this.getSpeed() - speedNumSub);
        System.out.println("减速了：" + this.getSpeed() + "公里/时");
    }
}
