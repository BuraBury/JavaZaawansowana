package com.burabury.generycznosc.food;

class Nudle extends Food {

    public Nudle(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("nudle");
    }
}
