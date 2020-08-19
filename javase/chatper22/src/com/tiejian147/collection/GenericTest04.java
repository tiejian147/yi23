package javase.chatper22.src.com.tiejian147.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest04 {
    public static void main(String[] args) {
//        创建数组集合
        List<String> myList = new ArrayList<>();

//        添加元素
        myList.add("abc");
        myList.add("求和");
        myList.add("1111");

//        获取迭代器
        Iterator<String> it = myList.iterator();

//        使用迭代器中的方法来遍历
        while (it.hasNext()){
            System.out.println("这是使用迭代器的方法遍历：" + it.next());
        }

//        使用集合的方法来遍历，只能有带下标的集合才行
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("这是用myList中的get方法来写的遍历：" + myList.get(i));
        }

//        用foreach写：
        for (String data: myList){
            System.out.println("这是用foreach方法写的遍历：" + data);
        }


    }
}
