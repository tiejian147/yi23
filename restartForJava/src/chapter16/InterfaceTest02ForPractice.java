package chapter16;

public class InterfaceTest02ForPractice {
    public static void main(String[] args) {
        CTest ct = new DTestImpl();
        ct.doSome();
    }
}

interface CTest{
//    接口里面只有两样东西：1、常量
    public static final String COUNTRY = "中国";
//    2、抽象方法
    public abstract void doSome();
}

class DTestImpl implements CTest{
//    实现接口CTest，必须要对抽象类中的抽象方法进行重写
    @Override
    public void doSome() {
        System.out.println("CTest中的方法重写");
    }
}