package pl.coderslab.day2;

import java.util.Arrays;
import java.util.List;

public class Main1 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 44);
        printList(list, new NumberFiter());
        printList(list, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        });
        printList(list,  iaia -> iaia < 20);
    }

    static <T> void printList(List<T> src, Filter<T> filter) {
        for (T s : src) {
            if (filter.check(s)) {
                System.out.println(s);
            }
        }
    }


}
