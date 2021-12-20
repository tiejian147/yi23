package chapter21;
/*
finally
    1、java中有一条这样的规则：
        方法体中的代码必须遵循自上而下的顺序依次逐行执行；
    2、还有一条这样的规则：
        return语句一旦执行，整个方法必须结束；
 */
public class ExceptionTest12 {
    public static void main(String[] args) {

        System.out.println(m());//这里的结果是100
    }

    public static int m(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }
}
