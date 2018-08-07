package pl.coderslab.day2;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);

}