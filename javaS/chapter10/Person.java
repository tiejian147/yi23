/**
 * person表示人类：
 * 每一个人都有年龄这样的属性；
 * 年龄age，int类型
 * 这里先不做封装机制，分析程序存在什么缺点？
 *  Person类的age属性对外暴露，可以再外部程序中随意访问，导致了不安全。
 */

 /*
public class Person{
    //定义人类
    //实例变量，属性
    //age属性是暴露的，在外部程序中可以随意访问，
    //导致了不安全
    int age;
    
}
*/

//尝试封装一下：
//不再对外暴露复杂的数据，封装起来
//对外只提供简单的操作入口
//有点：第一数据安全了，第二调用者也方便了
public class Person{
    //private表示私有的，被这个关键字修饰之后，该数据只能在本类中访问。
    //出了这个类就不能访问了。私有的
    private int age;

    /*对外提供简单的访问入口
    外部程序只能通过调用一下的代码来完成访问；
    思考：应该对外提供几个访问入口：
    写一个方法专门来完成读（get）
    写一个方法专门来完成写（set）
    get和set方法应该带有static，还是不该带有static ？
    get和set应该定义为实例方法
    get读年龄，set改年龄，这个读和改都是操作的一个对象的年龄，（没有对象何来年龄？）
    封装的第二步：对外提供公开的set方法和get方法作为操作入口，并且都不带static   
    方法的语法结构：
        [修饰符列表] 返回值类型 方法名(形式参数列表){

        }

    注意：
        java开发规范中有要求，set方法和get方法要满足以下格式：这是规范，统一这样写。
            get方法的要求：
                public 返回值类型 get+属性名首字母大写(无参){
                    return xxx;
                }
            
            set方法的要求：
                public void set+属性名首字母大写(有一个参数){
                    xxx = 参数;
                }
            尽量按照java规范中要求的格式提供get和set方法。
            如果不按照这个规范格式来，那么你的程序将不是一个通过的程序。
    */
    //get 方法
    public int getAge(){
        return age;
    }
    //set 方法
    public void  setAge(int nianLing){
        //可以在此位置上进行逻辑判断
        if(nianLing < 0 || nianLing > 150){
            System.out.println("年龄非法");
            return;
        }
        //程序能够执行到这里，说明年龄一定是合法的。
        age = nianLing;
    }

}