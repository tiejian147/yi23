package chapter20;

public class StringTest05 {
    public static void main(String[] args) {
        //String类中常用的方法
        //1. (掌握)char  charAt(int index);
        System.out.println("我是中国人".charAt(2));
        //2. (了解) int compareTo("abc");
        int result1 = "abc".compareTo("abc");
        System.out.println(result1);//0

        int result2 = "abc".compareTo("abd");
        System.out.println(result2);//-1

        int result3 = "abe".compareTo("abc");
        System.out.println(result3);//2

        //3. (掌握)boolean contains()
        //判断前面的字符串当中是否包含后面的字符串
        System.out.println("avbdsdf".contains("avb"));
        System.out.println("www.baidu.com".contains("avb"));

        //4. (掌握)boolean endsWith(String suffix);
        System.out.println("------");
        System.out.println("sdfsadfdsfd".endsWith("d"));
        System.out.println("文件.txt".endsWith("r"));
        System.out.println("文件".endsWith("件"));

        //5. (掌握) boolean equals();
        //判断两个字符串必须使用equals方法， 不能使用 ==
        System.out.println("----");
        System.out.println("abc".equals("abc"));

        //6. (掌握) boolean equalsIgnoreCase();
        //判断两个字符串是否相等，并且忽略大小写
        System.out.println("----");
        System.out.println("Abc".equalsIgnoreCase("abc"));

        //7. (掌握) getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes = "abcdefg".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //8. (掌握) indexOf();
        //判断某个字符串在当前字符串中第一次出现处的索引（下标）
        System.out.println("43f9ref8uo43ijr3fu89gretgaa".indexOf("9"));

        //9. (掌握) .isEmpty()
        //判断某个字符串中是否为空
        System.out.println("-----");
        String s = "";
        System.out.println(s.isEmpty());// true
        s = "abc";
        System.out.println(s.isEmpty());//false

        //10. (掌握).length()
        //查看字符串的长度
        System.out.println("abcdfs".length());

        //11. (掌握) .lastIndexOf();
        //判断某个字符串在当前字符串中第一次出现处的索引（下标）
        System.out.println("342reuj345r3lwj4d09q".lastIndexOf("3"));

        //12. (掌握) .replace();
        //字符串替换
        System.out.println("http://www.baidu.com".replace("http://","https://"));

        //13. (掌握)String[]  .split();
        // 拆分字符串 返回的是数组
        System.out.println("13个：-----");
        String[] s1 = "1980-10-12".split("-");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

        //14. (掌握) boolean  .startsWith();
        //判断某字符串是否以某个字符串开始
        System.out.println("14个：-----");
        System.out.println("234lkjf309fi41kt".startsWith("1234"));
        System.out.println("234lkjf309fi41kt".startsWith("234"));

        //15. (掌握) .substring();
        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));

        //16. (掌握) String .substring();
        //截取 起止位置的字符串
        //起的位置不包括，止的位置包括
        System.out.println("http://www.baidu.com".substring(7,16));

        //17. char[]  .toCharArray()
        //将字符串转化成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //18. (掌握) String  .toLowerCase()
        //转换为小写
        System.out.println("SDLKFlksdSDLKFDS".toLowerCase());

        //19. (掌握)  String .toUpperCase()
        //转换为大写
        System.out.println("SDLKFlksdSDLKFDS".toUpperCase());

        //20. (掌握) String  .trim()
        //去除前后的空格，空白,中间的空格是不会去除的
        System.out.println("    sdl lskdjf   ".trim());

        //21. (掌握) String类中只有一个方法是静态的，不需要new对象； String.valueOf()
        //将不是字符串，转成字符串
        String s3 = String.valueOf(true);
        System.out.println(s3);//结果已经不是布尔类型了，是字符串

        String s4 = String.valueOf(100);
        System.out.println(s4);//结果已经不是数字类型了，是字符串







    }
}
