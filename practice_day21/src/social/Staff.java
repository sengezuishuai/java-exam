package social;

public class Staff {
    private String name;
    private double salary;
    private int work_days = 365;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWork_days() {
        return work_days;
    }
}
