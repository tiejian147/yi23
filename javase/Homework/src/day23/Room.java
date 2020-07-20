package day23;
//先创建房建类

public class Room {
    /**
     * 房间号
     */
    private int roomId;

    /**
     * 房间类型
     */
    private String type;

    /**
     * 房间状态
     */
    private boolean status;

//    无参构造方法

    public Room() {
    }

//    有参构造方法

    public Room(int roomId, String type, boolean status) {
        this.roomId = roomId;
        this.type = type;
        this.status = status;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    /*
     *  重写toString() 方法
     *   toString方法的目的就是将java对象转换成字符形式
     *   怎么转，转换成什么格式，程序员自己定，目的就是：简单，清晰明了
     *   不要看对象内存地址，要看具体的信息
     *   @Override
     * */

    public String toString() {
//        这个方法的返回值类型是String ，所以return 的一定是字符串类型，要有双引号
//        return "[101,单人间,占用]"    要是返回这样的话，就是写死了，我们需要返回动态的值


        /*
        这是IDEA自动生成的写法：
        return "Room{" +
                "roomId=" + roomId +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
        */

//        自己的写法需要：简单，清晰明了；
//        动态把一个变量赛道一个字符串当中：口诀：加一个双引号，双引号中间加两个加号，两个加号中间加变量名
        return "["+roomId+","+type+","+ (status ? "空闲" : "占用") +" ]" ;

    }

    /*
    * equals方法重写
    * equals方法是用来比较两个对象是否相同的
    * 至于怎么比较，这个还是程序员自己定
    * 你认为两个房间的编号相同，就表示同一个房间，那么你写代码比较房间编号就行
    *
    * */

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
        Room room = (Room) obj;
//        当前房间编号 等于 传过来的房间对象的房间编号，认为是同一个房间
        return this.getRoomId() == room.getRoomId();
    }


//写一个测试的主方法来进行测试，测试完成之后可以删掉
    public static void main(String[] args) {

        Room room = new Room(101, "单人间", false);

//        room是一个引用
//        println(引用)，会自动调用引用的toString() 方法
        System.out.println(room.toString());

        Room room1 = new Room(102, "单人间", false);
        System.out.println(room.equals(room1));

    }
}
