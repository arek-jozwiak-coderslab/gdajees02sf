package pl.coderslab.day1.design2;

import pl.coderslab.day1.design2.interfaces.Observer;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("SEND to Twitter: " + title);
    }
}
