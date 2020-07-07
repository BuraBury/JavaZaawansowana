package com.burabury.generycznosc.kolekcje.zadanie1;

public class Chef<T extends Food> {

    protected void prepareMeal(T foodToPrepare) {
        foodToPrepare.prepare();
    }
}
