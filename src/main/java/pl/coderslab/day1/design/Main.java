package pl.coderslab.day1.design;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.setContent("Some content");
        FacebookObserver facebookObserver = new FacebookObserver();
        PublishSubscriber publishSubscriber = new PublishSubscriber();
        publishSubscriber.attach(facebookObserver);
        publishSubscriber.attach(new TwitterObserver());
        publishSubscriber.updatePost(post);


    }
}
