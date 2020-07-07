package com.burabury.obiektowosc.zadania.zadanie4;

import java.util.Objects;

public class Drzewo {
    private final String name;
    private final boolean wiecznieZielone;
    private int wysokosc;
    private final String przekrojDrzewa;

    public Drzewo(String name, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.name = name;
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "\n\n\tDrzewo " + name +
                "\nwiecznie zielone: " + wiecznieZielone +
                "\nwysokosc = " + wysokosc +
                "\nprzekroj drzewa: " + przekrojDrzewa + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drzewo drzewo = (Drzewo) o;
        return wiecznieZielone == drzewo.wiecznieZielone &&
                Objects.equals(name, drzewo.name) &&
                Objects.equals(przekrojDrzewa, drzewo.przekrojDrzewa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wiecznieZielone, przekrojDrzewa);
    }
}
