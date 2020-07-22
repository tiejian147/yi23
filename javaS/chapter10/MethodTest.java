public class MethodTest{
    public static void main(String[] args){
        //调用doSome();方法
        MethodTest.doSome();

        //在同一个类当中，调用方法可以讲类名省略
        doSome();

        //但是用“类名.”的方式访问“实例方法”
        //会报错:无法从静态上下文中引用非静态方法
        //MethodTest.doOther();

        //需要先创建对象
        MethodTest mt = new MethodTest();
        //然后通过“引用.”的方式 访问 实例方法
        mt.doOther();


    }

    //带有static
    public static void doSome(){
        System.out.println("do some~~");
    }
    //这个方法没有static，这样的方法被称为：实例方法（对象方法，对象级别的方法）
    //这个没法解释，现在死记硬背
    public void doOther(){
        System.out.println("do Other!");
    }
}