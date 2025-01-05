package com.teachmeskills.lesson9.homework.work2;

import com.teachmeskills.lesson9.homework.work2.person.Person;

public class Ranner {
    public static void main(String[] args) {

        Person person = new Person("Oleg",32,"pidor");

        System.out.println(person.getAge()+" " + person.getName()+ " " + person.getGender());

    }
}
