package chapter22.Collection;

import java.util.TreeSet;

/*
1、TreeSet集合底层实际上是一个TreeMap；
2、TreeMap集合底层是一个二叉树；
3、放到TreeSet集合中的元素，等同于放到TreeMap集合中的key部分了；
4、TreeSet集合中的元素，无序不可重复，但是可以按照元素大小顺序自动排序。
称为：可排序集合
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zhangsan");
        treeSet.add("zhangsi");
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        for (String s: treeSet) {
            //按字典顺序：升序
            System.out.println(s);
        }
    }
}
