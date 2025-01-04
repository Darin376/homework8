package teachmeskills.lesson8.example1.homeWork1;

public class Mac extends Computer{
    int age;

    public Mac (String name,int age) {
        super(name);
        this.age = age;
    };

    @Override
    public void getClassName() {
        System.out.println("name " + name + " age  " + age);
    }
}
