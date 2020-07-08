package com.tiejian147.javase.array;



//当一个参数是一个数组的时候，如何传参的？




public class ArrayTest03 {
//    main方法的编写方式，还可以采用C++的语法格式，
//    例如将String[] 的 [] 方在args 的后面
    public static void main(String args[]) {
        //一样能编译通过并打印成功
        System.out.println("hello world");
//        java的写法
        int[] a1 = {12,432,23423};
        for (int j = 0; j < a1.length; j++) {
            System.out.println("中括号放在前面：" + a1[j]);
        }

        System.out.println("-----------------------");

//        这是C++的写法，不建议
        int a2[] = {1000,23423,111};
        for (int i = 0; i < a2.length; i++) {
            System.out.println("中括号放在后面" + a2[i]);
        }

        System.out.println("-----------------------");

//        调用方法时传一个数组,静态的
        int[] x = {1,2,3,4};
        printArray(x);
        System.out.println("-----------------------");

//        调用方法传一个静态的String类型的数组
        String[] xx = {"sfdsf","test","s是的范德萨"};
        printArray(xx);
        System.out.println("-----------------------");

//        调用方法传一个动态的String类型的数组
        String[] xx1 = new String[5];
        printArray(xx1);
        System.out.println("-----------------------");

//        也可以不用声明变量，直接传对象
        printArray(new String[3]);//默认值是null
        printArray(new int[4]);//默认值是0



    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

//    再来一个静态的方法，传参为String类型的数组
    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("String类型的数组：" + args[i]);
        }
    }
}
