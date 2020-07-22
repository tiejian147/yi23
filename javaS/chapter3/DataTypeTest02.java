/*
    1、这里还是要继续说数据类型
        *计算机最初只支持英文，最初出现的字符编码是：ASCII码
            'a' --> 97 【01100001】
            'A' --> 65
            '0' --> 48

            'a' 按照ASCII 解码 是 --> 01100001
            01100001 按照ASCII编码 是--> 'a'

            编码和解码的时候采用同一套字典/对照表，不会出现乱码；
            当编码和解码的时候采用的不是同一套字典/对照表，会出现乱码问题；
        *随着计算机的发展，后来出现了一种编码方式，是国际化标准组织ISO制定的，这种编码方式支持西欧语言，向上兼容ASCII，仍然不支持中文，
        这种编码方式是：ISO-8859-1，又被称为latin-1
        
        *随着计算机开始向亚洲发展，计算机开始支持日本，中文，韩文等国家文字，其中支持简体中文的编码方式：
        GB2312 < GBK < GB18030   (按容量大小排列)

        *支持繁体中文：大五码 <big5>

        *后来出现了一种编码方式可以兼容全球所有的文字，容量较大，这种编码方式叫：unicode编码
        unicode编码有多种具体的实现：
            -UTF-8
            -UTF-16
            -UTF-32
            ....
        *JAVA语言采用的是哪一种编码方式呢？
            -java语言源代码采用的是unicode编码方式，所以标识符可以写中文；
            例如：
            class 学生{

            }
        
        *现在在实际开发当中，一般用UTF-8编码方式较多。【统一编码方式】

    2、八种数据类型的取值范围：
        类型                    取值范围
        ------------------------------------------
        byte                    [-128 ~ 127]
        int                     [-2147483648 ~ 2137483647]
        short                   [-32768 ~ 32767]
        long
        float
        double
        boolean                 [true,false]
        char                    [0 ~ 65535]

        注意：short和char 所表示的种类总数是一样的，只不过char表示的数值更大一些；因为char里面没有负数； 

    3、八种基本数据类型的默认值；
        数据类型                        默认值
        ---------------------------------------
        byte,int,short,long             0
        float,double                    0.0
        boolean                         false  【在c语言中，true是1，false是0】
        char                            \u0000 

        注意：八种基本的数据类型的默认值一切向0看齐；

    4、以下java程序主要讲解的是数据类型之一：char类型
            *转义字符 \
            *转义字符出现在特殊字符之前，会将特殊字符转换成普通字符；
            \n          换行
            \t          
            \\


 */

public class DataTypeTest02{

    //在类体中声明一个变量k 这里的static必须要加，先不解释；
    static int k =1000;

    //在类体中声明一个变量f
    static int f;

    //在类体中声明一个浮点型变量m，且不赋值
    static float m;

    //在类体中声明一个浮点型变量n，且不赋值；
    static double n;

    //在类体中声明给一个布尔型的变量q，且不赋值；
    static boolean q;

    //在类体中声明一个字节型的变量c，且不赋值；
    static char c;

    //声明一个char类型的变量e
    static char e;

    // 变量的赋值不能写在类体中，否则会报错
    //e = 'a';
    


    public static void main(String[] args){

        /* 局部变量要赋值，不然会报错
         int i;

        System.out.println(i);
        */

        //这里打印的是类体里的变量k
        System.out.println(k);

        //这里打印的是类体里的变量f,f在类体中可以不赋值，系统会默认给一个默认值=0，所以编译不会报错，打印的f的值为0
        System.out.println(f);

        //这里在main方法中打印类体中的变量m，要展示默认值
        System.out.println(m);

        //这里在main方法中打印类体中的变量n，要展示默认值；
        System.out.println(n);

        //这里在main方法中打印类体中的变量q，要展示默认值；
        System.out.println(q);

        //这里在main方法中打印类体中的变量c，要展示默认值；这里为什么没有打印出来，存疑？？
        System.out.println(c);

        //类体中声明的变量要在方法体赋值，这样才能编译成功且打印成功；
        e = 'a';

       //只有引用了doSome方法，才能引用下面方法中的赋值，才能打印不报错；
        System.out.println(e);
        
        //这里声明一个字符型的变量x，支持中文打印
        char x = '国';

        //打印x
        System.out.println(x);

        // ab是字符串，不能用单引号括起来,否则会编译错误
        //char y = 'ab';
        
        // "a"是字符串类型，k变量是char类型，类型不兼容，编译会报错
        //char k = "a";

        // 普通的n字符
        char c1 = 'n';
        
        //打印c1
        System.out.println(c1);

        //依照目前所学知识，以下程序无法编译通过，因为显然是一个字符串，不能使用单引号括起来，
        //但是经过编译，并没有报错，这说明以下并不是一个字符串，而是 一个 字符；
        //这是一个“换行符”，属于char类型的数据；
        //反斜杠在java语言中具有转义功能。
        char c2 = '\n';
        
        // System.out.print() 和 System.out.println()的区别
        // System.out.print()打印不换行；System.out.println()打印换行
        //以下代码由于中间打印了c2，达成了换行的效果；
        System.out.print("河北");
        System.out.print(c2);
        System.out.println("衡水");

        //制表符tab
        //强调：tab和空格不同，他们的ASCII不一样，体现在键盘上两个不同的按键；
        char y = '\t';
        System.out.print("江西");
        System.out.print(y);
        System.out.println("上饶");

        // //要求在控制台上打印出字符“反斜杠字符”
        // //反斜杠后面的单引号成不具备特殊含义的普通单引号字符；
        // //左边的单引号缺少了结束的单引号字符，编译报错

        // char k = '\';
        // System.out.println(k);

        // 正确的打印方法：
        //解释：第一个反斜杠具有转义功能，将后面的反斜杠转义为普通的反斜杠字符；
        //结论：在java中两个反斜杠代表一个普通的反斜杠字符；
        char k = '\\';

        System.out.println(k);

        //在控制台输出单引号'
        //反斜杠具有转义功能，将第二个单引号转义成普通的单引号字符；
        //第一个单引号就可以和最后一个单引号配对了；
        char u = '\'';
        System.out.println(u);

        //在控制台输出带半角双引号的helloworld
        //这是第一种表示方式
        char r ='\"';
        System.out.print(r);

        System.out.print("HelloWorld!");
        System.out.println(r);

        //这是第二种表示方式：
        System.out.println("\"Heollo World!!\"");

        System.out.println("测试");




    }

       


}