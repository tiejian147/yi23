package chapter04;
/*

 */
public class FloatTest01 {
    public static void main(String[] args) {
        double d1 = 10.0 / 3;
        System.out.println(d1);

//        小数默认都是double,所以，下面必须要强转，否则就会报错
        float f1 = (float) 10.0 / 3;
        System.out.println(f1);
    }
}
