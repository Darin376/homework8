package com.teachmeskills.lesson9.homework.work1;

import com.teachmeskills.lesson9.homework.work1.bildWork.Garage;
import com.teachmeskills.lesson9.homework.work1.bildWork.House;

public class Ranner {
    public static void main(String[] args) {

        Garage garage = new Garage("Garage");
        House house = new House("House");

        System.out.println("Начальный тип здания House: " + house.getType());
        System.out.println("Начальный тип здания Garage: " + garage.getType());

        house.setType("Big House");
        garage.setType("Small Garage");

        System.out.println("\nИзмененный тип здания House: " + house.getType());
        System.out.println("Измененный тип здания Garage: " + garage.getType());
    }
}
