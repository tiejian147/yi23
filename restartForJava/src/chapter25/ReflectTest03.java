package chapter25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Properties;

/*
验证反射机制的灵活性
    java代码写一遍，在不改变java源代码的基础之上，可以做到不同对象的实例化。
    非常之灵活
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("C:\\study\\java\\yi23\\restartForJava\\src\\chapter25/classinfo.properties");
        //创建属性类对象Map
        Properties properties = new Properties();
        //加载
        properties.load(reader);
        //关闭流
        reader.close();
        //通过key获取value
        String className= properties.getProperty("className");
        //拿到类名
//        System.out.println(className);
        //通过反射机制创建实例化对象
        Class c1 = Class.forName(className);
        Object obj = c1.newInstance();
        System.out.println(obj);

    }
}
