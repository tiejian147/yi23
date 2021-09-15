package chapter19;
/*
动态初始化数组
什么时候用静态初始化，什么时候用动态初始化？
    当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态的初始化方式；
    当你创建数组的时候，不确定数组中存储哪些具体的元素时，采用动态的初始化方式，预先分配空间。
 */
public class ArrayTest02 {
    public static void main(String[] args) {
//        动态初始化数组
        int[] b = new int[5];
//        遍历数组
        for (int i = 0; i < b.length; i++) {
            System.out.println("数组b的第" + i + "个元素为：" + b[i]);
        }
//        静态初始化对象数组
        Object[] objects = {new Object(),new Object(),new Object()};
        for (int i = 0; i < objects.length; i++) {
            System.out.println("静态初始化object数组：" + objects[i]);
        }

//        动态初始化对象数组
        Object[] objects1 = new Object[3];
        for (int i = 0; i < objects1.length; i++) {
            System.out.println("动态初始化object1数组：" + objects1[i]);
        }
    }
}
