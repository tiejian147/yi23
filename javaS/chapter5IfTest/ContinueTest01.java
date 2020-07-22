/*
    continue 语句：
        1、continue表示：继续/go on /下一个
        2、continue也是一个conitnue关键字加一个分号构成一个单独的完整的java语句，主
        要出现循环语句当中用来控制循环的执行。
        3、break和continue的区别？
            *break表示循环不执行了，跳出循环，终止循环；
            *continue表示终止当前”本次“循环吗，直接进入下一次循环继续执行。
        4、continue也有这样的语法：
            continue 循环名称; 【可以作为了解】
*/

public class ContinueTest01{
    public static void main(String[] args){

        for(int i = 0; i < 10; i ++){
            if(i == 5){
                continue;
                
            }
            System.out.println("i的值为：" + i);
        }
        System.out.println("hello world");

    }
}