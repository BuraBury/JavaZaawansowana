package com.burabury.objects.exercises.zadanie3;

import java.util.Objects;

public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final String pesel;

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String przedstawSie() {
        return String.format("Dzień dobry, \n\tnazywam się %s %s", getImie(), getNazwisko());
    }

    @Override
    public String toString() {
        return
                "imie : " + imie + '\n' +
                "nazwisko : " + nazwisko + '\n' +
                "pesel : " + pesel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, pesel);
    }
}
