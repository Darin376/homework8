package teachmeskills.lesson8.example1.inetveiseWork;

public class Dog implements IVoise {
    private String name;
    private int age;
    private String overName;
    private String breet;

    public Dog(String name, int age, String overName, String breet) {
        this.name = name;
        this.age = age;
        this.overName = overName;
        this.breet = breet;
    }

    @Override
    public void doVoise() {
        System.out.println("Bark Bark");
    }

    @Override
    public void move() {
        System.out.println("Run fast");
    }
}
