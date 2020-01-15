package fi.academy.io;

import java.io.File;

public class Tehtava1 {
    public static void main(String[] args) {
        File hakemisto = new File(".");
        File[] tiedostoListaus = hakemisto.listFiles();

        System.out.println("Alla kaikki kansiossa olevat tiedostot ja kansiot");

        for (int i = 0; i < tiedostoListaus.length; i++) {
            System.out.println(tiedostoListaus[i].getName());
        }

        System.out.println("");
        System.out.println("Alla pelkät tiedostot");


        for (int i = 0; i < tiedostoListaus.length; i++) {
            if (tiedostoListaus[i].isFile()) {
                System.out.println(tiedostoListaus[i].getName());
            }
        }
    }
}


