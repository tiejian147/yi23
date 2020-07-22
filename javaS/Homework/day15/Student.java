/**
 *  三、（封装）已知一个类： Student 代码如下：
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
 */


public class Student {
   

    //main方法入口
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setAddress("北京市西城区");
        s1.setZipCode("00001");
        s1.getPostAddress();
    }
    //声明各种属性变量
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    //构造无参数方法
    public Student(){
        
    }
    //构造有参数方法
    public Student(String name, int age, String address, String zipCode, String mobile){
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;

    }
    //setter and getter 方法
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getMobile(){
        return mobile;
    }

    public void setName(String name){
        this.name = name; 
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public void setMobile(){
        this.mobile = mobile;
    }

    //提供一个getPostAddress方法，要求返回student的地址和邮编
    public void getPostAddress(){
        System.out.println("地址为" + address + ",邮编为" + zipCode);
    }

}