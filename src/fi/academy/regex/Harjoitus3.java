package fi.academy.regex;

import java.io.*;

public class Harjoitus3 {

    public Harjoitus3() {

    }

    public static boolean isInteger(String ehdokas) {
        for (int i = 0; i < ehdokas.length(); i++)
            if (!Character.isDigit(ehdokas.charAt(i)))
                return false;

        return true;

    }

    //alla oleva ei toimi vielä

    /*public static boolean isDouble(String ehdokas) {
        String[] taulukko = ehdokas.split(".");
        for (int i = 0; i < taulukko[0].length(); i++) {
            if (Character.isDigit(taulukko[0].charAt(i))) {
                for (int b = 0; b < taulukko[1].length(); i++) {
                    if (Character.isDigit(taulukko[1].charAt(i))) {
                        return true;
                    }


                }
            }
        } return false;
    }*/
}
