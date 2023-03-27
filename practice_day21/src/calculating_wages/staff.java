package calculating_wages;

public class staff {//staff作为父类
    private double day_salary;
    private String name;
    private double work_days;
    private double grade;

    private double all_salary;

    public void info(){
        all_salary = day_salary * work_days * grade;
        System.out.println("该员工的工资为" + all_salary);
    }

    public staff(double day_salary, String name, double work_days, double grade, double all_salary) {
        this.day_salary = day_salary;
        this.name = name;
        this.work_days = work_days;
        this.grade = grade;
        this.all_salary = all_salary;
    }

    public double getDay_salary() {
        return day_salary;
    }

    public void setDay_salary(double day_salary) {
        this.day_salary = day_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWork_days() {
        return work_days;
    }

    public void setWork_days(double work_days) {
        this.work_days = work_days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getAll_salary() {
        return all_salary;
    }

    public void setAll_salary(double all_salary) {
        this.all_salary = all_salary;
    }
}
