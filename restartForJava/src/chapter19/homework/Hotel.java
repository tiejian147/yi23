package chapter19.homework;

public class Hotel {
    private Room[][] rooms;

//    通过构造方法来盖楼
    public Hotel(){
//        动态初始化   3层楼 每层10个房间
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0){
                  //  一层
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }
    // 提供一个打印房间的方法
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println(rooms[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 订房的方法
     * @param roomNo  调用此方法时需要传递一个房间编号过来，这个是酒店工作人员进行操作和输入的
     */
    public void order(int roomNo){
        //这个方法的主要目的是将房间的true改为false；
        //假设房间编号是207，下标就是 [1][6]
        Room room = rooms[roomNo / 100 -1][roomNo % 100 -1];
        int i = 207 / 100;
        System.out.println("测试数据：" + i);
        room.setStatus(false);
        System.out.println("订房成功，该房间状态为：" + room);
    }

    /**
     * 退房的方法
     * @param roomNo
     */
    public void exit(int roomNo){
        Room room = rooms[roomNo / 100 -1][roomNo % 100 -1];
        room.setStatus(true);
        System.out.println("退房成功，该房间状态为：" + room);
    }
}

