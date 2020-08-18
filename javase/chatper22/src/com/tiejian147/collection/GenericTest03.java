package com.tiejian147.collection;
/*
可以自定义泛型吗：可以
    自定义泛型的时候，<> 尖括号中的是一个标识符，随便写。

    java源代码经常出现的是：
        <E> 和 <T>
    E是element单词首字母；
    T是type单词首字母；
 */
public class GenericTest03<sdfdsfds> {
    public void doSome(sdfdsfds o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
//       这个不行，类型不匹配，必须得是String类型的，因为new对象的时候，指定了泛型的类型
//        gt.doSome(100);

        gt.doSome("abc");

        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(100);

//        这里穿字符串就不行了，因为gt2 的引用类型是Integer类型
//        gt2.doSome("abc");

//        不用泛型的话，就是Object类型
        /*
        GenericTest03 gt3 = new GenericTest03();
        gt3.doSome();*/


    }
}
