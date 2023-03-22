package homework;

public abstract class Person {
    String name;
    int age;
    String job;
    Preson1 person[] = new Preson1[3];
    //person[0] = new Person1("jack",18,"play");
}

class Preson1{
   String name;
   int age;
   String job;

    public Preson1(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
