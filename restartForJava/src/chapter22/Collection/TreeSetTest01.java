package chapter22.Collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合的特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小的顺序排序；
    可排序集合。
    无序：这里的无序是存进去的顺序和取出来的顺序不同，且没有下标。
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("M");
        strings.add("O");
        strings.add("H");
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("B");
        strings.add("C");

        //遍历
        for (String o: strings) {
            System.out.println(o);
        }
    }
}
