package pl.coderslab.day1.design.interfaces;

import pl.coderslab.day1.design.Post;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Post post);

}
