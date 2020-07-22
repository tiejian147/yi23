/**
 * 通过这个测试得出结论：
 *      super 不是引用。super也不保存内存地址，super也不指向任何对象。
 *      super 只是代表当前对象内部的那一块父类型的特征。
 * 
 */

 public class SuperTest06{
     //实例方法
     public void doSome(){
         System.out.println(this);//SuperTest06@7852e922
         //输出“引用”的时候，会自动调用引用的toString()方法
         //System.out.println(this.toString());

         //如果打印super呢？
         //编译错误：提示：  需要“.”
        //  System.out.println(super);
     }

     public static void main(String[] args){
        SuperTest06 st = new SuperTest06();
        st.doSome();
     }
 }