package pl.coderslab.day2;

import java.util.ArrayList;
import java.util.List;

public class NumberFiter implements Filter<Integer> {
    @Override
    public boolean check(Integer integer) {
        List<String> strings = new ArrayList<>();
        return integer < 20;
    }
}
