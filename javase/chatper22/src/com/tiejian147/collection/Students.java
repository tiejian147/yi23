package com.tiejian147.collection;

import java.util.Objects;

public class Students {
    private String name;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*//    这是自己的的equals方法
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Students)) return false;
        if(obj == this) return  true;
        Students s = (Students)obj;
        return this.name.equals(s.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
