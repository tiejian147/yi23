/*
    通过方法重载，方法重复利用，完成以下功能
        *定义一个方法，该方法可以选出两个int类型中较大的数据，返回值是较大的数字。
*/



public class RecursionTest06Homework {
    public static void main(String[] args){

        // compare(19, 30);
        System.out.println("较大的数字是：" + compare(45, 30));
    }
    
    //比较两个数字大小的方法
    public static int compare(int num1, int num2){
        //作比较，找大的那个
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    //比较三个数字大小的方法
    public static int compare(int num1, int num2, int num3){
        //作比较，找大的那个
        if(num1 > num2 && num1 > num3){
            return num1;
        }else{
            return num2;
        }
    }
}