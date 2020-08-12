package com.tiejian147.collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1、默认初始化容量10；
    2、集合底层是一个Object[] 数组；
    3、构造方法：
        ArrayList();
        ArrayList(20);
    4、
 */
public class ArrayList01 {
    public static void main(String[] args) {
//        默认初始化容量10，
//        数组的长度是10
        List list = new ArrayList();
//        集合的size() 方法是获取集合中元素的数量。不是获取集合的容量；
        System.out.println(list.size());//0
//        指定初始化容量为20
//        数组的长度是20
        List list1 = new ArrayList(20);
        //        集合的size() 方法是获取集合中元素的数量。不是获取集合的容量；
        System.out.println(list1.size());//0
    }
}
