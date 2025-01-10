package com.teachmeskills.lesson9.homework.work5.pacient;
import com.teachmeskills.lesson9.homework.work5.cure.Icure;

public class Pacient {

    private String name;
    private int planlecheniya;
    private Icure icure;

    public Pacient(String name, int planlecheniya) {
        this.name = name;
        this.planlecheniya = planlecheniya;
    }

    public String getName() {
        String s = "Pacient "+ name;
        System.out.println(icure);
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlanlecheniya() {
        System.out.println(planlecheniya);
        return planlecheniya;
    }

    public void setPlanlecheniya(int planlecheniya) {
        this.planlecheniya = planlecheniya;
    }

    public Icure getIcure() {
        return icure;
    }

    public void setIcure(Icure doctor) {
        this.icure = doctor;
    }


}
