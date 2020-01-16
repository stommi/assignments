package fi.academy.kokoelmat;

import java.util.*;

public class harjoitus7 {
    public static void main(String[] args) {
        String[] viikko = {"maanantai", "tiistai", "keskiviikko", "torstai",
                "perjantai", "lauantai", "sunnuntai"};
        List<String> lista = Arrays.asList(viikko);

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");

        lista.sort(Comparator.comparing((String::length)));

        for (String paiva : lista) {
            System.out.println(paiva);
        }

        System.out.println("");



    }
}
