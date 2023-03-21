package com.m4a1;

public class Manage extends Employee{
    private double bonus;

    public Manage(String name, double privates, double bonus) {
        super(name, privates);
        this.bonus = bonus;
    }



    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("我是经理我牛逼");
    }

    public void info(){
        System.out.println(getName() + getPrivates() + getBonus()
        + getPrivatess(getPrivates()));
    }
}
