package javase.chapter20.com.tiejian147.javase.number;
/**
 * 1、BigDecimal属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
 *  这是SUN公司提供的一个类，专门用在财务软件当中。
 *
 * 2、注意：财务软件中double是不够用的，有一个面试题：
 *  是否处理过财务数据？用的哪一种类型：
 *      千万别说double，说java.math.BigDecimal
 */

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
//        这个100不是普通的100，是精度极高的100
        BigDecimal bd1 = new BigDecimal(100);
//        System.out.println(bd1);
//        精度极高的200
        BigDecimal bd2 = new BigDecimal(200);
//        BigDecimal bd3 = bd1 + bd2;//这样不行，bd1和bd2都是引用，不能直接使用+求和
        BigDecimal bd3 = bd1.add(bd2);//调用方法求和
        System.out.println(bd3);//300

        BigDecimal bd4 = bd2.divide(bd1);//求商的方法
        System.out.println(bd4);

    }
}
