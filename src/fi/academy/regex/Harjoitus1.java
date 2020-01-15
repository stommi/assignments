package fi.academy.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Harjoitus1 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String tunnus = lukija.nextLine();

        String ehto1 = "[0-9]{6}-[0-9]{3}[A-Z]{1}";
        String ehto2 = "[0-9]{6}[A-Z]{1}[0-9]{4}";

        Pattern pat = Pattern.compile(ehto1);
        Pattern pat2 = Pattern.compile(ehto2);

        Matcher m = pat.matcher(tunnus);
        Matcher n = pat2.matcher(tunnus);

        if (m.matches() || n.matches()){
            System.out.println("Muoto on oikea");
        }

        //heihei


        /*System.out.print("Anna tunnus: ");
        String htunnus = lukija.nextLine();
        if (!htunnus.matches("[0-9]{6}(-|[A-Z])[0-9]{3}[A-Z]{1}")) {

            System.out.println("Muoto ei ole oikea");
        }*/




        //UUSI tunnus ""[0-9]{6}-[0-9]{3}[A-Z]{1}"
        //VANHA tunnus "[0-9]{6}[A-Z]{1}[0-9]{4}"


    }
}
