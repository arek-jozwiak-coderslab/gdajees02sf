package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {

    public static void  some(Consumer<String> consumer,
                             Consumer<String> consumer1){

    }

    public static void main(String[] args) {

        some(p->{System.out.println("some1");
                 System.out.println("some2");
                                    }
            ,p->{System.out.println("some3");});

        List<Person> people = new ArrayList<>();
        people.add(new Person("zzz", "zzzz1"));
        people.add(new Person("zzz", "aaa"));
        people.add(new Person("kkk", "aaa1"));
        people.add(new Person("aaa", "bb1"));
        Collections.sort(people);


        for (Person person : people) {
            System.out.println(person.getLastName() + " " + person.getFirstName());
        }

        List<Person2> people2 = new ArrayList<>();
        people2.add(new Person2("zzz", "zzzz1"));
        people2.add(new Person2("zzz", "aaa"));
        people2.add(new Person2("kkk", "aaa1"));
        people2.add(new Person2("aaa", "bb1"));

        Collections.sort(people2, new PeopleComparator());

//        Collections.sort();

        Collections.sort(people2, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });



Collections.sort(people2, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));

    }
}
