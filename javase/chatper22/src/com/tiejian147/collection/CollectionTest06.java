package javase.chatper22.src.com.tiejian147.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
 */
public class CollectionTest06 {
    public static void main(String[] args) {
//        创建集合
        Collection c1 = new ArrayList();

//        添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);

//        获取迭代器

       Iterator it =  c1.iterator();

       while (it.hasNext()){
//           编写代码时next() 方法返回值类型必须是Object
//           Iterator i = it.next();  //这里类型不对，编译会报错
           Object obj = it.next();
           System.out.println(obj);
       }

//

    }
}
