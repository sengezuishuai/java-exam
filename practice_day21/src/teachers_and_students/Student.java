package teachers_and_students;

public class Student extends Person{
    private String  stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void info(){
        System.out.println("学生的信息如下：");
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("学号：" + stu_id);
        play(getName());
        study();
    }

    public void play(String name){
        System.out.println(name + "喜欢打篮球");
    }

    public void study(){
        System.out.println("我承诺，I like english very much");
    }
}
