package pl.coderslab.day2stream;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().filter(n -> n * n - 5 < 20).forEach(System.out::println);
    }
    
}
