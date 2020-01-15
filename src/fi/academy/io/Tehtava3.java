package fi.academy.io;
import java.util.Scanner;
import java.io.File;

public class Tehtava3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mitä tiedostoa tutkitaan");
        String tiedosto = lukija.nextLine();
        int rivienMaara = 0;
        int merkkienMaara = 0;

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi);
                rivienMaara++;
                merkkienMaara+=rivi.length();
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        System.out.println("Tiedostossa on " + rivienMaara + " riviä");
        System.out.println("Tiedostossa on " + +merkkienMaara + " merkkiä");
    }

}
