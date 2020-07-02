package com.burabury.zadania.zadanie3;

import java.util.Objects;

public class Uczen extends Osoba {
     private String nazwaSzkoly;

    public Uczen(String imie, String nazwisko, String pesel, String nazwaSzkoly) {
        super(imie, nazwisko, pesel);
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public String getNazwaSzkoly() {
        return nazwaSzkoly;
    }

    public void zmienSzkole(String nowaSzkola) {
        this.nazwaSzkoly = nowaSzkola;
    }

    @Override
    public String toString() {
        return super.toString() + "\n obecna szkoła: " + getNazwaSzkoly();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Uczen uczen = (Uczen) o;
        return Objects.equals(getImie(), uczen.getImie()) &&
                Objects.equals(getNazwisko(), uczen.getNazwisko()) &&
                Objects.equals(getNazwaSzkoly(), uczen.getNazwaSzkoly());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNazwaSzkoly());
    }


}
