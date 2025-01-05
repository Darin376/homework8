package com.teachmeskills.lesson9.homework.work5.impl;

import com.teachmeskills.lesson9.homework.work5.cure.Icure;
import com.teachmeskills.lesson9.homework.work5.pacient.Pacient;

public class Terapevt implements Icure {
    @Override
    public void treat(Pacient pacient) {
        System.out.println(pacient.getName() + " treats a Terapevt");
    }

    public void assinDoctor(Pacient pacient) {
        if (pacient.getPlanlecheniya() == 1) {
            pacient.setIcure(new Dantist());
        } else if (pacient.getPlanlecheniya() == 2) {
            pacient.setIcure(new Hirurg());
        } else {
            pacient.setIcure(new Terapevt());
        }
        ;
        pacient.getIcure().treat(pacient);
    }

    ;

}
