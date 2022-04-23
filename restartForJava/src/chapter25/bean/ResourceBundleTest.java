package chapter25.bean;

import java.util.ResourceBundle;

/*
java.util包提供了一个资源绑定器，便于获取属性配置文件中的内容
    使用以下这种方式的时候，属性配置文件必须要放到类路径下：xxx.properties
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类路径下，
        //文件扩展名也必须得是properties，并且在写路径的时候，路径后面的扩展名不能写
        ResourceBundle resourceBundle = ResourceBundle.getBundle("classinfo2");

        String name = resourceBundle.getString("className2");
        System.out.println(name);
    }
}
