package chapter22.Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
1、向Map中存，以及从Map中取，都是先调用key的hashCode方法，然后再调用equals方法；
equals方法有可能调用，也有可能不调用。
    拿put(k,v)举例，什么时候equals不调用？
        k.hashCode()方法返回哈希值，
        哈希值经过哈希算法转换成数组下标，数组下标位置上如果是null，equals方法就不调用了。
    拿get(k)举例，什么时候equals不会调用？
        哈希值经过哈希算法转换成数组下标，
        如果数组下标是null，不需要调用equals方法。
2、注意：如果一个类的equals方法重写了，那么hashCode方法必须重写；
        并且equals方法返回如果是true，那么hashCode()方法返回的值必须一样。
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Tools tools1 = new Tools("knife");
        Tools tools2 = new Tools("knife");

        //重写equals方法之前是false
        //System.out.println("重写equals方法之前：" + tools1.equals(tools2));

        //重写equals方法之后就是true了：
        System.out.println("重写equals方法之后：" + tools1.equals(tools2));

        //查看hashCode值：重写hashCode方法之前，值是不一样的
        System.out.println("tools1的hashCode值：" + tools1.hashCode());
        System.out.println("tools2的hashCode值：" + tools2.hashCode());
        //tools1.equals(tools2)已经是true了，表示他俩是一样的，相同的，那么
        //往HashSet集合中放的话，按说只能放进去一个（无序不可重复）
        Set<Tools> tools = new HashSet<>();
        tools.add(tools1);
        tools.add(tools2);
        //此时看HashSet的长度
        System.out.println("重写HashCode()方法之前，长度是：" + tools.size());//2
    }
}


class Tools{
    private String name;

    public Tools() {
    }

    public Tools(String name) {
        this.name = name;
    }

    //setter & getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tools tools = (Tools) o;
        return Objects.equals(name, tools.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
