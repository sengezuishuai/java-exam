package social;

public class Peasant extends Staff{
    public Peasant(String name, double salary) {
        super(name, salary);
    }
    public void info(){
        System.out.println("该农民的工资是" + (getSalary() * getWork_days()));
    }
}
