package fi.academy;

import fi.academy.harjoitukset.domain.Paivamaara;
import fi.academy.harjoitukset.domain.Henkilo;

public class Main {
    public static void main(String[] args) {
        Paivamaara testi = new Paivamaara(16, 8, 1980);
        Henkilo h1 = new Henkilo("Jaska", 12, 1, 1981);
        Henkilo h2 = new Henkilo("Jorma");


        h1.setSukunimi("Litmanen");

        System.out.println(testi);
        testi.etene();
        System.out.println(testi);
        testi.montakoPaivaa(30);
        System.out.println(testi);
        testi.montakoPaivaa(150);
        System.out.println(testi);

        System.out.println(h1);
        System.out.println(h2);

        h2.setSyntymaaika(8, 9, 1976);
        h2.setSukunimi("Metsala");

        System.out.println(h2);

        System.out.println(h1.getSyntymaaika());

        System.out.print(h1);
        System.out.println(" hänen ikänsä on " + h1.getIka() + " vuotta");




    }
}
