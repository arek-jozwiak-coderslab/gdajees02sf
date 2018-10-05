package pl.coderslab.day1.design2;

import pl.coderslab.day1.design2.interfaces.Observer;
import pl.coderslab.day1.design2.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {

    List<Observer> observers;

    public Post() {
        this.observers = new ArrayList<>();
    }

    private String content;
    private String title;


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title);
        }
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
