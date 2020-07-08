/*
*   关于java语言中的package和import机制：
*       1、为什么要使用package?
*           package是java中的包机制。包机制的作用是为了方便程序的管理。
*           不同功能的类分别存放在不同的包下。（按照功能划分的，不同的软件
*           包有不同的功能）
*
*       2、package怎么用？
*           package是一个关键字，后面加包名。例如：
*               package com.bjpowernode.javase.chapter17;
*
*           注意：package语句只允许出现在java源代码的第一行。
*
*       3、包名有没有命名规范：有的。
*           一般都采用公司域名倒序的方式（因为公司域名具有全球唯一性）
*           包名命名规范：
*               公司域名倒序 + 项目名 + 模块名 + 功能名
*
*       4、对于带有package的java程序怎么编译？怎么运行？(这里讲解的是没有IDEA工具的时候)
*
*           采用之前的编译和运行不行了。
*           类名不再是：PacageTest01 了
*           类名是：com.bjpowernode.yi23.javase.chapter17.src
*
*           编译：
*               javac -d . PacageTest01.java
*               解释一下：
*                   javac 负责编译的命令
*                   -d    带包编译
*                   .     代表编译之后生成的东西放到当前目录下（点代表当前目录）
*
*           运行：
*               java com.bjpowernode.yi23.javase.chapter17.src.PacageTest01
*
*       5、关于import的使用；
*           import什么时候使用？
*               A类中使用B类；
*               A类和B类都在同一个包下。不需要import；
*               A类和B类不再同一个包下，需要使用import；
*
*               java.lang.*;  这个包下的类不需要使用import导入；
*
*           import怎么用？
*               import要写在package的下面，class声明语句的上面。
*           语法：
*               import com.bjpowernode.javase.chapter17.HelloWorld;
*            也可以采用星号的方式：
*               import com.bjpowernode.javase.chapter17.*;
*
*
*
*/
package com.bjpowernode.yi23.javase.chapter17.src;

import java.util.Scanner;

public class PacageTest01 {
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    Scanner s = new Scanner(System.in);
}
