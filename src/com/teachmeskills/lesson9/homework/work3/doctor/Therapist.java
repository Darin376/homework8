package com.teachmeskills.lesson9.homework.work3.doctor;

import com.teachmeskills.lesson9.homework.work3.Ranner;
import com.teachmeskills.lesson9.homework.work3.interseise.Doctor;

import com.teachmeskills.lesson9.homework.work3.patient.Patient;

public class Therapist extends Doctor {
    String name;
    public Therapist(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void treat(Patient patient) {
        System.out.println("Терапевт " + this.name + " проводит осмотр и назначает лечение пациенту " + patient.name);
    }
    public void assignDoctor(Patient patient){
        switch (patient.treatmentPlan){
            case 1:
                Surgeon surgeon = new Surgeon("ivanov");
                surgeon.treat(patient);

                break;
            case 2:
                Dentist dentist = new Dentist("Петр Петров");
                dentist.treat(patient);
                break;
            default:
                this.treat(patient);
        }
    }

}
