package com.burabury.generycznosc.typyGeneryczne.zadanie1;

public class Cabbage extends Food {

    public Cabbage(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("cabbage");
    }
}
