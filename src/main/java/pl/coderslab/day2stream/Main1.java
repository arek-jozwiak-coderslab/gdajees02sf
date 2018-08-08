package pl.coderslab.day2stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fasgdaz");
        list.add("afazfzsfd");
        list.add("rgsfdaf");
        list.add("gas4ragg");
        list.add("nsdag");
        list.add("q");
        list.add("qqqqq");
        list.add("zzggas");
        list.add("pot8ity");
        list.add("spot8ity");

        list.stream().filter(s -> (s.startsWith("a") || s.startsWith("s")))
                .sorted()
                .map(o -> o.toUpperCase())
                .forEach(s -> System.out.println(s));


        List<String> newList = list.stream()
                .filter(s -> (s.length() == 5))
                .distinct()
                .collect(Collectors.toList());

        newList.forEach(System.out::println);

        String str = list.stream()
                .map(s -> {
                    if (s.length() > 3) {
                        return s.substring(0, 3);
                    }
                    return "";
                })
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();
        Collections.sort(list);
        for (String s : list) {
            if (s.length() > 3) {
                stringBuilder.append(s.substring(0, 3)).append(",");
            }
        }
    }
}
