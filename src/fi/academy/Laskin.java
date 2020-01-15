package fi.academy;

import java.util.Scanner;

public class Laskin {
    public static void main(String[] args) {
        try {
            Scanner lukija = new Scanner(System.in);

            System.out.print("Syötä ensimmäinen luku: ");
            int luku1 = Integer.valueOf(lukija.nextLine());
            System.out.print("Syötä toinen luku: ");
            int luku2 = Integer.valueOf(lukija.nextLine());

            double tulos = 1.0 * luku1 / luku2;

            System.out.println("Tulos on: " + tulos);
        } catch (NumberFormatException e) {
            System.err.println("Tapahtui virhe: " + e.getMessage());
        }

        String[] s = {"10", "5"};
        System.out.println(jakolasku(s));


    }

    public static String jakolasku(String[] args) {
        try {
            int luku1 = Integer.parseInt(args[0]);
            int luku2 = Integer.parseInt(args[1]);
            int tulos = luku1 / luku2;
            return String.format("%d / %d = %d", luku1, luku2, tulos);
        } catch (NumberFormatException e) {
            System.err.println("Tapahtui virhe " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tapahtui virhe " + e.getMessage());
        }
        return "";
    }
}
