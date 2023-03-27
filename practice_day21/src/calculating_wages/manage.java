package calculating_wages;

public class manage extends staff{//经理作为子类
    public manage(double day_salary, String name, double work_days, double grade, double all_salary) {
        super(day_salary, name, work_days, grade, all_salary);
    }
    private double salary;
    public void info(){
        salary = 1000 + getDay_salary() * getWork_days() * getGrade();
        System.out.println("该经理的工资是" + salary);
    }
}
