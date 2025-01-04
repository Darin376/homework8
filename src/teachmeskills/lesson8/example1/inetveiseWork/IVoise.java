package teachmeskills.lesson8.example1.inetveiseWork;

public interface IVoise {
    public void doVoise();

    public void move();

    default void sleep() {
        System.out.println("sleep");
    }

    ;


}
