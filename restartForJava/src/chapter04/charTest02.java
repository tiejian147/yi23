package chapter04;

public class charTest02 {
    public static void main(String[] args) {
//        普通的char字符
        char t1 = 't';
        System.out.println(t1);

//        特殊的char字符   \t ：表示制表符，相当于键盘上的tab键
        char t2 = '\t';
        System.out.println(t2);
        System.out.println("sdfs\tdlkj");

//        这是换行符
        char c3 = '\n';
        System.out.print("abc");
        System.out.print(c3);
        System.out.println("def");

//        输出 '
        System.out.println('\'');

//        输出\
        System.out.println('\\');

//        输出 "test"
        System.out.println("\"test\"");

//       这里   代表的是 unicode编码  unicode是十六进制的
        char c4 = '\u4e2d';
        System.out.println(c4);
    }
}
