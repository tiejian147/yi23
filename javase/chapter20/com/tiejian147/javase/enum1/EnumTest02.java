package javase.chapter20.com.tiejian147.javase.enum1;

public class EnumTest02 {
    public static void main(String[] args) {

        System.out.println(Days(2));
    }

//    写一个打印周几的方法
    public static Week Days(int i){
        if(i == 1){
            return Week.MONDAY;
        }else if(i == 2){
//            System.out.println("今天是：" + Week.TUESDAY);
            return Week.TUESDAY;
        }
        return Week.SUNDAY;
    }
}
