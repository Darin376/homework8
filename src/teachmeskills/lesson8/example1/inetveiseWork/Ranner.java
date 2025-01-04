package teachmeskills.lesson8.example1.inetveiseWork;

public class Ranner {
    public static void main(String[] args) {
        Cat cat = new Cat("iriska", 1, "Pavel");
        Cat cat2 = new Cat("mysya", 3, "Tanya");

        Dog dog = new Dog("Villi", 12, "ilya", "milk");
        Dog dog2 = new Dog("Sili", 2, "Sanya", "akita");

        cat.doVoise();
        cat2.move();

        dog.move();
        dog2.doVoise();
        dog.sleep();
        cat.sleep();
    }
}
