package restartForJava.src.chapter05;
/*
赋值运算符： =   这个没啥好说的，只要记住：等号右边先执行，然后赋值给等号左边；
扩展的赋值运算符：+=、-=、*=、/=、%=
      重点：
          使用扩展赋值运算符时，数据类型并不会发生改变；

 */
public class OperatorTest04 {
    public static void main(String[] args) {
//        怎么理解上面重点的那句话呢？
        byte b1 = 10;
        //b1 = b1 + 10;//这里编译就会报错,因为右边是int类型

        System.out.println(b1);

//        但是用扩展的赋值运算符就不会发生上面的报错了
        byte b2 = 20;
        b2 += 20;  //  类似 b2 = b2 +20；  但是又完全不一样，因为+= 不涉及类型转换；  完全等于： b2 = (byte)(b2 + 20)
        System.out.println(b2);
    }
}
