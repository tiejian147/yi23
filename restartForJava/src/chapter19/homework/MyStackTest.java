package chapter19.homework;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
//        这个元素就压不进去了
        stack.push(new Object());

//        弹栈
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        栈空了
        stack.pop();

    }
}
