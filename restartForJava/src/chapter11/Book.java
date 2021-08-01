package chapter11;

public class Book {
        //    属性名称
        private String title;
        //    属性：页数
        private int pageNum = 200;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void detail(String title, int pageNum){
        if (pageNum < 200){
            System.out.println("您输入的页码有误，请重新输入");
            return;
        }
        System.out.println("书名为：" + title + "页数为" + pageNum);
    }
}
