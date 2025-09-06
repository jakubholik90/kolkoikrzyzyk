package org.example;

public class Pole {

    public int poleNumber;
    private boolean poleFilled = false;
    public String poleValue;


    public Pole(int poleNumber, String poleValue) {
        this.poleNumber = poleNumber;
        this.poleValue = poleValue;
    }

    public void setPoleValue(String poleValue) {
        if (poleFilled == false) {
            this.poleValue = poleValue;
            poleFilled=true;
        }
    }

    public boolean checkPoleFilled () {
        return poleFilled;
    }

    public String getPoleValue() {
        return poleValue;
    }
}
