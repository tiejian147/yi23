

public class BookTest {
    public static void main(String[] args){
        BookTest b1 = new BookTest();

        b1.detail("鹿鼎记",20);

    } 

    public void detail(String title, int pageNum){
        Book b1 = new Book();

        // b.title = "理智与情感";
        //设置书名
        b1.setTitle(title);

        // System.out.println(b1.getTitle());
        //设置页数
        b1.setPageNum(pageNum);

        // System.out.println("您现在翻到的是" + b1.getTitle() + "的第" + b1.getPageNum() + "页");

        // b1.setPageNum(-1);

        System.out.println("您现在翻到的是" + b1.getTitle() + "的第" + b1.getPageNum() + "页");
    }
    
    


}