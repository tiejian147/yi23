package chapter22.Collection;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合特点
    无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        strs.add("hello1");
        strs.add("hello2");
        strs.add("hello4");
        strs.add("hello4");
        strs.add("hello3");
        strs.add("hello3");
        strs.add("hello5");
        strs.add("hello1");
        strs.add("hello1");

        //遍历 foreach 连迭代器都省了
        //打印的结果：去重了，而且取出来的顺序与存进去的顺序不一致
        for (String o: strs) {
            System.out.println(o);
        }

    }
}
