package calculating_wages;

public class General_staff extends staff{//普通员工作为子类
    public General_staff(double day_salary, String name, double work_days, double grade, double all_salary) {
        super(day_salary, name, work_days, grade, all_salary);
    }
    private double salary;


    public void info(){
        salary = getDay_salary() * getWork_days() * getGrade();
        System.out.println("该员工的工资是" + salary);
    }
}
