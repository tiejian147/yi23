
/*
* 2、请定义一个交通工具（vihicle）的类 其中有属性： 速度（speed） 体积（size）等等 
方法： 移动move()
 * 设置速度setSpeed(int speed) 加速speedUp() 减速speedDown()
 * 最后再测试类Vehicle中的main()中实例化一个交通工具对象。 
 * 并通过方法给她初始化speed，size的值并且打印出来。
 * 另外调用加减速的方法对速度进行改变。
* */
public class VihicleTest {
    public static void main(String[] args) {
        // vihicleTest v2 = new vihicleTest();
        vihicle v1 = new vihicle();
        //设置车速为100
        v1.setSpeed(100);
        //设置车长为4米
        v1.setSize(4);
        //调用get方法获取车长、车速
        System.out.println("车长为：" + v1.getSize() + "米");
        System.out.println("车速为：" + v1.getSpeed() + "迈");

        //调用加速的方法
        v1.speedUp(50);
        System.out.println("车速为：" + v1.getSpeed() + "迈");

        //调用减速的方法
        v1.speedDown(160);
        System.out.println("车速为：" + v1.getSpeed() + "迈");


        


    }




}

 class vihicle{
    //设置私有属性speed
    private int speed;

    //设置私有属性size
    private  int size;

    //编写无参构造方法
    public vihicle() {
    }

    //编写有参数的构造方法


    public vihicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    //编写getter 方法


    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    //编写setter方法


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //构造移动的方法
    public void move(){

    }

    //编写加速的方法
    public void speedUp(int speedUpNum){
        this.speed = speedUpNum + this.getSpeed();
        if(speed > 300){
            this.speed = 300;
            System.out.println("车速已经达到最大值" + this.speed + "迈");
            
        
        }
    }

    //编写减速的方法
    public void speedDown(int speedDownNum){
        this.speed =  this.getSpeed() - speedDownNum;
        if(speed < 0){
            this.speed = 0;
            System.out.println("车速已经达到最小值" + this.speed + "迈");
            System.exit(0);
            
        
        }

    }




}