package fi.academy.io;

import fi.academy.io.domain.Kirjoituskone;
import java.util.Scanner;

public class Tehtava4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kirjoituskone kirjoituskone = new Kirjoituskone();

        System.out.println("Kirjoita tekstiä, kirjoitan sen tiedostoon.");
        String syote = lukija.nextLine();

        kirjoituskone.kirjoita(syote);
    }
}
