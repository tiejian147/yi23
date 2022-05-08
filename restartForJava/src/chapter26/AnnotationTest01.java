package chapter26;
/*
1、注解，或者叫做注释，英文单词是：annotation
2、注解annotation是一种引用数据类型。编译之后也是生成xxx.class文件。
3、怎么自定义注解？语法格式？
    [修饰符列表] @interface 注解类型名{

    }
4、注解怎么使用，用在什么地方？
    第一：注解使用时的语法格式是：
    @注解类型名

    第二：注解可以出现在类上、属性上、方法上、变量上等.....
    注解还可以出现在注解类型上。
5、JDK内置了哪些注解？
    @Deprecated
    @Override
6、元注解
    用来标注“注解类型”的“注解”，称为元注解；
    常见的元注解有哪些？
    Target
    Retention

    关于Target元注解：
        这是一个元注解，用来标注“注解类型”的“注解”
        用来标注“被标注的注解”可以出现在那些位置上。
        @Target(ElementType.METHOD):表示“被标注的注解”只能出现在方法上。

    关于Retention注解：
        这是一个元注解，用来标注“注解类型”的“注解”
        用来标注“被标注的注解”最终保存在哪里。
        @Retention(RetentionPolicy.SOURCE)表示该注解只被保留在java源文件中。
        @Retention(RetentionPolicy.CLASS)表示该注解被保存在class文件中。
        @Retention(RetentionPolicy.RUNTIME)表示该注解被保存在class文件中，且可以被反射机制所读取。

        https://www.bilibili.com/video/BV1ED4y1R7L7?p=678&spm_id_from=pageDriver
        刚开始
 */
public class AnnotationTest01 {
}
