package com.m4a1;

public class Employee  {
    private String name;
    private double privates;

    public Employee(String name, double privates) {
        this.name = name;
        this.privates = privates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrivates() {
        return privates;
    }

    public void setPrivates(double privates) {
        this.privates = privates;
    }

    public double getPrivatess(double earning){
        return earning * 12;
    }
}
