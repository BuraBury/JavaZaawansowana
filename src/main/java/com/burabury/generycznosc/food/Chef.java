package com.burabury.generycznosc.food;

public class Chef<T extends Food> {

    protected void prepareMeal(T foodToPrepare) {
        foodToPrepare.prepare();
    }
}
