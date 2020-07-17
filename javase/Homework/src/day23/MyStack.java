package day23;

public class MyStack {
    private Object[] elements;

    private int index;

    /**
     * 编写一个push方法  模拟压栈
     */

    public void push(Object obj){
        if(index >= this.elements.length -1){
            System.out.println("压栈已满");
            return;
        }
//        说明压栈还没满
        index ++;
        elements[index] = obj;
        System.out.println("压栈数为：" + index + ",数组的地址：" + elements[index]);
    }

    /**
     * 弹栈的方法
     */
    public void pop(){
        if(index < 0){
            System.out.println("弹栈已空");
            return ;
        }
//        程序执行到这里，说明弹栈还未结束
        System.out.println("内存地址：" + elements[index]);
        index -- ;
        System.out.println("数组：" + index);
        System.out.println("数组长度：" + elements.length);
    }

//    无参构造方法

    public MyStack() {
        this.elements = new Object[10];
        this.index= -1;
    }

//    有参构造方法

    public MyStack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }


//    setter he getter

    public Object[] getElements() {
        return elements;
    }

    public int getIndex() {
        return index;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
