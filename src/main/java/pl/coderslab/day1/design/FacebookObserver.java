package pl.coderslab.day1.design;

public class FacebookObserver implements Observer {

    @Override
    public void update(Post post) {
        System.out.println("treść post" + post.getContent());
    }
}
