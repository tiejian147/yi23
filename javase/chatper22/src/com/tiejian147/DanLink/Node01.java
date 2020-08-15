package javase.chatper22.src.com.tiejian147.DanLink;
/*
单链表中的节点
节点是单向链表中基本的单元。
每一个节点Node都有两个属性。
    一个属性：是存储的数据；
    另一个属性：是下一个节点的内存地址；
 */
public class Node01 {
//    存储的数据
    Object data;

//    下一个节点的内存地址；
    Node01 next;

//    无参数的构造方法
    public Node01(){

    }

//    有参数的构造方法
    public Node01(Object data, Node01 next){
        this.data = data;
        this.next = next;
    }

}
