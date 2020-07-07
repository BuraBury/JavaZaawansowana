package com.burabury.obiektowosc.zadania.zadanie3;

import java.util.Objects;

public class UczenSzkoly extends Uczen {
    private String klasa;

    public UczenSzkoly(String imie, String nazwisko, String pesel, String nazwaSzkoly, String klasa) {
        super(imie, nazwisko, pesel, nazwaSzkoly);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void zmienKlase(String nowaKlasa) {
        this.klasa = nowaKlasa;
    }

    @Override
    public boolean equals(Object o) {
        UczenSzkoly uczen = (UczenSzkoly) o;
        return super.equals(o) &&
                Objects.equals(getKlasa(), uczen.getKlasa());
    }

    @Override
    public String toString() {
        return super.toString() + "\nobecna klasa: " + getKlasa();
    }
}
