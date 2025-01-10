package com.teachmeskills.lesson10.homewotk2;

import com.teachmeskills.lesson10.homewotk2.animals.Animal;
import com.teachmeskills.lesson10.homewotk2.animals.Dog;
import com.teachmeskills.lesson10.homewotk2.animals.Rabbit;
import com.teachmeskills.lesson10.homewotk2.animals.Tiger;

public class Ranner {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Dog dog2 = new Dog("Buddy");
        Animal animal = new Dog("Buddy");
        Animal anima2 = new Dog("Buddy");
        Animal anima3 = new Animal("Buddy");


        System.out.println(animal.hashCode() + " " + anima2.hashCode());

        if (animal.equals(anima2)) {
            System.out.println("start");
        }
//        Tiger tiger = new Tiger("Rajah");
//        Rabbit rabbit = new Rabbit("Fluffy");
//
//
//
//        dog.voice();
//        dog.eat("Meat");
//        dog.eat("Grass");
//
//        System.out.println();
//
//        tiger.voice();
//        tiger.eat("Meat");
//        tiger.eat("Grass");
//
//        System.out.println();
//
//        rabbit.voice();
//        rabbit.eat("Grass");
//        rabbit.eat("Meat");
    }
}
