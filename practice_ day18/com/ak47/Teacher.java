package com.ak47;

public class Teacher extends useful{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say(){
        return super.say() + "salary=" + salary;
    }

    public void teach(){
        System.out.println("老师" + getName() + "正在将java");
    }
}
