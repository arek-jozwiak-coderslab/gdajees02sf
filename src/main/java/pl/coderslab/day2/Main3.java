package pl.coderslab.day2;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main3 {

    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 12;
        Predicate<String> predicate = s -> s.length() > 300;

        doSth(predicate);

        doSth(sup);
    }

    private static <T> void doSth(Supplier<T> supplier){

    }
    private static <T> void doSth(Predicate<T> supplier){

    }


}
