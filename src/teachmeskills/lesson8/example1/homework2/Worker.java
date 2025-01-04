package teachmeskills.lesson8.example1.homework2;

public class Worker implements Post{
    String post;

    public Worker(String post) {
        this.post = post;
    }

    @Override
    public void doPost() {
        System.out.println(post);
    }
}
