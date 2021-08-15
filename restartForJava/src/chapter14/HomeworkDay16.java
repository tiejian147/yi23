package chapter14;

public class HomeworkDay16 {
    public static void main(String[] args) {
        TestA ta1 = new TestA(5);
        ta1.findNum1();
    }
}

class TestA{
    private int num1;

    public TestA() {
    }

    public TestA(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }



    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void findNum1(){
        System.out.print("请输入一个整数数字：");
        java.util.Scanner s1 = new java.util.Scanner(System.in);
        int n5 = s1.nextInt();
        System.out.println("您输入的数字为：" + n5);
    }


}

class TestB extends TestA{
    public void difNum(){

    }
}
