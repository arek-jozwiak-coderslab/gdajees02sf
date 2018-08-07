package pl.coderslab.day1;

public class SimpleSingleton {


    private static SimpleSingleton INSTANCE;

    private SimpleSingleton() {
    }
    public static SimpleSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }
}
