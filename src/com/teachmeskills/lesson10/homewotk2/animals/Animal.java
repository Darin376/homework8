
package com.teachmeskills.lesson10.homewotk2.animals;

import java.util.Objects;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public void voice() {
        System.out.println("Generic animal sound");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
}