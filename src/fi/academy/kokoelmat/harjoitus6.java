package fi.academy.kokoelmat;

import java.util.*;

public class harjoitus6 {
    public static void main(String[] args) {
        String[] viikko = {"maanantai", "tiistai", "keskiviikko", "torstai",
                "perjantai", "lauantai", "sunnuntai"};
        List<String> lista = Arrays.asList(viikko);
        List<String> lista2 = new ArrayList<>();

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //1.Vaihda sunnuntai ensimmäiseksi viikonpäiväksi käyttäen rotate() metodia
        Collections.rotate(lista, 1);

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //2.Järjestä lista sort() metodilla
        Collections.sort(lista);

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //3. Muuta torstai alkamaan isolla alkukirjaimella
        Collections.replaceAll(lista, "torstai", "Torstai");

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //4. Järjestä lista, taas sort()
        Collections.sort(lista);

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //5. Sotke järjestys käyttäen shuffle()-metodia

        Collections.shuffle(lista);

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        //6. Lisää uudeksi viikonpäiväksi listan alkuun "äläpäivä"

        Collections.addAll(lista2, "äläpäivä");

        for (String paiva : lista) {
            lista2.add(paiva);
        }

        for (String paiva : lista2) {
            System.out.println(paiva);
        }

        System.out.println("");

        //7.Järjestä lista taas, toimiiko järjestys oikein? Tai lähinnä: millä
        //perusteella järjestys on mikä on
        Collections.sort(lista2);

        for (String paiva : lista2) {
            System.out.println(paiva);
        }


    }
}
