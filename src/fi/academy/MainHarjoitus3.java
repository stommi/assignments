package fi.academy;

import fi.academy.regex.Harjoitus3;
import java.util.Scanner;

public class MainHarjoitus3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Harjoitus3 testi = new Harjoitus3();

        System.out.print("Syötä luku, kerron onko se Integer: ");
        String syote = lukija.nextLine();

        System.out.println(testi.isInteger(syote));


    }
}
