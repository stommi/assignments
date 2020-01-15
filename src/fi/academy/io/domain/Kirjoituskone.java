package fi.academy.io.domain;


import java.io.FileWriter;
import java.io.Writer;
import java.rmi.server.ExportException;

public class Kirjoituskone {

    public Kirjoituskone() {

    }

    public void kirjoita(String teksti) {
        try {
            FileWriter kirjoittaja = new FileWriter("kirja.txt");
            kirjoittaja.write(teksti);
            kirjoittaja.close();
        } catch (Exception e) {
            System.err.println("Tapahtui virhe " + e.getMessage());
        }
    }
}



