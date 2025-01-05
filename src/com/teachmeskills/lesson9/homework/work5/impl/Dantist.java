package com.teachmeskills.lesson9.homework.work5.impl;

import com.teachmeskills.lesson9.homework.work5.cure.Icure;
import com.teachmeskills.lesson9.homework.work5.pacient.Pacient;

public class Dantist implements Icure {


    @Override
    public void treat(Pacient pacient) {
        System.out.println(pacient.getName() + " treats a Dantist");
    }
}
