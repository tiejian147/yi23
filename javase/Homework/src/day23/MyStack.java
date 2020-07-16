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

    private int index;

    /*
    * 压栈的方法
    * @param obj 被压入的元素
    * */

    public void push(Object obj){
        if(index >= this.elements.length -1){
            System.out.println("压栈已满，不能再压了");
            return;
        }
//        程序走到这里，说明栈没有满
//        向栈中加一个元素，栈桢向上移动一个位置；
        index ++;
        elements[index] = obj;
//        所有的System.out.println() 方法执行时，如果输出引用的话，自动调用引用的toString() 方法
        System.out.println("此时压栈数为" + index + "，" + obj);
    }

    /**
     * 弹栈的方法
     * @param obj
     */


//        弹栈的方法
    public void pop(){
        if(index < 0 ){
            System.out.println("弹栈空了，没了");
            return;
        }
//        程序走到这里，说明弹栈还有

//        elements[index] = obj;
//        int myNum = this.elements.length -1;
//        System.out.println("长度是：" + myNum);
        System.out.println("此时弹栈数为" + index + "，" + elements[index]);

        index --;

        System.out.println("栈桢指向：" + index);
    }


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
        this.index = -1;
    }

//    有参构造方法
    public MyStack(Object[] elements) {
        this.elements = elements;
    }
}
