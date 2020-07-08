package AccessControlRights;

public class RightTest {
    public static void main(String[] args) {
        User user1 = new User();

        //private 修饰的元素只能再本类中用
//        System.out.println(user1.id);//这行编译会报错
        System.out.println(user1.age);
        System.out.println(user1.weight);
        System.out.println(user1.name);

    }
}
