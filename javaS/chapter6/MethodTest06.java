/*
    break; 语句和return; 语句有什么区别？
        * 不是一个级别。
        * break; 用来终止switch和离它最近的循环；
        * return; 用来终止离它最近的一个方法。
*/

public class MethodTest06{
    //main方法的返回值类型是void，表示没有返回值；
    public static void main(String[] args){
        for(int i = 0 ; i <= 10; i++){
            if(i == 5){
                //break;//终止for循环
                return;//终止当前的方法，和break;不是一个级别的；
                //return 10;//这里这样写会报错的
            }
            System.out.println("i =" + i);
        }
        System.out.println("hello world");
    }
}