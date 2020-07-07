package com.burabury.generycznosc.kolekcje.zadanie1;

abstract class Food {
    protected final String name;

    protected Food(String name) {
        this.name = name;
    }

    abstract void prepare();
}

