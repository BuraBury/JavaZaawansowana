package com.burabury.zadania.zadanie4;

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
        return "\n\n\tDrzewo " +
                "\nwiecznie zielone: " + wiecznieZielone +
                "\nwysokosc = " + wysokosc +
                "\nprzekroj drzewa " + przekrojDrzewa + "\n";
    }
}
