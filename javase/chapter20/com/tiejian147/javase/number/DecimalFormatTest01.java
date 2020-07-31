package javase.chapter20.com.tiejian147.javase.number;

import java.text.DecimalFormat;

/**
 * 关于数字格式化（了解）
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
//         java.text.DecimalFormat专门负责数字格式化的
//        DecimalFormat df1 = new DecimalFormat("数字格式");
        /**
         * 数字格式有哪些？
            # 代表任意数字
            , 代表千分位
            . 代表小数点

         ###,###.##
            表示：加入千分位，保留2个小数
         */
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        System.out.println(df1.format(1234.56734));//1,234.57

        String s1 = df1.format(1234.56);
        System.out.println(s1);//1,234.56

//        保留4位小数，不够补上0
        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        System.out.println(df2.format(333.45));//333.4500

    }
}
