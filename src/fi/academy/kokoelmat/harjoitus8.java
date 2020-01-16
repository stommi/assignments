package fi.academy.kokoelmat;

import fi.academy.harjoitukset.domain.Henkilo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class harjoitus8 {
    public static void main(String[] args) {
        List<Henkilo> lista = new ArrayList<>();

        Henkilo h1 = new Henkilo("Jaska", 1, 2, 1980);
        Henkilo h2 = new Henkilo("Pasi", 4, 8, 1990);
        Henkilo h3 = new Henkilo("Liisa", 15, 10, 1975);
        Henkilo h4 = new Henkilo("Teemu", 26, 5, 2002);
        Henkilo h5 = new Henkilo("Jorma", 7, 6, 1985);

        h1.setSukunimi("Litmanen");
        h2.setSukunimi("Koistinen");
        h3.setSukunimi("Järvinen");
        h4.setSukunimi("Aapinen");
        h5.setSukunimi("Kaunanen");


        lista.add(h1);
        lista.add(h2);
        lista.add(h3);
        lista.add(h4);
        lista.add(h5);



        for (Henkilo henkilo: lista) {
            System.out.println(henkilo);

        }

        System.out.println("");

        //järjestäminen etunimen perusteella
        lista.sort(Comparator.comparing((Henkilo::getEtunimi)));

        for (Henkilo henkilo: lista) {
            System.out.println(henkilo);
        }

        System.out.println("");

        //järjestäminen sukunimen perusteella
        lista.sort(Comparator.comparing((Henkilo::getSukunimi)));

        for (Henkilo henkilo: lista) {
            System.out.println(henkilo);
        }

        System.out.println("");

        //järjestäminen iän perusteella
        lista.sort(Comparator.comparing((Henkilo::getIka)));

        for (Henkilo henkilo: lista) {
            System.out.println(henkilo);
        }

        System.out.println("");

    }
}
