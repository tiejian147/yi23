package javase.chatper22.src.com.tiejian147.DanLink;

public class SingleLinkTest {
    public static void main(String[] args) {
        //    创建了一个集合对象
        Link01 link = new Link01();

//    往集合中添加元素
        link.add("abc");
        link.add(100);
        link.add(100);
        link.add(100);
        link.add(100);

//        获取链表中元素的个数
        System.out.println(link.size());


    }
}