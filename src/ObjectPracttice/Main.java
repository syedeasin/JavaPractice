package ObjectPracttice;

import java.util.List;

public class Main {
    public static void printObjectData(List<Person> personList) {
        for(Person person : personList) {
            System.out.println("Name: " + person.getName() + " and Age: " + person.getAge());
        }
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Easin",25),new Person("Asif",24));
        printObjectData(personList);
    }

}
