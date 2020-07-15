package day23;
/*
*   第一题：
*       编写程序，使用一维数组，模拟栈数据结构
*       要求：
*           1、这个站可以存储java中的任何引用类型的数据
*           2、在栈中提供push方法模拟压栈（栈满了，要有提示信息）
*           3、在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
*           4、编写测试程序，new栈对象，调用push，pop方法来模拟压栈弹栈的动作
*           5、假设栈的默认初始化容量是10（请注意无参数构造方法的编写方式）
*
*       public class MyStack{//栈类
*           //提供一个数组来存储栈中的元素
*           Object[] elements;
*
*           //构造方法
*
*           push方法（push方法压栈）
*           压栈表示栈中多一个元素
*           但是栈如果已满，压栈失败
*           这个方法的参数以及返回值类型自己定义
*
*           pop方法（pop方法弹栈）
*           弹栈表示栈中少一个元素
*           但是栈如果已空，弹栈失败
*           这个方法的参数以及返回值类型自己定义
*       }
* */
public class MyStack {
//    向栈当中存储元素，我们这里使用一维数组模拟，存到栈中，就表示存储到数组中
//    因为数组是我们学习java的第一个容器
//    为什么选择Object类型数组？因为这个栈可以存储java中的任何引用类型的数据；
//    new Animal()对象可以放进去，new Person()对象也可以放进去，因为Animal和Person的超级
//    父类就是Object；
//    包括String也可以存储进去，因为String父类也是Object
    private Object[] elements;


//    setter & getter 方法

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

//    无参构造方法:默认初始化栈容量10；

    public MyStack() {
        this.elements = new Object[10];
    }

//    有参构造方法
    public MyStack(Object[] elements) {
        this.elements = elements;
    }
}
