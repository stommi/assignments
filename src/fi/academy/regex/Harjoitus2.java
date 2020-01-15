package fi.academy.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harjoitus2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> tulokset = new ArrayList<String>();

        String syote = lukija.nextLine();
        Pattern pat = Pattern.compile("Academy");
        Matcher m = pat.matcher(syote);

        for (; m.find(); ) {
            tulokset.add(m.start() + ": " + m.group());
        }
        tulokset.forEach(System.out::println);

    }
}
