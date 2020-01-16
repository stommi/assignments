package fi.academy.kokoelmat;

import java.util.HashMap;
import java.util.Map;


public class harjoitus9 {
    public static void main(String[] args) {
        Map<String, String> sanakirja = new HashMap<>();
        sanakirja.put("maanantai", "Monday");
        sanakirja.put("tiistai","Tuesday");
        sanakirja.put("keskiviikko", "Wednesday");
        sanakirja.put("torstai", "Thursday");
        sanakirja.put("perjantai", "Friday");
        sanakirja.put("lauantai", "Saturday");
        sanakirja.put("sunnuntai", "Sunday");

        for (String key : sanakirja.keySet()) {
            System.out.println(key + " " + sanakirja.get(key));
        }

        System.out.println("");

        for (String key : sanakirja.keySet()) {
            String t = sanakirja.get(key).substring(0, 1).toLowerCase();
            System.out.println(key + " " + t+sanakirja.get(key).substring(1));
        }

        System.out.println("");

        for (String key : sanakirja.keySet()) {
            System.out.println(key + " " + sanakirja.get(key));
        }




    }
}
