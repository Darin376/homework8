package teachmeskills.lesson8.example1.homeWork1;

public class Hp extends Computer {
    int age;


    public Hp(String name, int age) {
        super(name);
        this.age = age;
    }


    @Override
    public void getClassName() {
        System.out.println(super.name + " age " + age);
    }
}
