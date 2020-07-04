package com.burabury.generycznosc.zadanie1;

class Nudle extends Food {

    public Nudle(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("nudle");
    }
}
