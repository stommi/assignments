package fi.academy.kokoelmat;

import java.util.Queue;
import java.util.LinkedList;

public class harjoitus4 {
    public static void main(String[] args) {
        Queue<String> nimet = new LinkedList<>();

        nimet.offer("Jaska");
        nimet.offer("Pasi");
        nimet.offer("Nina");
        nimet.offer("Pekka");
        nimet.offer("Harri");

        for (String nimi : nimet) {
            System.out.println(nimi);
        }

    }
}


