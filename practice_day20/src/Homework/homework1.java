package Homework;

//import java.util.Scanner;
//
//public class homework1 {
//    public static void main(String[] args) {
//        String name;
//        int age;
//        String job;
//        Scanner Sr = new Scanner(System.in);
//        Person person1[] = new Person[3];
//        Person person2 = new Person();
//        Person person[] = new Person[3];
//        for (int i = 0; i < person.length; i++) {
//            System.out.println("请输入名字");
//            name = Sr.next();
//            person[i].setName(name);
//            System.out.println("请输入年龄");
//            age = Sr.nextInt();
//            person[i].setAge(age);
//            System.out.println("请输入工作");
//            job = Sr.next();
//            person[i].setJob(job);
//        }
//        person1 = person2.to_sort(person);
//        for (int i = 0; i < person1.length; i++) {
//            System.out.println(person1[i].getName());
//            System.out.println(person1[i].getAge());
//            System.out.println(person1[i].getJob());
//        }
//    }
//}
//
//class Person{
//    private  String name ="";
//    private int age;
//    private String job;
//
//    public Person(String name, int age, String job) {
//        this.name = name;
//        this.age = age;
//        this.job = job;
//    }
//
//    public Person(Person[] person) {
//    }
//
//    public Person() {
//
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public Person[] to_sort(Person person[]){
//        Person person2 = new Person(person);
//        for (int i = 0; i < person.length - 1; i++) {
//            if (person[i].age < person[i + 1].age){
//                person2 = person[i];
//                person[i] = person[i + 1];
//                person[i + 1] = person2;
//            }
//        }
//        return person;
//    }
//}


import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        String name;
        int age;
        String job;
        Scanner Sr = new Scanner(System.in);
        Person person[] = new Person[3];
        for (int i = 0; i < person.length; i++) {
            System.out.println("请输入名字");
            name = Sr.next();
            person[i] = new Person(name, 0, "");
            System.out.println("请输入年龄");
            age = Sr.nextInt();
            person[i].setAge(age);
            System.out.println("请输入工作");
            job = Sr.next();
            person[i].setJob(job);
        }
        Person[] person1 = Person.to_sort(person);
        for (int i = 0; i < person1.length; i++) {
            System.out.println(person1[i].getName());
            System.out.println(person1[i].getAge());
            System.out.println(person1[i].getJob());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static Person[] to_sort(Person[] people) {
        Person[] sortedPeople = new Person[people.length];
        for (int i = 0; i < sortedPeople.length; i++) {
            sortedPeople[i] = people[i];
        }
        for (int i = 0; i < sortedPeople.length - 1; i++) {
            for (int j = 0; j < sortedPeople.length - 1 - i; j++) {
                if (sortedPeople[j].getAge() < sortedPeople[j + 1].getAge()) {
                    Person temp = sortedPeople[j];
                    sortedPeople[j] = sortedPeople[j + 1];
                    sortedPeople[j + 1] = temp;
                }
            }
        }
        return sortedPeople;
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
