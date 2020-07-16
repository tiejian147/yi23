package day23;

public class MyStack01 {
//    建立一个数组的属性
    private Object[] element;

//    建立一个压栈数的属性   元素下标
    private int index;

//    创建setter 和 getter

    public Object[] getElement() {
        return element;
    }

    public int getIndex() {
        return index;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public void setIndex(int index) {
        this.index = index;
    }

//    创建无参构造方法

    public MyStack() {
    }

//    创建有参构造方法


    public MyStack(Object[] element, int index) {
        this.element = element;
        this.index = index;
    }
}
