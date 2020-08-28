package com.tiejian147.collection;

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

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Students)) return false;
        if(obj == this) return  true;
        Students s = (Students)obj;
        return this.name.equals(s.name);
    }


}
