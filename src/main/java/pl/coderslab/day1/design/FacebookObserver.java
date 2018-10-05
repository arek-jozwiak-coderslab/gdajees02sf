package pl.coderslab.day1.design;

import pl.coderslab.day1.design.interfaces.Observer;

public class FacebookObserver implements Observer {

    @Override
    public void update(Post post) {
        System.out.println("SEND to FACEBOOK" + post.getContent());
    }
}
