package chapter13;

import javafx.scene.control.Tab;

/*
多态：
    多态表示多种形态：
        编译的时候一种形态；
        运行的时候一种形态；
程序员要养成一个好习惯：
    任何时候，当需要向下转型的时候，一定要使用instanceof 运算符进行判断（这是规范要求），这样可以很好的避免报错；
 */
public class HouseCareTest {
    public static void main(String[] args) {
        HouseCare h1 = new HouseCare();
        h1.forHouse();

        Table t1 = new Table();
        t1.forHouse();

        Chair c1 = new Chair();
        c1.forHouse();

//        那么多态怎么写呢？
        System.out.println("------多态分割线------");
        HouseCare t2 = new Table();
        t2.forHouse();

        HouseCare c2 = new Chair();
        c2.forHouse();
//        c2.forSit();  这个方法是不能调用的
//        如果要调用，需要向下转型，需要强制类型转换
        Chair c3  = (Chair)c2;
        c3.forSit();//此时这个方法就可以调用了，c2转换成了c3

        HouseCare t4 = new Table();
//        Table t3 = (Table)c4;//类型转换异常：java.lang.ClassCastException
//        t3.forSit();
//        那么如何避免呢？ 用 (a instanceof 类型) 判断一下
        System.out.println(t4 instanceof Chair);//false
        if (t4 instanceof Chair){
            Chair t3 = (Chair) t4;
            t3.forSit();
        }
    }
}

class HouseCare{
    public void forHouse(){
        System.out.println("房子里的家具");
    }
}

class Table extends HouseCare{
    public void forHouse(){
        System.out.println("房子里的家具有桌子");
    }
}

class Chair extends HouseCare{
    public void forHouse(){
        System.out.println("房子里的家具有椅子");
    }

    public void forSit(){
        System.out.println("这个椅子可以坐");
    }
}
