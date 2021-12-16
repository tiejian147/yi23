package chapter20.Enum02;
/*
当调用方法，结果返回多于两种情况时，要使用枚举类型

总结：
    1、每局是一种引用数据类型；
    2、枚举的定义和语法：
    enum 枚举类型名{
        枚举值1,枚举值2
    }
    3、结果只有两种情况的，建议使用布尔类型；
        结果大于两种情况的，且还是可以一枚一枚列举出来的，建议使用枚举类型；
        例如：颜色、四季、星期等。
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result result = device(10,0);
        System.out.println(result == Result.SUCCESS? "计算成功" : "计算失败");
    }

    public static Result device(int num1, int num2){
        try {
            int num3 = num1 / num2;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS,FAIL
}
