package com.tiejian147.javase.array;

/**
 * 关于数组扩容：
 *      在java开发中，数组长度一旦确定不可变，那么数组满了怎么办？
 *          数组满了，需要扩容。
 *          java中对数组的扩容是：
 *              先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到
 *              大数组当中。
 *      结论：数据扩容效率较低，因为涉及到拷贝的问题，所以在以后的开发中需要注意：
 *          尽可能少的进行数组的拷贝，可以在创建数组对象的时候预估计一下需要多长
 *          合适，最好预估准确，这样可以减少数组的扩容次数。提高效率。
 *
 */


public class ArrayTest08 {
    public static void main(String[] args) {

//        java中的数组是怎么进行拷贝的呢？
//        System.arraycopy(5个参数);

//        拷贝源（从这个数组拷贝）
        int[] src = {1, 33, 23, 234};

//        拷贝目标（拷贝到这个目标数组上）
//        动态初始化一个长度为20的数组，每一个元素默认值0
        int[] dest = new int[20];

//        调用JDK System类中的arraycopy方法，来完成数组的拷贝
//        (1：目标源，2：目标源的起始位置，3：拷贝目标，4：目标的起始位置，5：拷贝长度)
        System.arraycopy(src, 1, dest,3,3);//0 0 0 33 23 234 0 0...0

//        遍历目标数组：
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        System.out.println("========================");

//        再拷贝一组:如果拷贝整个数组的话，长度就是目标源的长度
        int[] dest1 = new int[10];
        System.arraycopy(src,0,dest1,2,src.length);

        for (int i = 0; i < dest1.length; i++) {
            System.out.println(dest1[i]);
        }

        System.out.println("========================");

//        数组中如果存储的元素是引用，可以拷贝吗？可以的
        String[] srcs = {"hello", "test", "java", "mysql", "com"};
        String[] newStrs = new String[20];

        System.arraycopy(srcs,0,newStrs,1,srcs.length);
        for (int i = 0; i < newStrs.length; i++) {
            System.out.println(newStrs[i]);
        }

        System.out.println("========================");

        Object[] obj = {new Object(), new Object(), new Object()};
        Object[] newObj = new Object[10];
        System.arraycopy(obj, 0, newObj, 2, obj.length);
        for (int i = 0; i < newObj.length; i++) {
            System.out.println(newObj[i]);
        }

    }
}
