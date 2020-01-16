package fi.academy.kokoelmat;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class harjoitus5 {
    public static void main(String[] args) {
        List<String> viikonpaivat = new ArrayList<>();

        String ma = "maanantai";
        String ti = "tiistai";
        String ke = "keskiviikko";
        String to = "torstai";
        String pe = "perjantai";
        String la = "lauantai";
        String su = "sunnuntai";

        viikonpaivat.add(ma);
        viikonpaivat.add(ti);
        viikonpaivat.add(ke);
        viikonpaivat.add(to);
        viikonpaivat.add(pe);
        viikonpaivat.add(la);
        viikonpaivat.add(su);

        for (String paiva : viikonpaivat) {
            System.out.println(paiva);
        }

        System.out.println("");

        Iterator<String> iter = viikonpaivat.iterator();

        while (iter.hasNext()) {
            String alkio = iter.next();
            System.out.println(alkio);
            if (alkio.startsWith("t")) {
            iter.remove();
            }
        }

        System.out.println("********");

        for(String paiva: viikonpaivat) {
            System.out.println(paiva);
        }


    }
}

