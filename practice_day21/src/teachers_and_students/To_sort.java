package teachers_and_students;

public class To_sort {
    public Person[] to_sort(Person person[]){
        Person person1 = new Person();
        for (int i = 0; i < person.length - 1; i++) {
            if (person[i].getAge() < person[i + 1].getAge()){
                person1 = person[i];
                person[i] = person[i + 1];
                person[i + 1] = person1;
            }
        }
        return person;
    }
}
