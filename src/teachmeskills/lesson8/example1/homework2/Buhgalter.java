package teachmeskills.lesson8.example1.homework2;

public class Buhgalter implements Post{
    String post;

    Buhgalter(String post) {
        this.post = post;
    }


    @Override
    public void doPost() {
        System.out.println(post);
    }
}