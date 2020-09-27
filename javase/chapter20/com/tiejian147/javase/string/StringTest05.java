package javase.chapter20.com.tiejian147.javase.string;

public class StringTest05 {
    public static void main(String[] args) {
//       1、（掌握） String类当中的常用方法： char charAt(int index);
        char a = "中国人".charAt(1);//取这个字符串下标为1的字符
        System.out.println(a);//国

//       2、 （了解）int compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);//0 （等于0，前后一致）

        int result2 = "abcd".compareTo("abce");
        System.out.println(result2);//-1  （小于0） 前小后大

        int result3 = "abce".compareTo("abcd");
        System.out.println(result3);// 1 （大于0，前大后小）

//        3、（掌握）boolean contains(CharSequence s)
//        判断前面的字符串中是否包含后面的子字符串
        System.out.println("HelloWorld.java".contains(".java"));//true
        System.out.println("http://www.baidu.com".contains("https://"));//false

//        4、掌握： boolean endsWith(String suffix)
//        判断当前字符串是否以某个字符串结尾
        System.out.println("判断当前字符串是否以某个字符串结尾1:" + "test.txt".endsWith(".txt"));//true
        System.out.println("判断当前字符串是否以某个字符串结尾2:" + "test.txt".endsWith(".ajva"));//false
        System.out.println("判断当前字符串是否以某个字符串结尾3:" + "sdfsdfasdcwqefeeweeee".endsWith("ee"));//true

//        5、（掌握） .boolean  equals(Object anObject)
//        比较两个字符串必须使用equals方法，不能使用"=="
//        equals方法有没有调用compareTo方法？老版本可以看一下，JDK13中并没有调用compareTo()方法
        System.out.println("测试equals方法：" + "abc".equals("abc"));

//        6、（掌握）.boolean equalsIgnoreCase(String anotherString)
//        判断两个字符串是否相等，并且同事忽略大小写
        System.out.println("不区分大小写的方法：" + "Abc".equalsIgnoreCase("aBC"));

//        7、（掌握）.byte[] getBytes()
//        将字符串对象转换为字节数组
        byte[] bytes = "absdfds".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println("字节数组：");
            System.out.println(bytes[i]);

        }

//        8、（掌握）.int indextOf(String str)
//        判断某个子字符串在当前字符串中第一次出现处的索引（下标）
        System.out.println("第八个："+"sdlerfjsordijavasldfeifjajavasldfkjsdf".indexOf("java"));

//        9、（掌握）.boolean isEmpty()
//        判断某个字符串是否为"空字符串"，底层源代码调用的应该是字符串的length()方法
        String a1 = "";
        System.out.println(a1.isEmpty());//true：是空的
        String a2 = "111";
        System.out.println(a2.isEmpty());//false:不为空

//        10、（掌握）.int length();
//        面试题：判断数组长度和判断字符串长度不一样
//        判断数组长度是length属性，判断字符串长度是length()方法
        System.out.println("这个字符串的长度为：" + "abc".length());//3

//        11、（掌握）.int lastIndexOf(String str)
//        判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("sdfdslfkjavaweoitusdkvjavasldkfs".lastIndexOf("java"));


//        12、（掌握）.String replace(CharSequence target,CharSequence replacement)
//        替换
//        String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://", "https://");
        System.out.println(newString);
//        把以下字符串中的"="替换成："："
        String s2 = "name=zhangsan&password=1243&age=20".replace("=", ":");
        System.out.println(s2);

//        13、（掌握）.String[] split(String regex)
//        拆分字符串
        String[] ymd = "1980-11-20".split("-");
        System.out.println("时间1980-11-20进行拆分：");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
//        System.out.println();

        System.out.println("--------");
        String[] ymd2 = "1980:11:20".split(":");

        System.out.println("时间1980:11:20进行拆分：");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd2[i]);
        }


        String param = "name=zhangsan&password=1243&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);

            String[] params2 = params[i].split("=");
            for (int j = 0; j < params2.length; j++) {
                System.out.println(params2[j]);
            }

        }

//        14、（掌握）.boolean startsWith(String prefix)
//        判断某个字符串是否以某个子字符串开始
        System.out.println("http://baidu.com".startsWith("http"));//true
        System.out.println("http://baidu.com".startsWith("baidu"));//false

//        15、(掌握) String substring(int beginIndex)
//        截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com

//        16、（掌握）String substring(int beginIndex)
//        beginIndex 起始位置（包括）
//        endIndex 结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));//www

//        17、（掌握） char
//        将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

//        18、(掌握) String toLowerCase()
//        转换为小写
        System.out.println("WEFDSGFRdskfsdflDSFS".toLowerCase());

//        19、（掌握）  String toUpperCase()
//        转换为大写
        System.out.println("sdfsdfSDFsdfSLjkLKJlkj".toUpperCase());

//        20、（掌握） String trim()
//        去除字符串前后空白
        System.out.println("  test   sdfsdf  sdfdsf   ssss ".trim());

//        21、（掌握） .String 中只有一个方法是静态的，不需要new对象
//        这个方法叫做valueOf
//        作用：将"非字符串"转换成"字符串"
        String str1 = String.valueOf(true);
        String str2 = String.valueOf(123);
        String str3 = String.valueOf(3.14);
        System.out.println(str1 + " " + str2 + " " + str3);

//        这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？会
        String str4 = String.valueOf(new Custmor());
        System.out.println(str4);
    }
}

class Custmor{
//    重写toString方法
    public String toString(){
        return "我是一个vip客户";
    }
}
