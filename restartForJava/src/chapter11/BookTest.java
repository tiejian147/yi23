package chapter11;

public class BookTest {
    public static void main(String[] args) {
//        new 一本书
        Book b1 = new Book();
        b1.setTitle("三国演义");
        System.out.println(b1.getTitle() + "的页数为" + b1.getPageNum() + "页");

        b1.detail("西游记，",200);
        b1.detail("水浒传，",400);
    }
}
