package com.teachmeskills.lesson10.homewotk2.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println(name + " happily eats " + food);
        } else {
            System.out.println(name + " doesn't like " + food);
        }
    }

}
