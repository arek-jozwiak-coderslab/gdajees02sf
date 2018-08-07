package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal(); //klasa abstrakcyjna nie można
//        Snake s = new Snake();
//        s.getNoOfLegs();
//        s.walk();
//
//        Animal as = new Snake();
//        as.getNoOfLegs();
//        as.walk();
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(s);
//        animals.add(as);
//        for (Animal animal : animals) {
//            animal.walk();
//
//        }


        List<String> names = new ArrayList<>();
        names.add("zzz");
        names.add("aaaa");
        names.add("bbb");
        Collections.sort(names);
        for (String name : names) {
//            System.out.println(name);
        }


        List<Person> people = new ArrayList<>();
        people.add(new Person("zzz", "zzzz1"));
        people.add(new Person("zzz", "aaa"));
        people.add(new Person("kkk", "aaa1"));
        people.add(new Person("aaa", "bb1"));
        Collections.sort(people);



        for (Person person : people) {
            System.out.println(person.getLastName() + " " +  person.getFirstName());
        }
    }
}
