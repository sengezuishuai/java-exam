package social;

public class Worker extends Staff{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void info(){
        System.out.println("该工人的工资是" + (getSalary() * getWork_days()));
    }
}
