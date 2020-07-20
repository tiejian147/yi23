package day23;

/**
 * 编写程序，来模拟弹栈和压栈
 * 要求：
 * 1、这个栈可以存储java中的任何引用类型的数据；
 * 2、在栈中提供push方法模拟压栈（栈满了，要有提示信息）
 * 3、在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
 * 4、编写测试程序，new对象，调用push pop方法来模拟压栈和弹栈的动作；
 * 5、假设栈的默认初始化容量是10；（需注意无参数构造方法的编写方式）
 */

public class MyStack {
    //    声明一个数组属性来表示数组
    private Object[] elements;
    //      声明一个整型属性来表示下标
    private int index;

    /**
     * 编写一个push方法  模拟压栈
     */

    public void push(Object obj) {
        if (index >= this.elements.length - 1) {
            System.out.println("压栈已满");
            return;
        }
//        说明压栈还没满
        index++;
        elements[index] = obj;
        System.out.println("压栈数为：" + index + ",数组的地址：" + elements[index]);
    }

    /**
     * 弹栈的方法
     */
    public void pop() {
        if (index < 0) {
            System.out.println("弹栈已空");
            return;
        }
//        程序执行到这里，说明弹栈还未结束
        System.out.println("内存地址：" + elements[index]);
        index--;
        System.out.println("数组：" + index);
        System.out.println("数组长度：" + elements.length);
    }

//    无参构造方法

    public MyStack() {
        this.elements = new Object[10];
        this.index = -1;
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
