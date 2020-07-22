
public class KeyInputTest {
    
    public static void main(String[] args){

        //第一步：创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        //第二步：调用Scanner对象的next()方法开始接收用户键盘输入；
        //程序执行到这里会停下来，等待用户的输入；
        //当用户输入的时候，并且最终敲回车键的时候，键入的信息会自动赋值给userInputContent变量
        //程序执行到这里的时候，用户输入的信息已经存入到内存中了；
        //想输入字符串的话用这个：
        // String userInputContent = s.next();//标识符的命名规范：见名知意；

        //将内存中的数据输出到控制台
        // System.out.print("您输入了：" + userInputContent);

        //还可以接收数字：
        //想输入数字的话用这个：
        int num = s.nextInt();

        System.out.println("您输入的数字是：" + num);
        System.out.println("计算结果：" + (num + 200));




    }

}