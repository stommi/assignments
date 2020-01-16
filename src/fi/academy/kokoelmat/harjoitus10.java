package fi.academy.kokoelmat;

import fi.academy.harjoitukset.domain.Henkilo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class harjoitus10 {
    public static void main(String[] args) {
        Map<String, List<Henkilo>> lista = new HashMap<>();
        List<Henkilo> henkilot = new ArrayList<>();

        Henkilo h1 = new Henkilo("Jaska", 2, 7, 1975);
        Henkilo h2 = new Henkilo("Pasi", 3,4,1980);

        henkilot.add(h1);
        henkilot.add(h2);





    }
}
