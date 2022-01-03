package chapter22.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
泛型练习：

自定义泛型：？可以的
    自定义泛型的时候<>，尖括号中的是一个标识符，随便写。
    不用泛型就是Object类型

    java源代码中经常出现的是：
        <E>和<T>
        E是element单词首字母；
        T是type单词首字母；
 */
public class GenericTest03 {
    public static void main(String[] args) {
        //这里面只能加String类型的对象，别的类型装不了
        List<String> StrLst = new ArrayList<>();
        //只能放String，放别的编译器过不去
        StrLst.add("abc");
        StrLst.add("bbbb");
        StrLst.add("cccc");

        Iterator<String> iterator = StrLst.iterator();
        //遍历
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        
        

    }
}
