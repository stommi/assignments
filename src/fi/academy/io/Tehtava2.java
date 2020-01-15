package fi.academy.io;
import java.util.Scanner;
import java.io.File;

public class Tehtava2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi);
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
