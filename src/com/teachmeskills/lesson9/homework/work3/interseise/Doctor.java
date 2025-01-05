package com.teachmeskills.lesson9.homework.work3.interseise;

import com.teachmeskills.lesson9.homework.work3.patient.Patient;

public class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat(Patient patient ) {
        System.out.println(this.name + " лечит пациента " + patient.name);
    }
}