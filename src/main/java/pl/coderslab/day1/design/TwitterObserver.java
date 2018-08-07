package pl.coderslab.day1.design;

public class TwitterObserver implements Observer {
    @Override
    public void update(Post post) {
        System.out.println("ROBIE COS INNEGO");
    }
}
