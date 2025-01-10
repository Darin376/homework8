package com.teachmeskills.lesson10.homewotk2.animals;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Roar!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println(name + " devours " + food);
        } else {
            System.out.println(name + " is not interested in " + food);
        }
    }
}