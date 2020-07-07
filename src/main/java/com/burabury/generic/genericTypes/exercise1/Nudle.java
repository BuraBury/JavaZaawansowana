package com.burabury.generic.genericTypes.exercise1;

class Nudle extends Food {

    public Nudle(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("nudle");
    }
}
