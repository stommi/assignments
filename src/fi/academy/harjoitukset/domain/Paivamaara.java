package fi.academy.harjoitukset.domain;

import java.util.Objects;

public class Paivamaara {
    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivamaara(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public void etene() {
        if(this.paiva == 30 && this.kuukausi ==12) {
            this.paiva = 1;
            this.kuukausi = 1;
            this.vuosi++;
        } else if (this.paiva == 30) {
            this.paiva = 1;
            this.kuukausi++;
        } else {
            this.paiva++;
        }
    }

    public void montakoPaivaa(int paivat) {
        int i = 0;
        while (i < paivat) {
            etene();
            i++;
        }
    }

    public int getPaiva() {
        return this.paiva;
    }

    public void setPaiva(int paiva) {
        this.paiva = paiva;
    }

    public int getKuukausi() {
        return kuukausi;
    }

    public void setKuukausi(int kuukausi) {
        this.kuukausi = kuukausi;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }


    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paivamaara)) return false;
        Paivamaara that = (Paivamaara) o;
        return getPaiva() == that.getPaiva() &&
                getKuukausi() == that.getKuukausi() &&
                getVuosi() == that.getVuosi();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaiva(), getKuukausi(), getVuosi());
    }
}
