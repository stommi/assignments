package fi.academy.kokoelmat;

import java.text.DateFormatSymbols;
import java.util.LinkedList;
import java.util.Queue;


public class lisatehtava1 {
    public static void main(String[] args) {
        Queue<String> viikonpaivat = new LinkedList<>();
        Queue<String> viikonpaivat2 = new LinkedList<>();

        DateFormatSymbols paivat = new DateFormatSymbols();


        for (String paiva: paivat.getWeekdays()) {
            viikonpaivat.offer(paiva);

        }

        for (String paiva: viikonpaivat) {
            System.out.println(paiva);
        }

        for (String paiva: viikonpaivat) {
            if (!paiva.startsWith("t")) {
                viikonpaivat2.offer(paiva);
            }
        }

        System.out.println("");

        for (String paiva: viikonpaivat2) {
            System.out.println(paiva);
        }

    }
}

