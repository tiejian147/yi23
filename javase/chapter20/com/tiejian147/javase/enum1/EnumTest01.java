package javase.chapter20.com.tiejian147.javase.enum1;

/**
 * 总结：
 *      1、枚举是一种引用数据类型；
 *      2、枚举类型怎么定义，语法是：
 *          enum 枚举类型名{
 *              枚举值1，枚举值2，枚举值3...
 *          }
 *      3、结果只有两种情况的，建议使用布尔类型，结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型；
 *          例如：颜色，四季，星期等，都可以使用枚举类型；
 */

/**
 * 下面的案例还没有使用java中的枚举，分析以下程序，在设计方面有什么缺陷？
 */
public class EnumTest01 {
    public static void main(String[] args) {
//        System.out.println("这是没有调用方法的：" + 10 / 0);//java.lang.ArithmeticException: / by zero
//        调用下面的方法，然后用三目运算符打印结果
        System.out.println(divide(2, 0) == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，返回0表示失败
     */

    /**
     * 设计缺陷：返回的类型有问题，应该返回布尔类型
     * public static int divide(int a, int b){
     * try {
     * int c = a / b;
     * //            程序执行到此处表示以上代码没有发生异常，表示执行成功
     * return 1;
     * }catch (Exception e){
     * //            程序执行到此处表示以上程序出现了异常！
     * //            表示执行失败
     * return 0;
     * }
     * <p>
     * <p>
     * }
     */

/**   改成返回值类型为布尔值
    public static boolean divide(int a, int b) {
        try {
            int c = a / b;
//            程序执行到此处表示以上代码没有发生异常，表示执行成功
            return true;
        } catch (Exception e) {
//            程序执行到此处表示以上程序出现了异常！
//            表示执行失败
            return false;
        }
    }
 */

    /**
     * 思考：以上的这个方法设计没毛病，挺好，返回true和false表示两种情况，
     * 但是在以后的开发中，有可能遇到一个方法的执行结果可能包括三种情况，四种
     * 情况，五种情况不等，但是每一个都是可以数清楚的，一枚一枚都是可以列举出来
     * 的，这个布尔类型就无法满足需求了，此时需要使用java语言中的枚举类型。
     */

    public static Result divide(int a, int b) {
        try {
            int c = a / b;
//            程序执行到此处表示以上代码没有发生异常，表示执行成功
            return Result.SUCCESS;
        } catch (Exception e) {
//            程序执行到此处表示以上程序出现了异常！
//            表示执行失败
            return Result.FAIL;
        }
    }
}

/**
 * 枚举：一枚一枚可以列举出来的，才建议使用枚举类型
 * 枚举编译之后也是生成class文件
 * 枚举也是一种引用数据类型
 * 枚举中的每一个值可以看做是常量
 */
enum Result{
    /**
     * SUCCESS 是枚举Result类型中的一个值
     * FAIL 是枚举Result类型中的一个值
     * 枚举中的每一个值，可以看做是"常量"
     */
    SUCCESS,FAIL
}
