package pl.coderslab.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main5 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.forEach(a -> System.out.println(a));


        list.forEach(System.out::println);

        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "capple", "pomelo");

        List<String> newList = fruits.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newList);

        List<String> newOldWayList = new ArrayList<>();
        for (String fruit : fruits) {
            if(fruit.startsWith("c")){
                newOldWayList.add(fruit.toUpperCase());
            }
        }
        Collections.sort(newOldWayList);

        System.out.println(newOldWayList);

//        int[] a = new int[12];
//        Arrays.stream(a)
//                .sorted()
//                .forEach(System.out::println);

        String s = "asd321";
        s.chars().forEach(sa->{System.out.println(sa);});
    }
}
