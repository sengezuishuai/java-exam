package teachers_and_students;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void play(String name){
        System.out.println(name + "喜欢蔡徐坤");
    }
    public void teach(){
        System.out.println("我承诺，我真的不喜欢蔡徐坤");
    }
    public void info(){
        System.out.println("老师的信息如下：");
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("工龄：" + work_age);
        play(getName());
        teach();
    }
}
