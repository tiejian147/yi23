package com.tiejian147.collection;

public class HashMapTest02 {
    public static void main(String[] args) {
        Students s1 = new Students("zhangsan");
        Students s2 = new Students("zhangsan");

//        因为没有重写equals方法，所以是false
        System.out.println(s1.equals(s2));//false,重写equals方法之后变为true

//        重写equals方法之后
        System.out.println(s1.equals(s2));//true（s1和s2表示相等）

        System.out.println("s1的哈希code：" + s1.hashCode());
        System.out.println("s2的哈希code：" + s2.hashCode());




    }
}


