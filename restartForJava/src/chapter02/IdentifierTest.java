package restartForJava.src.chapter02;
/*
    题目：创建一个123.java文件，有问题吗？
    没有问题；
    只不过在123.java文件中无法定义public公共类；

    标识符的命名规范：
    1、命名规则和命名规范的区别：
        命名规则是语法，不遵守规则就，编译会报错
        命名规范只是说，大家尽量按照统一的规范来进行命名，不符合规范也行，代码是可以编译通过的，
        但是你的代码风格和大家不一样，这个通常也是不允许的；
        规则类似现实世界中的法律；
        规范类似现实世界中的道德；

        统一按照规范进行的话，代码的可读性很好，代码容易让其他开发同学理解。
    2、命名规范都有哪些？
        2.1、见名知意
        2.2、遵循驼峰命名方式（一高一低）
        2.3、类名、接口名有特殊要求
            类名、接口名首字母大写，后面每个单词首字母大写；
            StudentTest、UserTest
        2.4、变量名、方法名有特殊要求
            变量名和方法名首字母小写，后面每个单词首字母大写；
            ageTest、nameTest
        2.5、所有常量名：全部大写，并且单词和单词之间采用下划线衔接；
            USER_AGE
 */
public class IdentifierTest {
    public static void main(String[] args) {
        int age = 20;
        String name = "张三";
        System.out.println(name);
    }
}
