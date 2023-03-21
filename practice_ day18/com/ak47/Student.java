package com.ak47;

public class Student extends useful{
    private double scoce;
    public Student(String name, int age, int i) {
        super(name, age);
    }

    public double getScoce() {
        return scoce;
    }

    public void setScoce(double scoce) {
        this.scoce = scoce;
    }

    public String say(){
        return super.say() + "score" + '\t' + scoce;
    }
    public void study(){
        System.out.println("学生" + getName() + "正在学习");
    }
}
