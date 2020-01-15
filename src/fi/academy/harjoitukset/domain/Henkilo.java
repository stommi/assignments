package fi.academy.harjoitukset.domain;

import java.time.LocalDate;
import fi.academy.harjoitukset.domain.Paivamaara;
import java.time.Period;

public class Henkilo {

    private String etunimi;
    private String sukunimi;
    private Paivamaara syntymaaika;

    public Henkilo(String etunimi) {
        this.etunimi = etunimi;
        this.sukunimi = null;

    }

    public Henkilo(String etunimi, int paiva, int kuukausi, int vuosi) {
        this.etunimi = etunimi;
        this.syntymaaika = new Paivamaara(paiva, kuukausi, vuosi);
    }

    public void setSyntymaaika(int paiva, int kuukausi, int vuosi) {
        this.syntymaaika = new Paivamaara(paiva, kuukausi, vuosi);
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getEtunimi() {
        return this.etunimi;
    }

    public String getSukunimi() {
        return this.sukunimi;
    }

    public Paivamaara getSyntymaaika() {
        return this.syntymaaika;
    }

    public int getIka() {
        LocalDate syntynyt = LocalDate.of(getSyntymaaika().getVuosi(), getSyntymaaika().getKuukausi(), getSyntymaaika().getPaiva());
        LocalDate now = LocalDate.now();
        Period diff = Period.between(syntynyt, now);
        int ika = diff.getYears();
        return ika;
    }


    @Override
    public String toString() {
        return this.etunimi + " " + this.sukunimi + " on syntynyt " + this.syntymaaika;
    }
}
