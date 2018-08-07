package pl.coderslab.day2;

@FunctionalInterface
public interface Transform<T, S> {

    T transform(S s);
}
