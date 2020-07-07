package com.burabury.obiektowosc.zadania.zadanie4;

public class DrzewoLisciaste extends Drzewo {
    private final int ksztaltLiscia;

    public DrzewoLisciaste(String name, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(name, wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public int getKsztaltLiscia() {
        return ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + "kształt ulistnienia: " + getKsztaltLiscia();
    }
}
