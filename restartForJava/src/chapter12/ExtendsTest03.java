package chapter12;
/*
所有的方法都继承了老祖宗的方法：Object类
 */
public class ExtendsTest03 {
    public static void main(String[] args) {
        ExtendsTest03 et = new ExtendsTest03();
        System.out.println(et.toString());//chapter12.ExtendsTest03@1b6d3586
        System.out.println(et);//chapter12.ExtendsTest03@1b6d3586
        // 为啥上面两个输出结果都一样呢？
        //结论：当我们直接调用引用的时候，默认调用引用的toString()方法
    }
}
