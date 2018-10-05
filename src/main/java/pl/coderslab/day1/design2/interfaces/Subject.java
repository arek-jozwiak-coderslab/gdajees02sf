package pl.coderslab.day1.design2.interfaces;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}
