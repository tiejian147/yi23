package chapter23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
IO+properties 联合使用
非常好的一个设计理念：
    经常改变的数据，可以单独写到一个文件中，使用程序动态获取；
    将来只要改变这个文件，java代码不需要改动，不需要重新编译，服务器也不需要重启，
    就可以拿到动态的信息。

    类似于以上机制的文件，被称为配置文件，并且配置文件格式是key=value格式时，
    我们把这种配置文件叫做属性配置文件。

    java中有规范要求：属性配置文件建议以.properties结尾，但这不是必须的。
    其中Properties是专门存放属性配置文件内容的一个类。
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        /*
        Properties是一个Map集合，key和value都是String类型，
        想将userinfo文件中的数据加载到Properties对象当中。
         */
        //创建流对象
        FileReader reader = new FileReader("C:\\迅雷下载\\userinfo.txt");
        //创建一个Map对象
        Properties pro = new Properties();
        //调用pro中的load方法
        //文件中的数据顺着管道加载到Map集合中，其中等号左边做key，等号右边做value
        pro.load(reader);
        //通过key来获取value
        String name = pro.getProperty("username");
        System.out.println(name);
    }
}
