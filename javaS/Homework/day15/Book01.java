/**
 * 一、请通过代码封装，实现如下需求：
 *      编写一个类book，代表教材：
 *      1、具有属性：名称（title）、页数（pageNum）
 *      2、其中页数不能少于200页，否则输出错误信息，并赋予默认值200；
 *      3、为各属性提供赋值和取值方法。
 *      4、具有方法：detail，用来在控制台输出每本教材的名称和页数
 *      5、编写测试类BookTest进行测试，为Book对象的属性赋予初始值，并调用Book对象的detail方法。
 */

 public class Book01{
     public static void  main(String[] args){
        Book01 b1 = new Book01("三国",230);
        
        // System.out.println("这本书名字叫" + b1.title + "共有" + b1.pageNum + "页");

        // b1.setPageNum(300);

        // System.out.println("这本书名字叫" + b1.title + "共有" + b1.pageNum + "页");
        b1.detail();

        b1.setTitle("西游记");

        b1.setPageNum(300);

        b1.detail();

     }
     //属性名称
    private String title;
     //属性页数
    private int pageNum;

     //编写无参数构造方法
     public Book01(){

     }


     //编写有参数构造方法
     public Book01(String title,int pageNum){
         if(pageNum < 200){
            System.out.println("页数不能少于200");
            pageNum =200;
         }

        // System.out.println("这本书名字叫" + );
        this.title = title;
        this.pageNum = pageNum;

     }

     

     //编写get方法--title

     public String  getTitle(){
         return title;
     }

     //编写get方法--pageNum
     public int  getPageNum(){
         return pageNum;
     }

     //编写set方法--title
     public void setTitle(String bookName){
        title = bookName;
     }

     //编写set方法--pageNum
     public void setPageNum(int bookPageNum){
         if(bookPageNum < 200 ){
            System.out.println("页码不存在");
            pageNum = 200;
         }
        pageNum = bookPageNum;
     }

     //再提供一个detail方法
     public void detail(){
        System.out.println("这本书名字叫" + title + "共有" + pageNum + "页");
     }
     
 }

