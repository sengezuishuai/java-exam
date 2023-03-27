package teachers_and_students;

public class text {
    public static void main(String[] args) {
        Person person[] = new Teacher[2];
        Person person1[] = new Student[2];
        To_sort to_sort = new To_sort();
        person[0] = new Teacher("jack",'男',23,5);
        person[1] = new Teacher("marry",'女',34,10);
        person1[0] = new Student("xiaom",'男',18,"3753525jsdjf");
        person1[1] = new Student("fsjk",'男',19,"7534757ds");
        person = to_sort.to_sort(person);
        person1 = to_sort.to_sort(person1);
        Teacher teacher = (Teacher)person[0];
        Teacher teacher1 = (Teacher)person[1];
        Student student = (Student) person1[0];
        Student student1 = (Student) person1[1];
        teacher.info();
        teacher1.info();
        student.info();
        student1.info();
        //teacher.setWork_age(2);
        //teacher.setWork_age(8);
        //((Teacher) person[0]).info();
        //((Teacher) person[1]).info();
        //person = to_sort.to_sort(person);
    }
}
