package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains方法
测试remove方法；
    结论：存放在一个集合中的类型，一定要重写equals方法！！！！！！！！！！！！！！
 */
public class CollectionTest05 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c1 = new ArrayList();

//        创建用户对象
        User u1 = new User("jack");
        User u2 = new User("jack");

//        将u1 加入集合
        c1.add(u1);

//        判断集合中是否包含u2？
//        没有重写equals之前，这个结果是返回false
//        System.out.println(c1.contains(u2));//false
//        重写equals方法之后，比较的时候会比较name，
        System.out.println(c1.contains(u2));

        Integer x = new Integer(10000);
        c1.add(x);

        Integer y = new Integer(10000);
        System.out.println(c1.contains(y));//true

//        创建集合对象
        Collection cc = new ArrayList();

//        创建String对象
        String s1 = new String("hello");
//        将s1 加入集合
        cc.add(s1);

//        创建String对象s2
        String s2 = new String("hello");

//        将s2移除集合
        cc.remove(s2);//s1.equals(s2);---> true,所以删除s2的时候，编译器认为删除的是s1

//        集合中的元素？
        System.out.println("集合数量现在为：" + cc.size());//0


    }
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

//    重写equals方法
//    将来调用equals方法的时候，一定是调用这个重写的equals方法

//    这个equals方法比较原理是：只要姓名一样，就表示同一个用户
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

//        如果名字一样表示同一个人，（不再比较对象的内存地址了，比较的是内容）
        return Objects.equals(name, user.name);
    }

}
