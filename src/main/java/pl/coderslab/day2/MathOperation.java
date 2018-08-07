package pl.coderslab.day2;

@FunctionalInterface
public interface MathOperation {
    int operate(int i1, int i2);

    default  int operate1(int i1, int i2){
        return 12;
    }
}