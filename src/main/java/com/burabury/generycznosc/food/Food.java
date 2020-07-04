package com.burabury.generycznosc.food;

abstract class Food {
    protected final String name;

    protected Food(String name) {
        this.name = name;
    }

    abstract void prepare();
}

