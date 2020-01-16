package fi.academy.kokoelmat;
import fi.academy.harjoitukset.domain.Henkilo;

import java.util.ArrayList;
import java.util.List;

public class harjoitus2 {
    public static void main(String[] args) {
        List<Henkilo> henkilot = new ArrayList<>();
        Henkilo h1 = new Henkilo("Jaska", 1, 2, 1980);
        Henkilo h2 = new Henkilo("Pasi", 4, 8, 1990);
        Henkilo h3 = new Henkilo("Liisa", 15, 10, 1975);
        Henkilo h4 = new Henkilo("Teemu", 26, 5, 2002);
        Henkilo h5 = new Henkilo("Jorma", 7, 6, 1985);

        henkilot.add(h1);
        henkilot.add(h2);
        henkilot.add(h3);
        henkilot.add(h4);
        henkilot.add(h5);

        for (Henkilo henkilo: henkilot) {
            System.out.println(henkilo);
        }

        System.out.println("Löytyykö h1 listalta? " + henkilot.contains(h1));

        System.out.println("Listan henkilöiden ikien summa on: " + (h1.getIka()+h2.getIka()+h3.getIka()+h4.getIka()+h5.getIka()) + " vuotta");


    }
}
