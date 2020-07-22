/**
 * 方法覆盖比较经典的案例
 * 一定要注意：
 *      方法覆盖/重写的时候，建议将父类的方法复制粘贴，这样比较保险。
 */

public class OverrideTest03 {
    public static void main(String[] args){
        //如果传有参的方法会报错：没有这样的构造方法
        // Chinese c1 = new Chinese("张三");
        //创建中国人对象
        Chinese c1 = new Chinese();
        c1.setName("张三");
        c1.speak();


        //创建美国人对象
        American a1 = new American();
        a1.setName("jack");
        a1.speak();
    }
}

//创建人 -- 类
class People{
    //实例变量，属性
    private String name;
    //构造方法--无参
    public People(){

    }
    //构造方法--有参
    public People(String name){
        this.name = name;
    }
    //setter and getter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //说话的方法
    public void speak(){
        System.out.println(name + "......");
    }


}

//中国人类
class Chinese extends People{
    public void speak(){
        System.out.println(this.getName() + "说汉语");
    }
}

//美国人类
class American extends People{
    public void speak(){
        System.out.println(this.getName() + "say English");
    }
}
