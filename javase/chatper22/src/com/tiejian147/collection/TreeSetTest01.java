package com.tiejian147.collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储的特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序；
        称为可排序集合；

    2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同，并且没有下标；
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
//        创建TreeSet集合的对象
        Set<String> str = new TreeSet<>();

//        往集合中添加元素
        str.add("E");
        str.add("A");
        str.add("D");
        str.add("H");
        str.add("N");
        str.add("Z");
        str.add("N");
        str.add("A");
        str.add("Q");

//        遍历
        /*
        下面的打印结果:
        A
        D
        E
        H
        N
        Q
        Z
        从小到大自动排序;
         */
        for(String s : str){
            System.out.println(s);
        }
    }
}
