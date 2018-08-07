package pl.coderslab.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    static <T, S> void printList(List<S> src, Filter<S> fil, Transform<T, S> trans) {
        for (S s : src) {
            if (fil.check(s)) {
                System.out.println(trans.transform(s));
            }
        }
    }
    static <T, S> List<T> createList(List<S> src, Filter<S> fil, Transform<T, S> trans) {
        List<T>  someList = new ArrayList<>();
        for (S s : src) {
            if (fil.check(s)) {
                someList.add(trans.transform(s));
            }
        }
        return someList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 44);

        printList(list, new NumberFiter(), new Transform<String, Integer>() {

            @Override
            public String transform(Integer integer) {
                integer--;
                return integer.toString();
            }
        });
    }
}
