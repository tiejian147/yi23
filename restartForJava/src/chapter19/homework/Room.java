package chapter19.homework;

import java.util.Objects;

/*
    房间类
 */
public class Room {
    /**
     * 房间编号：101/102/103....
     */
    private int no;
    /**
     * 房间类型：标间，豪华间、总统套
     */
    private String  type;
    /**
     * 房间状态：可用，不可用
     */
    private boolean status;
//  setter & getter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    构造方法

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

//    equals方法重写
    /*
    equals方法是用来比较两个对象是否相同的
    至于怎么比较，这个是程序员自己定
    你认为两个房间的编号相同，就表示一个房间，那么写代码就比较房间编号就行
     */
//    toString方法重写
    /*
    toString方法的目的就是将java对象转化成字符串格式
    怎么转，转成什么格式，程序员自己定。目的就是：简单，清晰明了；
    我不要看内存地址，我要看具体的信息
     */

    @Override
    public String toString() {
        return "[" + no + "," + "房间类型：" + type + "," +
                "房间状态:" + (status ? "空闲" : "占用") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no &&
                status == room.status &&
                Objects.equals(type, room.type);
    }

//    这里编写一个临时程序测试一下toString方法的输出
    public static void main(String[] args) {
        Room room = new Room(101,"单人间",false);
//        room是一个引用，println(引用)，会自动调用引用的toString()方法；
//        System.out.println(room.toString());

//        所以也可以写成：
        System.out.println(room);//自动调用toString方法

        Room room1 = new Room(102,"单人间",false);
        System.out.println(room.equals(room1));
    }


}



