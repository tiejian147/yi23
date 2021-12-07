package chapter19.homework;



/*
压栈的作业题，模仿压栈

 */
public class MyStack {
    //向栈中存储元素，我们这里使用一维数组模拟，存到栈中，就表示存储到数组中。
//    因为数组是我们学习java的第一个容器；
//    为什么选择Object类型的数组？因为这个栈可以存储java中任何引用类型的数据；
//    new Animal()对象可以放进去，new Person()对象也可以放进去，因为Animal和Person的超级父类就是Object。
//    包括String也可以存储进去，因为String父类 也是Object
//    默认栈的初始化容量是10；
//    private Object[] elements = new Object[10];
    private Object[] elements;

    //    栈帧，永远指向栈顶部元素
//    那么这个默认初始值应该是多少，注意：最初的栈帧是空的，一个元素也没有
    private int index = -1;

    //set 和 get 也许用得上，也许用不上，但是这是规矩，必须要写上，用IDEA生成就行了。
//    封装第一步：属性私有化，第二步：对外提供set and get方法；
    public Object[] getElements() {

        return elements;
    }

    public void setElements(Object[] elements) {

        this.elements = elements;
    }
//  无参数的构造方法  默认初始化容量是10
    public MyStack() {
//        可以在这里写容量，也可以在上面写容量  16行
        this.elements = new Object[10];
//        给index初始化
        this.index = -1;
    }

//    提供一个压栈的方法

    /**
     * 压栈的方法
     * @param obj  被压的元素
     */
    public void push(Object obj){
        if (this.index >= this.elements.length - 1){
            System.out.println("栈已满，压栈失败！");
            return;
        }
//        程序执行到这里，说明栈没有满
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈" + obj +"成功，栈帧指向：" + index);
    }

//    弹栈方法

    /**
     * 弹栈的方法，从数组中往外取元素，每取出一个元素，栈帧向下移动一位
     * @return
     */
    public Object pop(){
        if (index < 0){
            System.out.println("弹栈失败，栈已空");
//            必须要写null  因为这个方法要求有返回值；
            return null;
        }
//        程序执行到这里说明栈还没有空
        System.out.print("弹栈" + this.elements[index] + "元素成功");
        index-- ;
        System.out.println("栈帧指向：" + index);
        return null;
    }

}
