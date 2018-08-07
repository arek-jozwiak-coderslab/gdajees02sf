package pl.coderslab.day1.design;

import java.util.function.Consumer;

public interface Subject {

    void attach(Observer observer);
    void dettach(Observer observer);
    void notifyObservers(Post post);



}
