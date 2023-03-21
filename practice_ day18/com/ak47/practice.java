package com.ak47;
public class practice {
    public static void main(String[] args) {
        useful persons[] = new useful[5];
        persons[0] = new useful("jack",20);
        persons[1] = new Student("jak",21,100);
        persons[2] = new Student("jadsck",40,100);
        persons[3] = new Teacher("jackds",2430,20000);
        persons[4] = new Teacher("jackdssd",220,10000);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student){
                Student student = (Student) persons[i];
                student.study();
            }else if (persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else
                System.out.println("你的类型有误");

            System.out.println(persons[i].say());
        }
    }
}
