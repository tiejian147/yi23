/*
    方法递归？
    1、什么是方法递归？
        方法自己调用自己，就是方法递归。
    2、当递归时，程序没有结束条件，一定会发生栈内存溢出错误：StackOverflowError
        所以：递归必须要有结束条件。（这是一个非常重要的知识点）
        JVM发生错误后就只有一个结果：那就是退出JVM。

    3、假设递归时有结束条件的，就一定不会发生栈内存溢出错误吗？
        假设结束条件是对的，是合法的。递归有时也会出现栈内存溢出错误。
        因为有可能递归太深，栈内存不够了。因为一直在压栈。
    4、不建议在实际开发中轻易的选择递归，能用for循环while循环代替的，尽量使用循环来做。
        因为循环的效率高，耗费的内存少。递归耗费的内存大，另外递归的使用不当，会导致
        JVM死掉。（但在极少数的情况下，不用递归，程序没法实现，）
        所以：递归还是要认真学习的。
    5、在实际的开发中，假设有天真的遇到了：StackOverflowError
        如何解决这个问题，讲一下解决的思路？
            第一步：先检查递归的结束条件是否正确。如果递归结束条件不对，必须对结束条件进行修改，
            直到正确为止。
            第二步：如果结束条件没有问题，怎么办？
                需要手动调整JVM栈内存的初始化大小。
                可以将栈内存的空间调大些。
            第三步：调整了大小，运行还是报这个错误；
                没办法，只能继续扩大栈内存的初始化大小。
        操作：控制台输出：java -X      这是查找设置命令的命令
             控制台输出：java -X Xss **GB **.java

*/


public class RecursionTest01 {
    public static void main(String[] args){
        //调用下面的方法
        doSome();
    }

    public static void doSome(){
        System.out.println("doSome begin");
        //目前这个递归是没有结束条件的，会出现什么问题？
        //会出现堆栈内存溢出
        doSome();
        //这行代码永远执行不到
        System.out.println("doSome over");

    }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
    // public static void doSome(){
    //     System.out.println("doSome begin");
    //     doSome();
    //     System.out.println("doSome over");

    // }
}