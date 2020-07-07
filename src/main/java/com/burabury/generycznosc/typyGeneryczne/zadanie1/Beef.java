package com.burabury.generycznosc.typyGeneryczne.zadanie1;

public class Beef extends Food {

    public Beef(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("beef");
    }
}
