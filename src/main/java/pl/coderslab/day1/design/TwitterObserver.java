package pl.coderslab.day1.design;

import pl.coderslab.day1.design.interfaces.Observer;

public class TwitterObserver implements Observer {
    @Override
    public void update(Post post) {
        System.out.println("SEND to Twitter" +  post.getContent());
    }
}
