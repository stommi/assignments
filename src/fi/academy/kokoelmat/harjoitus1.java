package fi.academy.kokoelmat;

import java.util.ArrayList;
import java.util.List;

public class harjoitus1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Jaska");
        lista.add("Pasi");
        lista.add("Nina");
        lista.add("Pekka");
        lista.add("Harri");

        for (String nimi: lista) {
            System.out.println(nimi);
        }

    }
}
