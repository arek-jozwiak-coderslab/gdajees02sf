package pl.coderslab.day1.design2;

import pl.coderslab.day1.design2.interfaces.Observer;

public class FacebookObserver implements Observer {

    @Override
    public void update(String title) {
        System.out.println("SEND to FACEBOOK: " + title );
    }
}
