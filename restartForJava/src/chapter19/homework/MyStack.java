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
    private Object[] elements;

    //set 和 get 也许用得上，也许用不上，但是这是规矩，必须要写上，用IDEA生成就行了。
//    封装第一步：属性私有化，第二步：对外提供set and get方法；
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
