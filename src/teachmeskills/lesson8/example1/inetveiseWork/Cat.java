package teachmeskills.lesson8.example1.inetveiseWork;

public class Cat implements IVoise {
    private String name;
    private int age;
    private String ownerName;

    Cat(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
    }

    @Override
    public void doVoise() {
        System.out.println("Meoooowwwww");
    }

    @Override
    public void move() {
        System.out.println("Тыгыдыг в 4 утра ");

    }
}
