package com.burabury.zadania.zadanie4;

import java.util.Arrays;

public class Las {
    private Drzewo[] drzewa;

    public Las(Drzewo... drzewa) {
        this.drzewa = drzewa;
    }

    @Override
    public String toString() {
        return "Las{" +
                "drzewa=" + Arrays.toString(drzewa) +
                '}';
    }
}