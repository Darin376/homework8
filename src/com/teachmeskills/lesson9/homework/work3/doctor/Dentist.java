package com.teachmeskills.lesson9.homework.work3.doctor;

import com.teachmeskills.lesson9.homework.work3.interseise.Doctor;

import com.teachmeskills.lesson9.homework.work3.patient.Patient;


public class Dentist extends Doctor {
    String name;

    public Dentist(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Дантист " + this.name + " лечит зубы пациента " + patient.name);
    }
}