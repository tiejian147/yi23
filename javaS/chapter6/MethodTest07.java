/*
    分析以下代码是否会报错？
*/

public class MethodTest07{
    public static void main(String[] args){
        //调用m()方法，并声明一个结果变量输出
        int result = m();
        System.out.println(result);//1

        //调用x()方法；
        int result1 = x(true);
        System.out.println("result1：" + result1);

        //再次调用x();方法
        int result2 = x(false);
        System.out.println("result2：" + result2);
    }
    //编译报错：缺少返回语句
    /*
    public static int m(){//编译器不负责运行程序，编译器只讲道理
        boolean flag = true;
        //对于编译器来说，编译器只知道flag变量是boolean类型
        //编译器会任务flag有可能是false，有可能是true
        if(flag){
            //编译器认为：以下这行代码可能会执行，当然也可能不会执行
            //编译器为了确保程序不出现任何异常，所以编译器说：
            //缺少返回语句
            return 1;
        }
    }
    */
    //如何修改程序？
    /* 方式1 ：不过这样写会有些啰嗦
    public static int m(){
        boolean flag = true;
        if(flag){
            return 1;
        }else{
            return 0;
        }
    }
    */

    /* 方式2：该方式2 其实是方式1的变形。
    return 语句一旦执行，所在的方法就会结束。
    public static int m(){
        boolean flag = true;
        if(flag){
            return 1;
        }
        return 0;
    }
    */
    /*
    //在同一个域当中，return语句下面不能再编写其他代码，编写之后编译报错；
    public static int m(){
        boolean flag = true;
        if(flag){
            return 1;
            //错误：无法访问的语句
            //System.out.println("hello");
        }
        //放在这里就不会编译报错：
        //这行代码和上面的代码hello的区别是：不在同一个作用域当中。
        System.out.println("hello");
        return 0;
        //这里也会报错：无法访问的语句；
        //System.out.println("hello");
    }
    */
    public static int m(){
        boolean flag = true;
        return flag ? 1 : 0;
        
    }

    public static int x(boolean flag ){
        //三目运算符，如果是true 那么就返回1 ，反之返回0
        return flag ? 1 : 0;
        
    }
}