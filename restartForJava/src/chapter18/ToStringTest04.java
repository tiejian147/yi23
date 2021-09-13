package chapter18;

import chapter08.Address;

import java.util.Objects;
/*
练习 equals()方法重写，这个其实借助工具是可以一键生成的；
 */
public class ToStringTest04 {
    public static void main(String[] args) {
//        需要判断User类中的两个对象是否相等
        User u5 = new User("张三",new AddressOfUser("北京","朝阳区","111"));
        User u6 = new User("张三",new AddressOfUser("北京","朝阳区","111"));
        User u8 = new User("张三",new AddressOfUser("北京","朝阳区","113"));

        System.out.println(u5.equals(u6));//正确结果应该是true
        System.out.println(u5.equals(u8));//正确结果应该是false

    }
}

class User{
    String name;
    AddressOfUser addr;
//  有参和无参的构造方法
    public User() {
    }

    public User(String name, AddressOfUser addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof User)) return false;
        if(this == o) return true;
        User u11 = (User)o;
        if (this.name.equals(u11.name) && this.addr.equals(u11.addr)){
            return true;
        }
        return false;
    }


}

class AddressOfUser{
    String city;
    String street;
    String zipcode;
//    有参和无参的构造方法

    public AddressOfUser() {
    }

    public AddressOfUser(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
//  重写equals方法

    @Override
    public boolean equals(Object o) {
        if ((o == null) || !(o instanceof AddressOfUser)) return false;
        if (this == o) return true;
        AddressOfUser aou = (AddressOfUser) o;
        if(this.city.equals(aou.city)
                && this.street.equals(aou.street)
                && this.zipcode.equals(aou.zipcode)){
            return true;
        }
        return false;
        }

    }


