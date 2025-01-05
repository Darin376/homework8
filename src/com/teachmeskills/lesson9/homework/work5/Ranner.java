package com.teachmeskills.lesson9.homework.work5;
import com.teachmeskills.lesson9.homework.work5.impl.Terapevt;
import com.teachmeskills.lesson9.homework.work5.pacient.Pacient;

public class Ranner {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Pavel",1);
        Pacient pacient2 = new Pacient("Oleg",2);
        Pacient pacient3 = new Pacient("vitaliy",3);

        Terapevt terapevt = new Terapevt();

        terapevt.assinDoctor(pacient1);
        terapevt.assinDoctor(pacient2);
        terapevt.assinDoctor(pacient3);
    }
}
