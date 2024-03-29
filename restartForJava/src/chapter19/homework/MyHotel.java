package chapter19.homework;
/*
为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态等功能。
1、该酒店的用户是：酒店前台
2、酒店使用一个二维数组来模拟：Room[][] rooms;
3、酒店中每一个房间应该是一个java对象：Room
4、每一个房间都有三个属性：房间编号、房间类型、房间是否空闲
5、系统对外应提供的功能：
    可以预定房间：用户输入房间编号，订房
    可以退订房间：用户输入房间编号，退房
    可以查看所有的房间状态：用户输入某个指令应该可以查看所有房间状态；
 */
public class MyHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.print();
        // 订房
        hotel.order(207);
        // 退房
        hotel.exit(207);
    }
}
