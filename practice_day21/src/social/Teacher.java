package social;

public class Teacher extends Staff{

    private double remuneration;

    public Teacher(String name, double salary, double remuneration) {
        super(name, salary);
        this.remuneration = remuneration;
    }

    public void info(){
        System.out.println("该老师的工资情况是" + ((getSalary() + remuneration) * getWork_days()));
    }
}
