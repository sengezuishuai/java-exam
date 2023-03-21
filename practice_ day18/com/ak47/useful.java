package com.ak47;

public class useful {
    private String name;
    private int age;

    public useful(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){//返回名字和年龄
        return name + '\t' + age;
    }

}
