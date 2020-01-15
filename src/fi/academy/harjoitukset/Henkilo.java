package fi.academy.harjoitukset;

import java.util.Objects;

public class Henkilo {
    public static int seuraavaId;
    private final int id;

    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.id = seuraavaId++;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        return this.etunimi + " " + this.sukunimi + " " + this.ika + " " + this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Henkilo)) return false;
        Henkilo henkilo = (Henkilo) o;
        return getIka() == henkilo.getIka() &&
                Objects.equals(getEtunimi(), henkilo.getEtunimi()) &&
                Objects.equals(getSukunimi(), henkilo.getSukunimi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEtunimi(), getSukunimi(), getIka());
    }
}
