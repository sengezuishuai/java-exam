package homework_1;



public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;
    public  void introduce(String name,int age,
                             String post,double salary,double grade){
        name = this.name;
        age = this.age;
        post = this.post;
        salary = this.salary;
        grade = this.grade;
        System.out.println("name" + name + "age" + age +"post"
                + post + "salary" + salary +"grade" + grade);
    }

    public Teacher(String name, int age, String post, double salary,double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
