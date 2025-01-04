package teachmeskills.lesson8.example1.homework2;

public class Ranner {
    public static void main(String[] args) {
        Buhgalter buhgalter = new Buhgalter("buhgalter");
        Director director = new Director("director");
        Worker worker = new Worker("worker");


        worker.doPost();
        director.doPost();
        buhgalter.doPost();

    }
}
