package com.m4a1;

public class Staff extends Employee{
    public Staff(String name, double privates) {
        super(name, privates);
    }
    public void work(){
        System.out.println("打工人");
    }
    public void info(){
        System.out.println(getName() + getPrivates()
        + getPrivatess(getPrivates()));
    }
}
