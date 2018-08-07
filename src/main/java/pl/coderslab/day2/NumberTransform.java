package pl.coderslab.day2;

public class NumberTransform implements Transform<String, Integer> {
    @Override
    public String transform(Integer integer) {
        integer--;
        return integer.toString();
    }
}
