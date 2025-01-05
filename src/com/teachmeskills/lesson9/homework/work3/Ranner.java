package com.teachmeskills.lesson9.homework.work3;

import com.teachmeskills.lesson9.homework.work3.doctor.Therapist;

import com.teachmeskills.lesson9.homework.work3.patient.Patient;

public class Ranner {
    public static void main(String[] args) {
        Patient patient = new Patient("Андрей Сидоров", 1);
        Therapist therapist = new Therapist("Сергей Сергеев");
        therapist.assignDoctor(patient);

        Patient patient2 = new Patient("Анна Иванова", 2);
        therapist.assignDoctor(patient2);

        Patient patient3 = new Patient("Петр Петров", 3);
        therapist.assignDoctor(patient3);
    }
}
