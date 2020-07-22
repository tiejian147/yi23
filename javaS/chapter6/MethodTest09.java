public class MethodTest09{
    public static void main(String[] args){
        //调用方法可以写两行
        int result = sum(100, 200);
        System.out.println(result);

        //还可以写的更简洁一些：
        System.out.println(sum(1000, 2000));

        //声明一个变量调用m();方法，并打印输出
        boolean flag = m();
        if(flag){
            System.out.println(flag);
        }
        //精简上面的代码
        if(m()){
            System.out.println("真的。。。。");
        }


    }
    //编写一个返回布尔类型的方法
    public static boolean m(){
        return true;
    }

    //编写一个求和的方法
    public static int sum(int x,int y){
        return x + y;
    }
}