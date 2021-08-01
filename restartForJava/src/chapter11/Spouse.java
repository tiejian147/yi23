package chapter11;
/*
.后面只有一个单词，没有小括号，表示访问的是属性；
.后面有一个单词+(), 表示访问的是方法；
 */

public class Spouse {
    public static void main(String[] args) {
//        创建丈夫对象
        Husband h1 = new Husband();
        h1.setBirthday("87年2月");
        h1.setIdNo(111);
        h1.setName("刘生超");

//        创建妻子对象
        Wife w1 = new Wife();
        w1.setBirthday("89年5月");
        w1.setIdNo(222);
        w1.setName("方小熊");

//        产生关系
//        这里解释一下，见上面
        h1.xiaoXiong = w1;
        w1.chaoChao = h1;

//        h1.idNo =

        System.out.println(h1.getName() + "的妻子是" + h1.xiaoXiong.getName());
        System.out.println(w1.getName() + "的老公是" + w1.chaoChao.getName());

    }
}
