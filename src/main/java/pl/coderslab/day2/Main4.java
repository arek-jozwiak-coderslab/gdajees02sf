package pl.coderslab.day2;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {


        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        sub.operate1(1,2);

        System.out.println(add.operate(2, 2));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        Predicate<Object> isString = o1 -> {
            if(o1 instanceof String){
                System.out.println(o1);
                return true;
            }
            return false;
        };
        String s = "asd";
        Object o = new Object();
        isString.test(s);
//        System.out.println(isString.test(o));

        Function<Double, Double> sqrt = n->n*n;


    }
}
