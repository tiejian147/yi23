/**
 * 一、请通过代码封装，实现如下需求：
 *      编写一个类book，代表教材：
 *      1、具有属性：名称（title）、页数（pageNum）
 *      2、其中页数不能少于200页，否则输出错误信息，并赋予默认值200；
 *      3、为各属性提供赋值和取值方法。
 *      4、具有方法：detail，用来在控制台输出每本教材的名称和页数
 *      5、编写测试类BookTest进行测试，为Book对象的属性赋予初始值，并调用Book对象的detail方法。
 * 
 * 二、写一个名为Account的类模拟账户
 *      该类的属性和方法如下所示：
 *      该类包括的属性：账户id，余额balance，年利率annualInterestRate：
 *      包涵的方法：各属性的set和get方法，取款方法withdraw(),存款方法：deposit();
 * 
 * 写一个测试程序：
 *      1、创建一个Customer，名字叫Jane Smith ，他有一个账号为1000，余额为2000，年利率为：
 *      2、对Jane Smith 操作：
 *      存入100元，再取出960元，再取出2000；
 *      打印Jane Smith的基本信息
 *      信息如下显示：
 *      成功存入：100
 *      成功取出：960
 *      余额不足，取钱失败
 *      
 * 三、（封装）已知一个类： Student 代码如下：
 *      class Student(
 *          String name;
 *          int age;
 *          String address;
 *          String zipCode;
 *          String mobile;
 *      )
 *      
 *      要求：
 *          1、把student 的属性都作为私有，并提供get/set方法以及适当的构造方法
 *          2、为student 类添加一个getPostAddress方法，要求返回Student对象的地址和邮编
 * 
 */


/*
* 一、请通过代码封装，实现如下需求：
*      编写一个类book，代表教材：
*      1、具有属性：名称（title）、页数（pageNum）
*      2、其中页数不能少于200页，否则输出错误信息，并赋予默认值200；
*      3、为各属性提供赋值和取值方法。
*      4、具有方法：detail，用来在控制台输出每本教材的名称和页数
*      5、编写测试类BookTest进行测试，为Book对象的属性赋予初始值，并调用Book对象的detail方法。
*/
public class Book {
    //书的属性  名称  实例变量
    
    private String title;
    //页数  实例变量
    private int pageNum;

    //手动写一个get--title
    public String getTitle(){
        return title;
    }

    //手动写一个set--title
    public void setTitle(String bookName){
        title = bookName;
    }

    //手动写一个get -- pageNum
    public int getPageNum(){
        return pageNum;
    }

    //手动写一个set-- pageNum
    public void setPageNum(int takeNum){
        if(takeNum > 200 || takeNum < 0){
            System.out.println("没有这一页");
            takeNum = 200;
        }

        pageNum = takeNum;
    }

    







}