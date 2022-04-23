package chapter25;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws  Exception{
        //获取一个文件的绝对路径
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
//        System.out.println(path);
        //IO流
        FileReader reader = new FileReader(path);*/


        //还有一个更为先进的方法
        //直接以流的方式返回
        InputStream reader = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("classinfo2.properties");

        Properties properties = new Properties();
        properties.load(reader);
        reader.close();

        //通过key获取value
        String className = properties.getProperty("className2");
        System.out.println(className);
    }
}
