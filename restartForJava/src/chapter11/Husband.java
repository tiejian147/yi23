package chapter11;

public class Husband {
//    实例变量 身份证号
     int idNo;
//    实例变量 姓名
     String name;
//    实例变量 出生日期
     String birthday;
//    实例变量 妻子
     Wife xiaoXiong;

    public int getIdNo() {
        return idNo;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Wife getXiaoXiong() {
        return xiaoXiong;
    }

//    有参数的构造器

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setXiaoXiong(Wife xiaoXiong) {
        this.xiaoXiong = xiaoXiong;
    }
}
