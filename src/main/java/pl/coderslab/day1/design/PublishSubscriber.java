package pl.coderslab.day1.design;

import java.util.ArrayList;
import java.util.List;

public class PublishSubscriber implements Subject {
    private int viewCount;

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    List<Observer> observers;

    public PublishSubscriber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Post post) {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }


    public void updatePost(Post post) {
        System.out.println("DO STH");
        viewCount++;
        notifyObservers(post);
    }
}
