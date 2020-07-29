package javase.chapter20.com.tiejian147.javase.integer;

/**
 * 这种包装类目前是我自己写的，实际开发中我们不需要自己写。
 * 8种基本数据类型对应的8中包装类，SUN公司已经写好了，我们直接用。
 */

public  class MyInt {
    private int age;

    public MyInt(int age) {
        this.age = age;
    }

    public MyInt() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyInt{" +
                "age=" + age +
                '}';
    }
}
