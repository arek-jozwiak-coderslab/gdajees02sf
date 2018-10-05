package pl.coderslab.day1.design;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.setContent("Some content");

        PublishSubscriber publishSubscriber = new PublishSubscriber();
        publishSubscriber.attach(new FacebookObserver());
        publishSubscriber.attach(new TwitterObserver());
        publishSubscriber.update(post);


    }
}
