package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tablica {
    private Checker checker = new Checker();

    private final String kreskaPion = " | ";
    private final String kreskaPoziom = "----------";


    private Pole pole1 = new Pole(1,"1");
    private Pole pole2 = new Pole(2,"2");
    private Pole pole3 = new Pole(3,"3");
    private Pole pole4 = new Pole(4,"4");
    private Pole pole5 = new Pole(5,"5");
    private Pole pole6 = new Pole(6,"6");
    private Pole pole7 = new Pole(7,"7");
    private Pole pole8 = new Pole(8,"8");
    private Pole pole9 = new Pole(9,"9");



    public void displayTablica () {
        System.out.println(pole1.getPoleValue() + kreskaPion + pole2.getPoleValue() + kreskaPion + pole3.getPoleValue());
        System.out.println(kreskaPoziom);
        System.out.println(pole4.getPoleValue() + kreskaPion + pole5.getPoleValue() + kreskaPion + pole6.getPoleValue());
        System.out.println(kreskaPoziom);
        System.out.println(pole7.getPoleValue() + kreskaPion + pole8.getPoleValue() + kreskaPion + pole9.getPoleValue());
    }

    public boolean writeTablica (int poleNumber, String poleValue) {
        if (poleNumber < 1 || poleNumber > 9) {
            return false;
        } else {
            switch (poleNumber) {
                case (1) -> {
                    if (pole1.checkPoleFilled()) {
                        return false;
                    } else {
                        pole1.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (2) -> {
                    if (pole2.checkPoleFilled()) {
                        return false;
                    } else {
                        pole2.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (3) -> {
                    if (pole3.checkPoleFilled()) {
                        return false;
                    } else {
                        pole3.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (4) -> {
                    if (pole4.checkPoleFilled()) {
                        return false;
                    } else {
                        pole4.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (5) -> {
                    if (pole5.checkPoleFilled()) {
                        return false;
                    } else {
                        pole5.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (6) -> {
                    if (pole6.checkPoleFilled()) {
                        return false;
                    } else {
                        pole6.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (7) -> {
                    if (pole7.checkPoleFilled()) {
                        return false;
                    } else {
                        pole7.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (8) -> {
                    if (pole8.checkPoleFilled()) {
                        return false;
                    } else {
                        pole8.setPoleValue(poleValue);
                        return true;
                    }
                }
                case (9) -> {
                    if (pole9.checkPoleFilled()) {
                        return false;
                    } else {
                        pole9.setPoleValue(poleValue);
                        return true;
                    }
                }
                default -> {
                    return false;
                }

            }

        }


    }

    public Tablica() {}



    public String getValue (int poleNumber) {
        if (poleNumber < 1 || poleNumber > 9) {
            return "Numer niepoprawny";
        } else {
            switch (poleNumber) {
                case (1) -> {
                    return pole1.getPoleValue();
                }
                case (2) -> {
                    return pole2.getPoleValue();
                }
                case (3) -> {
                    return pole3.getPoleValue();
                }
                case (4) -> {
                    return pole4.getPoleValue();
                }
                case (5) -> {
                    return pole5.getPoleValue();
                }
                case (6) -> {
                    return pole6.getPoleValue();
                }
                case (7) -> {
                    return pole7.getPoleValue();
                }
                case (8) -> {
                    return pole8.getPoleValue();
                }
                case (9) -> {
                    return pole9.getPoleValue();
                }
                default -> {
                    return "";
                }
            }
        }

    }

    public boolean tablicaChecker123() {
        return checker.checker(pole1,pole2,pole3);
    }
    public boolean tablicaChecker456() {
        return checker.checker(pole4,pole5,pole6);
    }
    public boolean tablicaChecker789() {
        return checker.checker(pole7,pole8,pole9);
    }
    public boolean tablicaChecker147() {
        return checker.checker(pole1,pole4,pole7);
    }
    public boolean tablicaChecker258() {
        return checker.checker(pole2,pole5,pole8);
    }
    public boolean tablicaChecker369() {
        return checker.checker(pole3,pole6,pole9);
    }
    public boolean tablicaChecker159() {
        return checker.checker(pole1,pole5,pole9);
    }
    public boolean tablicaChecker753() {
        return checker.checker(pole7,pole5,pole3);
    }


}
