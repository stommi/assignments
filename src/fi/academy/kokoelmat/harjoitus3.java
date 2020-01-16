package fi.academy.kokoelmat;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class harjoitus3 {
    public static void main(String[] args) {
        Queue<String> viikonpaivat = new LinkedList<>();
        Queue<String> viikonpaivat2 = new LinkedList<>();

        String ma = "maanantai";
        String ti = "tiistai";
        String ke = "keskiviikko";
        String to = "torstai";
        String pe = "perjantai";
        String la = "lauantai";
        String su = "sunnuntai";

        viikonpaivat.offer(ma);
        viikonpaivat.offer(ti);
        viikonpaivat.offer(ke);
        viikonpaivat.offer(to);
        viikonpaivat.offer(pe);
        viikonpaivat.offer(la);
        viikonpaivat.offer(su);

        for (String paiva: viikonpaivat) {
            System.out.println(paiva);
        }

        System.out.println("");

        for (String paiva: viikonpaivat) {
            if (!paiva.startsWith("t")) {
                viikonpaivat2.add(paiva);

            }
        }

        for (String paiva: viikonpaivat2) {
            System.out.println(paiva);
        }





    }
}
