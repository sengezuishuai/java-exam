package social;

public class Scientist extends Staff{

    private double Yearendawards;

    public Scientist(String name, double salary, double yearendawards) {
        super(name, salary);
        Yearendawards = yearendawards;
    }

    public void info(){
        System.out.println("该科学家的工资是" + (getSalary() * getWork_days() + Yearendawards));
    }
}
