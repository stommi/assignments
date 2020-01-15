package fi.academy.io;

import fi.academy.io.domain.Kirjoituskone;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tehtava4beta {
    public static void main(String[] args) {
        System.out.println("Kirjoita tekstiä: ");
        try {
            while (true) {
                String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
                FileWriter kirjoittaja = new FileWriter("testailua.txt", true); // Perään kirjoitus
                if (s.equals("")) {
                    break;
                }
                PrintWriter pw = new PrintWriter(kirjoittaja); // Autoflush
                pw.println(s);
                pw.close();
                kirjoittaja.close();
            }

        } catch (Exception e) {
            System.err.println("Tapahtui virhe " + e.getMessage());
        }
    }
}