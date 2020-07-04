package com.burabury.generycznosc.food;

public class Cabbage extends Food {

    public Cabbage(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("cabbage");
    }
}
