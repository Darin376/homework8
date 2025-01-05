package com.teachmeskills.lesson9.homework.work3.doctor;


import com.teachmeskills.lesson9.homework.work3.interseise.Doctor;

import com.teachmeskills.lesson9.homework.work3.patient.Patient;

class Surgeon extends Doctor {
    String name;
    public Surgeon(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Хирург " + this.name + " выполняет операцию у пациента " + patient.name);
    }
}

