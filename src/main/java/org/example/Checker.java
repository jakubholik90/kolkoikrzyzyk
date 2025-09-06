package org.example;

public class Checker {
    public Pole poleA;
    public Pole poleB;
    public Pole poleC;

    public boolean checker(Pole poleA, Pole poleB, Pole poleC) {
        if (poleA.getPoleValue().equals(poleB.getPoleValue()) && poleA.getPoleValue().equals(poleC.getPoleValue())) {
            return true;
        } else {
            return false;
        }
    }
}
