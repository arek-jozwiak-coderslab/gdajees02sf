package pl.coderslab.day2stream;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("gadsgadg");
        list.add("gadsgg3q4tsgadg");
        list.add("zvaewgaz");
        list.add("agag43tsgradsgadg");
        
        list.stream().forEach(s -> System.out.println(s.length()) );
        list.stream().sorted().forEach(System.out::println);
        list.stream().filter(s -> s.contains("c")).forEach(System.out::println);
        System.out.println(list.stream().mapToInt(s -> s.length()).sum());
        list.stream().sorted().limit(3).forEach(System.out::println);
    }
    
}
