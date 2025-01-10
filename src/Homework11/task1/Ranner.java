package Homework11.task1;

public class Ranner {
    public static void main(String[] args) {
     Person person1 = new Person("oleg",22,321);
     Person person2 = new Person("oleg",22,321);
        System.out.println(person1.toString());
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
