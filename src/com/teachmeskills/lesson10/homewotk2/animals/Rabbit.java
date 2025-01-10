package com.teachmeskills.lesson10.homewotk2.animals;

public class Rabbit  extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println(name + " happily munches on " + food);
        } else {
            System.out.println(name + " dislikes " + food);
        }
    }
}
