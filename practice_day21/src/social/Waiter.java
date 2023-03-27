package social;

public class Waiter extends Staff{
    public Waiter(String name, double salary) {
        super(name, salary);
    }
    public void info(){
        System.out.println("该服务生的工资是" + (getSalary() * getWork_days()));
    }
}
