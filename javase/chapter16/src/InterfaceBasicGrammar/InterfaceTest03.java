/*
*   接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
*
*       对于计算机来说，一个机箱上有多个接口，一个接口是接键盘的，
*       一个接口是接鼠标的，一个接口是接电源的，一个接口是接显示器的.....
*
*       重点结论：
*           （五颗星*****）：一个类可以实现多个接口。
*
*       这种机制弥补了java中的哪个缺陷？
*           java中类和类之间只支持单继承。实际上单继承是为了简单而出现的。
*           现实世界中存在多继承，java中的接口弥补了单继承带来的缺陷。
* */

public class InterfaceTest03 {
    public static void main(String[] args) {

    }
}

//接口和接口之间支持多继承
interface D{
    void m1();
}

interface E{
    void m2();
}

interface F{
    void m3();
}

//接口G继承上面多个接口
interface G extends D,E,F{

}
//------------------------------------


interface Aone{
    void m1();
}

interface Bone{
    void m2();
}

interface Cone{
    void m3();
}

class Done implements Aone,Bone,Cone{

    //实现Aone接口中的m1()方法
    public void m1(){

    }

    //实现Bone接口中的m2()方法
    public void m2(){

    }

    //实现Cone接口中的m3()方法
    public void m3(){

    }
}