package com.burabury.obiektowosc.zadania.zadanie4;

public class DrzewoOwocowe extends DrzewoLisciaste {
    private final String nazwaOwoca;

    public DrzewoOwocowe(String name, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(name, wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String getNazwaOwoca() {
        return nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnazwa owoców: " + getNazwaOwoca();
    }

    @Override
    public boolean equals(Object o) {
        DrzewoOwocowe object = (DrzewoOwocowe) o;
        return super.equals(o) && getNazwaOwoca().equals(object.getNazwaOwoca());
    }
}
